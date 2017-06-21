package snackDown;

import java.util.Scanner;

public class SnGraph 
{
	private static long startTime = System.currentTimeMillis();
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[][] graph = new int[n][n];
			int[] degree = new int[n];
			for(int i=0; i<n; i++)
			{
				
				degree[i] = 0;
			}
			/*
			System.out.println();
			for(int i=0; i<n; i++)
				System.out.print(degree[i] + " ");
			*/
			int[][] setOfEdges = new int[m][2];
			for(int i=0; i<m; i++)
				for(int j=0; j<2; j++)
				{
					setOfEdges[i][j] = sc.nextInt();
					degree[setOfEdges[i][j]-1]++;
					if(j==1 && setOfEdges[i][0]>setOfEdges[i][1])
					{
						setOfEdges[i][0] += setOfEdges[i][1];
						setOfEdges[i][1] = setOfEdges[i][0] - setOfEdges[i][1];
						setOfEdges[i][0] -= setOfEdges[i][1];
					}
				}
			/*
			System.out.println();
			for(int i=0; i<m; i++)
				System.out.println(setOfEdges[i][0] + " " + setOfEdges[i][1]);
			
			for(int i=2; i<=n; i++)
			{
				int flag = 0;
				for(int j=0; j<m; j++)
				{
					if(flag==0 && setOfEdges[j][1]==i)
						flag = 1;
					else if(setOfEdges[j][1] == i)
					{
						degree[setOfEdges[j][0]-1]--;
						degree[setOfEdges[j][1]-1]--;
						setOfEdges[j][0] = setOfEdges[j][1] = 0; 
					}
				}
			}
			
			System.out.println();
			for(int i=0; i<n; i++)
				System.out.print(degree[i] + " ");
			*/
			for(int i=0; i<m-1; i++)
				for(int j=i+1; j<m; j++)
					if(setOfEdges[j][1]==setOfEdges[i][1] && setOfEdges[j][1]!=0)
					{
						degree[setOfEdges[j][0]-1]--;
						degree[setOfEdges[j][1]-1]--;
						setOfEdges[j][0] = setOfEdges[j][1] = 0; 
					}	
			/*
			System.out.println();
			for(int i=0; i<m; i++)
				System.out.println(setOfEdges[i][0] + " " + setOfEdges[i][1]);
			
			System.out.println();
			for(int i=0; i<n; i++)
				System.out.print(degree[i] + " ");
			*/
			int[] visited = new int[m];
			int d = 0;
			while(d < n)
			{
				int count = 0;
				for(int i=0; i<m; i++)
					visited[i] = 0;
				for(int i=0; i<n; i++)
					if(degree[i] <= d)
						for(int j=0; j<m; j++)
							if((setOfEdges[j][0]==i+1 || setOfEdges[j][1]==i+1) && visited[j] == 0)
							{
								visited[j] = 1;
								count++;
							}
				System.out.print(count + " ");
				d++;
			}
			
			/*
			for(int i=0; i<m; i++)
			{
				int u = sc.nextInt();
				int v = sc.nextInt();
				graph[u-1][v-1] = graph[v-1][u-1] = 1;
				degree[u-1]++;
				degree[v-1]++;
			}		
			
			for(int i=0; i<n; i++)
				System.out.print(degree[i] + " ");
			
			for(int i=2; i<n; i++)
			{
				int flag = 0;
				for(int j=0; j<i; j++)
				{
					if(flag == 0 && graph[i][j] == 1)
						flag = 1;
					else if(graph[i][j] == 1)
					{
						graph[i][j] = 0;
						degree[i]--;
						degree[j]--;
					}
				}
			}
			
			System.out.println();
			for(int i=0; i<n; i++)
				System.out.print(degree[i] + " ");
			
			
			for(int i=1; i<n; i++)
				for(int j=i+1; j<n; j++)
					for(int k=0; k<i; k++)
						if(graph[k][j] == 1)
						{
							graph[i][j] = 0;
							degree[i]--;
							degree[j]--;
						}
			
			int max = 0;
			for(int i=0; i<n; i++)
				if(degree[i] > max)
					max = degree[i];
			
			System.out.println();
			int d = 0;
			while(d < n)
			{
				int count = 0;
				for(int i=0; i<n; i++)
					if((degree[i] <= d) && )
						count++;
				System.out.print(count + " ");
				d++;
			}
			*/
			
		}
		sc.close();
		long endTime = System.currentTimeMillis();
        System.out.println("\n\nIt took " + (endTime - startTime) + " milliseconds");
	}
}
