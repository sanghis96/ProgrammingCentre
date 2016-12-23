package practice;

import java.util.Scanner;

class RacingHorses 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T<1 || T>10)
			System.exit(0);
		while(T-- > 0)
		{
			int n = sc.nextInt();
			if(n<2 || n>5000)
				System.exit(0);
			int[] s = new int[n];
			for(int i=0; i<n; i++)
			{
				s[i] = sc.nextInt();
				if(s[i]<1 || s[i]>1000000000)
					System.exit(0);
			}
			int min = Integer.MAX_VALUE;
			for(int i=0; i<n-1; i++)
				for(int j=i+1; j<n; j++)
					if(Math.abs(s[i]-s[j]) < min)
						min = Math.abs(s[i]-s[j]);
			System.out.println(min);
		}
		sc.close();
	}
}