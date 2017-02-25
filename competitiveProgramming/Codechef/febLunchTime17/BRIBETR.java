package febLunchTime17;

import java.util.Scanner;

class BRIBETR
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T<1 || T>3)
			System.exit(0);
		while(T-- > 0)
		{
			int H = sc.nextInt();
			if(H<2 || H>17)
				System.exit(0);
			int K = sc.nextInt();
			if(K<1 || K>1000000000)
				System.exit(0);
			int N = (int)Math.pow(2, H);
			int[] x = new int[N];
			for(int i=0; i<N; i++)
			{
				x[i] = sc.nextInt();
				if(x[i]<1 || x[i]>1000000000)
					System.exit(0);
			}
			int bribe = 0;
			for(int i=0; i<H; i++)
			{
				int noOfMatches = (int)Math.pow(2, H-1-i);
				int[] winner = new int[noOfMatches];
				int k = 0;
				for(int j=0; j<N && k<noOfMatches; j+=2)
					if(Math.abs(x[j]-x[j+1]) <= K)
					{
						if(x[j] == x[0] && (x[0]!=(x[j]<x[j+1]?x[j+1]:x[j])))
						{
							winner[k++] = (x[j]<x[j+1]?x[j]:x[j+1]);
							bribe++;
						}	
						else if((x[j]<x[j+1]?x[j+1]:x[j])>x[0] && ((x[j]<x[j+1]?x[j+1]:x[j])-x[0])<=K)
							winner[k++] = (x[j]<x[j+1]?x[j+1]:x[j]);
						else
						{
							winner[k++] = (x[j]<x[j+1]?x[j]:x[j+1]);
							bribe++;
						}
					}
					else
						winner[k++] = x[j]<x[j+1]?x[j+1]:x[j];
				if(winner[0] != x[0])
				{
					bribe = -1;
					break;
				}
				for(int j=0; j<noOfMatches; j++)
					x[j] = winner[j];
			}
			System.out.println(bribe);
		}	
		sc.close();
	}
}