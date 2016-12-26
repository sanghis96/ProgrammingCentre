package practice;

import java.util.Scanner;

class CoinFlip
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T<1 || T>10)
			System.exit(0);
		while(T-- > 0)
		{
			 int G = sc.nextInt();
			 if(G<1 || G>20000)
				 System.exit(0);
			 while(G-- > 0)
			 {
				 int I = sc.nextInt();
				 int N = sc.nextInt();
				 int Q = sc.nextInt();
				 if((I<1||I>2) && (N<1||N>1000000000) && (Q<1||Q>2))
					 System.exit(0);
				 if(I == Q)
					 System.out.println(N/2);
				 else
					 if(N%2 == 0)
						 System.out.println(N/2);
					 else
						 System.out.println(N/2+1);
			 }
		}
		sc.close();
	}
}
