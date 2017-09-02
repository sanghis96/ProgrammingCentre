package codeAgon;

import java.util.Scanner;

public class CountingPrincessPresents {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0) {
        	int n = in.nextInt();
        	int[][] graph = new int[n][n];
        	for(int i=0; i<n; i++)
        		for(int j=0; j<n; j++)
        			graph[i][j] = -1;
            for(int i=0; i<n-1; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                int g = in.nextInt();
                graph[u][v] = graph[v][u] = g;
            }
        }
        in.close();
    }
}
