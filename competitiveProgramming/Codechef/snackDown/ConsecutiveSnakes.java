package snackDown;

import java.util.Scanner;

class ConsecutiveSnakes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        while(T-->0)
        {
            int N, L, A, B, cost=0;
            N = sc.nextInt();
            L = sc.nextInt();
            A = sc.nextInt();
            B = sc.nextInt();
            int[] S = new int[N];
            for(int i=0; i<N; i++)
                S[i] = sc.nextInt();
            int[][] X = new int[N][2];
            for(int i=0;i<N;i++)
            {
                X[i][0] = S[i];
                X[i][1] = S[i] + L;
            }
            int j=-1;
            int[] near =new int[N];
            for(int i=0;i<N;i++)
            {
                if(S[i]==A)
                {
                    j=i;
                    break;
                }
                else
                    near[i] = Math.abs(A-S[i]);
            }
            int[] NS = new int[N];
            int l=1;
            int k;
            if(j!=-1)
            {
                k=j;
                l=1;
                NS[0]=S[j];
                for(int i=0;i<N;i++)
                {
                    if(i!=j)
                    {
                        NS[l]=NS[l-1]+L;
                        cost+=Math.abs(NS[l]-S[i]);
                        k=i;
                        l++;
                    }
                }
            }
            else
            {
                int minnn=999;
                int min = 0;
                for(int i=0;i<N;i++)
                    if(near[i]<minnn)
                      {
                        minnn=near[i];//yahan pe har baar kam hi aayega
                        min = i;
                }
                cost+=Math.abs(S[min]-A);
                k=min;
                NS[0]=S[k];
                for(int i=0;i<N;i++)
                {
                    if(i!=min)
                    {
                        NS[l]=NS[l-1]+L;
                        cost+=Math.abs(NS[l]-S[i]);
                        k=i;
                        l++;
                    }
                }
            }
            System.out.println(cost);
        }
        sc.close();
    }
}
