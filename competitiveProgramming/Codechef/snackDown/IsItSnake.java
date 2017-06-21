package snackDown;

import java.util.Scanner;

public class IsItSnake
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			char[][] plate = new char[2][n];
			
			for(int i=0; i<2; i++)
			{
			    String temp = sc.next();
			    plate[i] = temp.toCharArray();
			}
			
			int u=0, v, flag=0;;
			for(v=0; v<n; v++)
			{
				for(u=0; u<2; u++)
					if(plate[u][v] == '#')
					{
						flag = 1;
						break;
					}
				if(flag == 1)
					break;
			}
			
			flag=0;
			for(int j=v; j<n-1; j++)
			{
				for(int i=u; i<2; i++)
				{
					if(i == 0)
					{
						if(plate[i+1][j] == '.')
							if(plate[i][j+1] == '.')
							{
								flag = 1;
								break;
							}
					}
					else
					{
						if(plate[i][j]=='#' && (plate[i][j+1] == '.'  || plate[i-1][j+1] == '#'))
						{
							flag = 1;
							break;
						}
					}
				}
				if(flag == 1)
					break;
			}
			
			if(flag == 1)
				System.out.println("no");
			else
				System.out.println("yes");
		}
		sc.close();
	}

}
