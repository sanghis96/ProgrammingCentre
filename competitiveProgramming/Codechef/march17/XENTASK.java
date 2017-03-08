package march17;

import java.util.Scanner;

class XENTASK 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int min1=0, min2=0;
			int[] Xenny = new int[n];
			for(int i=0; i<n; i++)
			{
				Xenny[i] = sc.nextInt();
				if(i%2 == 0)
					min1 += Xenny[i];
				else
					min2 += Xenny[i];
			}
			int[] Yana = new int[n];
			for(int i=0; i<n; i++)
			{
				Yana[i] = sc.nextInt();
				if(i%2 == 0)
					min2 += Yana[i];
				else
					min1 += Yana[i];
			}
			if(min1<min2)
				System.out.println(min1);
			else
				System.out.println(min2);
		}
		sc.close();
	}
}
