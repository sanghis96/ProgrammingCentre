package ICPC;

import java.util.Scanner;

class Watson 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		//  Input no of Test Cases
		if(T<1 || T>100)			//  Checking boundary conditions
			System.exit(0);
		while(T-- > 0)
		{
			int d = sc.nextInt();	//  Input variable d
			if(d<1 || d>100000)		//  Checking boundary conditions
				System.exit(0);
			int N = 1;
			while(true)				//  For all possible positive integers N having sum of digits d
			{						//  	and find the minimum possible digit sum
				if(sumOfDigits(N) == d)
					break;
				N++;
			}
			System.out.println(sumOfDigits(N+1));
		}
		sc.close();
	}
	private static int sumOfDigits(int n)	//  Function for getting sum of digits
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
