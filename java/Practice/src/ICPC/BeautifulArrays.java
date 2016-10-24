package ICPC;

import java.util.Scanner;

public class BeautifulArrays
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		//  Input no of Test Cases
		if(T<1 || T>1000000)		//  Checking boundary conditions
			System.exit(0);
		while(T-- > 0)
		{
			int n=sc.nextInt();		//  Input Size of array
			if(n<1 || n>100000)		//  Checking boundary conditions
				System.exit(0);
			int[] a = new int[n];
			int c=0, flag=0;		//	c is storing result of a[i]*a[j]
			for(int i=0; i<n; i++)
			{
				a[i] = sc.nextInt();		//	Input array elements
				if(a[i]<-1000000000 || a[i]>1000000000)		//  Checking boundary conditions
					System.exit(0);
			}
				for(int i=0; i<n-1; i++)
				{
					for(int j=i+1; j<n; j++)
					{
						c = a[i]*a[j];
						if(isBeautiful(c,n,a))
						{
							System.out.println("yes");
							flag=1;
							break;
						}
					}
				}
				if(flag==0)
					System.out.println("no");
		}
		sc.close();
	}
	private static boolean isBeautiful(int c, int n, int[] a)
	{
		for(int i=0;i<n;i++)
			if(a[i]==c)
				return true;
		return false;
	}
}