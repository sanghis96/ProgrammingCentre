package febLunchTime17;

import java.util.Scanner;

public class BearAndMilkyCookies
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T<1 || T>50)
			System.exit(0);
		while(T-- > 0)
		{
			int N = sc.nextInt();
			if(N<1 || N>50)
				System.exit(0);
			String[] S = new String[N];
			for(int i=0; i<N; i++)
			{
				S[i] = sc.next();
				if(!S[i].equals("cookie") && !S[i].equals("milk"))
					System.exit(0);
			}
			if(N == 1)
				if(S[0].equals("cookie"))
					System.out.println("NO");
				else
					System.out.println("YES");
			else if(S[N-1].equals("cookie"))
				System.out.println("NO");
			else
			{
				int i;
				for(i=0; i<N-1; i++)
				{
					if(S[i].equals("milk"))
						continue;
					if(S[i+1].equals("cookie"))
						break;
				}
				if(i == N-1)
					System.out.println("Yes");
				else
					System.out.println("NO");
			}
		}
		sc.close();
	}
}
