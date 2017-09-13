import java.util.*;

public class ModifiedKaprekarNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long p = sc.nextInt();
        long q = sc.nextInt();
        int flag = 0;
        for(long i=p ; i<=q ; i++)
            if(isKaprekar(i))
            {    
               System.out.print(i + " ");
               flag = 1;
            }
        if(flag == 0)
           System.out.println("INVALID RANGE");
        sc.close();
    }
    static boolean isKaprekar(long n)
    {
        long square = n*n;
        int d = 0;
        long num = n;
        while(num>0)
        {
            num /= 10;
            d++;
        }
        long r=0;
        int a=1;
        for(int i=0 ; i<d ; i++)
        {
            r += square%10 * a;
            square /= 10;
            a *= 10;
        }
        long l = square;
        if(l + r == n)
            return true;
        else
            return false;
    }
}