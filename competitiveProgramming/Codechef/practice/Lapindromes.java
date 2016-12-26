package practice;

import java.util.Scanner;

class Lapindromes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T<1 || T>100)
			System.exit(0);
		while(T-- > 0)
		{
			String s = sc.next();
			int len = s.length();
			if(len<2 || len>1000)
				System.exit(0);
			int[] count = new int[26];
			for(int i=0; i<26; i++)
				count[i] = 0;
			int flag = 0;
			for(int i=0; i<len/2; i++)
			{
				count[s.charAt(i)-97]++;
				count[s.charAt(len-1-i)-97]--;
			}
			for(int i=0; i<26; i++)
				if(count[i] != 0)
				{
					System.out.println("NO");
					flag = 1;
					break;
				}
			if(flag == 0)
				System.out.println("YES");
		}
		sc.close();
	}
}
