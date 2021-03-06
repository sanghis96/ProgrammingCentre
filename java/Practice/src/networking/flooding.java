package networking;

import java.util.*;

class flooding
{
    private static Scanner sc;
    private static int[] copies;
    
	static int hopCount(int[][] m, int n)
    {
        int h=0;
        for(int i=0; i<n; i++)
        	for(int j=0; j<n; j++)
                h += m[i][j];
        h -= n;
        h = (h%2 == 0) ? h/2 : h/2+1;
        return h;
    }    
    
    static void FloodAlgo(int[][] m, int n, int s, int d, int h)
    {
        if(h==0 || s==d)
        	return;
        for(int i=0; i<n; i++)
            if(m[s][i]==1)
            {
            	System.out.print(i + "  ");
            	copies[i]++;
            }
        System.out.println();
        for(int i=0; i<n; i++)
            if(m[s][i]==1)
            	FloodAlgo(m, n, i, d, (h-1));
    }
    
    public static void main(String args[])
    {
        sc = new Scanner(System.in);
        System.out.print("Enter Number of nodes in network: ");
        int n = sc.nextInt();
        System.out.println("Enter the network Matrix:-");
        int[][] network = new int[n][n];
        for(int i=0; i<n; i++)
        	for(int j=0; j<n; j++)
        		network[i][j] = sc.nextInt();
        
        copies = new int[n];
        for(int i=0; i<n; i++)
        	copies[i] = 0;
        
        int h = hopCount(network, n);
        System.out.println("Maxium Life of packet: " + h);
        
        System.out.print("Enter the source node: ");
        int src = sc.nextInt();
        System.out.print("Enter the destination node: ");
        int des = sc.nextInt();
        
        copies[src]++;
        FloodAlgo(network, n, src, des, h);
        
        System.out.println("\nNo. of copies of packet in each node:-");
        for(int i=0; i<n; i++)
        	System.out.print(i + "\t");
        System.out.println();
        for(int i=0; i<n; i++)
        	System.out.print(copies[i] + "\t");
    }
}