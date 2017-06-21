package snackDown;

import java.util.Scanner;

class SnSocial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] a = new int[n][m];
			int[][] h = new int[n][m];
			int max = 0;
			for(int i=0; i<n; i++)
				for(int j=0; j<m; j++)
				{
					a[i][j] = sc.nextInt();
					if(a[i][j] > max)
						max = a[i][j];
				}
			int hour = 1;
			for(int i=0; i<n; i++)
				for(int j=0; j<m; j++)
					if(a[i][j] == max)
						h[i][j] = hour;
					else
						h[i][j] = 0;
			
			while(true)
			{
				int flag = 0;
				for(int i=0; i<n; i++)
					for(int j=0; j<m; j++)
						if(h[i][j] == hour)
						{
							if(i>0 && j>0 && a[i-1][j-1] != max)
							{
								a[i-1][j-1] = max;
								h[i-1][j-1] += hour + 1;
								flag = 1;
							}
							if(i>0 && a[i-1][j] != max)
							{
								a[i-1][j] = max;
								h[i-1][j] = hour + 1;
								flag = 1;
							}
							if(i>0 && j<m-1 && a[i-1][j+1] != max)
							{
								a[i-1][j+1] = max;
								h[i-1][j+1] = hour + 1;
								flag = 1;
							}
							if(j<m-1 && a[i][j+1] != max)
							{
								a[i][j+1] = max;
								h[i][j+1] = hour + 1;
								flag = 1;
							}
							if(i<n-1 && j<m-1 && a[i+1][j+1] != max)
							{
								a[i+1][j+1] = max;
								h[i+1][j+1] = hour + 1;
								flag = 1;
							}
							if(i<n-1 && a[i+1][j] != max)
							{
								a[i+1][j] = max;
								h[i+1][j] = hour + 1;
								flag = 1;
							}
							if(i<n-1 && j>0 && a[i+1][j-1] != max)
							{
								a[i+1][j-1] = max;
								h[i+1][j-1] = hour + 1;
								flag = 1;
							}
							if(j>0 && a[i][j-1] != max)
							{
								a[i][j-1] = max;
								h[i][j-1] = hour + 1;
								flag = 1;
							}
						}
				if(flag == 0)
					break;
				hour++;
			}
			System.out.println(hour-1);
		}
		sc.close();
	}

}
