package snackDown;

import java.util.Scanner;

public class SameSnake
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int x11 = sc.nextInt();
			int y11 = sc.nextInt();
			int x12 = sc.nextInt();
			int y12 = sc.nextInt();
			int x21 = sc.nextInt();
			int y21 = sc.nextInt();
			int x22 = sc.nextInt();
			int y22 = sc.nextInt();
			
			if((y11 == y12 && y21 == y22 && y12 == y21) || (x11 == x12 && x21 == x22 && x12 == x21))	{
				
			}
		}
		sc.close();
	}
}
