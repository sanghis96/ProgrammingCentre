package march17;

import java.util.Scanner;

class ShortestPath
{
	int V;
	ShortestPath(int n)
	{	V = n;	}
	int minDistance(int dist[], Boolean sptSet[])
	{
		int min = Integer.MAX_VALUE, min_index=-1;
		
		for (int v = 0; v < V; v++)
			if (sptSet[v] == false && dist[v] <= min)
			{
				min = dist[v];
				min_index = v;
			}
		return min_index;
	}	
	int dijkstra(int graph[][], int src)
	{
		int dist[] = new int[V];
	     
	    Boolean sptSet[] = new Boolean[V];
	
	    for (int i = 0; i < V; i++)
	    {
	        dist[i] = Integer.MAX_VALUE;
	        sptSet[i] = false;
	    }
	
	    dist[src] = 0;
	
	    for (int count = 0; count < V-1; count++)
	    {
	        int u = minDistance(dist, sptSet);
	        sptSet[u] = true;
	
	        for (int v = 0; v < V; v++)
	            if (!sptSet[v] && graph[u][v]!=0 && dist[u] != Integer.MAX_VALUE && dist[u]+graph[u][v] < dist[v])
	                dist[v] = dist[u] + graph[u][v];
	    }
	    
	    int sum = 0;
	    for (int i=src; i<V; i++)
	    	sum += dist[i];
	    
	    return sum;	   	 
	}
}

class SUMDIS
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int[][] G = new int[n][n];
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					G[i][j] = 0;
			for(int i=0; i<n-1; i++)
				G[i][i+1] = sc.nextInt();
			for(int i=0; i<n-2; i++)
				G[i][i+2] = sc.nextInt();
			for(int i=0; i<n-3; i++)
				G[i][i+3] = sc.nextInt();
			int sum = 0;
			ShortestPath t = new ShortestPath(n);
		    for(int i=0; i<n-1; i++)
		    	sum += t.dijkstra(G, i);
			System.out.println(sum);
		}
		sc.close();
	}
}