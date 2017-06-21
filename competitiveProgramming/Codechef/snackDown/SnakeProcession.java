package snackDown;

import java.util.Scanner;

class SnakeProcession 
{
	public static void main(String[] args)
	{
		int R;
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		while(R-->0)
		{
			int L;
			L = sc.nextInt();
			String rt;
			rt = sc.next();
			char[] rpt = rt.toCharArray();
			char[] rpt1 = new char[L];
			int j = 0;
			for(int i=0; i<L; i++)
				if(rpt[i]!='.')
					rpt1[j++]=rpt[i];
			for(int i=0; i<j; i++)
				System.out.println(rpt1[i]);
			
			if(j%2 == 1)
				System.out.println("Invalid");
			else if(rpt1[0]=='T')
				System.out.println("Invalid");
			else
			{
				int flag = 1;
				for(int k=0; k<j-1; k+=2)
				{
					if(rpt1[k] == 'H' && rpt1[k+1] == 'T')
						continue;
					else
					{
						flag = 0;
						break;
					}
				}
				if(flag == 1)
					System.out.println("Valid");
				else
					System.out.println("Invalid");
				
				/*
				int flag=1, cnt1=0,cnt2=0;
				for(int k=0; k<j-1; k++)
				{
					if(rpt1[k]==rpt1[k+1])
						flag=0;
				}
				for(int k=0; k<j; k++)
				{
					if(rpt1[k]=='H')
						cnt1++;
					else
						cnt2++;	
				}
				if(flag==1 && cnt1==cnt2)
					System.out.println("Valid");
				else
					System.out.println("Invalid");
				*/
			}
		}
		sc.close();
	}
}