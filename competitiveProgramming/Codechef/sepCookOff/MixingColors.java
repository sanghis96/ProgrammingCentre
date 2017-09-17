package sepCookOff;

import java.io.*;

class MixingColors {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		String[] s1 = br.readLine().split(" ");
		int n = Integer.parseInt(s1[0]);
		int[][] grid = new int[n][n];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				grid[i][j] = -1;
		int m = Integer.parseInt(s1[1]);
		while(m-- > 0) {
			String[] s2 = br.readLine().split(" ");
			int type = Integer.parseInt(s2[0]);
			int idx = Integer.parseInt(s2[1]);
			int color = Integer.parseInt(s2[2]);
			if(type == 1) {
				for(int i=0; i<n; i++)
					grid[idx-1][i] = mixColor(grid[idx-1][i], color);
			} else if(type == 2) {
				for(int i=0; i<n; i++)
					grid[i][idx-1] = mixColor(grid[i][idx-1], color);
			} else {
				int i, j;
				if(idx <= n+1) {
					i = idx-2;
					j = 0;
				} else {
					i = n-1;
					j = idx-n-1;
				}
				while(i>=0 && j<n) {
					grid[i][j] = mixColor(grid[i][j], color);
					i--;
					j++;
				}
			}
		}
		int countN=0, countR=0, countG=0, countY=0;
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++) {
				if(grid[i][j] == -1) countN++;
				else if(grid[i][j] == 0) countG++;
				else if(grid[i][j] == 1) countR++;
				else countY++;
			}
		System.out.println(countN + " " + countR + " " + countG + " " + countY);	
		

	}
	private static int mixColor(int x, int y) {
		if(x==2 || y==2) return 2;
		if((x==1 && y==0) || (x==0 && y==1)) return 2;
		if(x==1 && y==1) return 1;
		if(x==0 && y==0) return 0;
		return y;		
	}

}
