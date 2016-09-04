import java.io.*;
import java.util.*;

public class RedJohnIsBack 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int n = sc.nextInt();
            long m = 0;
            for(int i=n/4+1,j=n%4; i>0; i--,j+=4)
                m += nCr(i+j-1, i-1);
            long p = 0;
            for(long j=2; j<=m ;j++)
                if(isPrime(j))
                   p++;
            System.out.println(p);
        }
    }
    private static long nCr(long n, long r)
    {
        long i = r;
        long nCr = 1;
        while(i-- > 0)
            nCr *= n--;
        nCr /= factorial(r);
        return nCr;
    }
    private static long factorial(long num)
	{
		if(num == 0)
			return 1;
		else
			return (num * factorial(num-1));
	}
    private static boolean isPrime(long num)
	{
		for(long i=2 ; i<=(long)Math.sqrt(num) ; i++)
			if(num%i == 0)
				return false;
		return true;
	}
}
