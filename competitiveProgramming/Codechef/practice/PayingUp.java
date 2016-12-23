package practice;

import java.util.Scanner;

class PayingUp 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T<1 || T>100)
			System.exit(0);
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n<0 || n>20)
				System.exit(0);
			int[] value = new int[n];
			for(int i=0; i<n; i++)
			{
				value[i] = sc.nextInt();
				if(value[i]<1 || value[i]>1000)
					System.exit(0);
			}
			
			boolean flag = false;
			for(int i=0; i<(1<<n); i++)
	        {
	            int sum = 0;
				for(int j=0; j<n; j++)
	            	if((i & (1 << j)) > 0)
	                    sum += value[j];
				if(sum == m)
				{
					System.out.println("Yes");
					flag = true;
					break;
				}
	        }
			if(!flag)
				System.out.println("No");
		}
		sc.close();
	}
}
