package ICPC;

import java.util.Scanner;

public class Watson 
{
	private static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int d = sc.nextInt();
			int n = 1;
			while(true)
			{
				if(sumOfDigits(n) == d)
					break;
				n++;
			}
			System.out.println(sumOfDigits(n+1));
		}
	}
	private static int sumOfDigits(int n)
	{
		int sum = 0;
		while(n > 0)
		{
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
}
