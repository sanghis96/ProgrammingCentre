import java.io.*;
import java.util.*;
import java.math.*;

public class FibonacciModified 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BigInteger t1 = new BigInteger(sc.nextInt()+"");
        BigInteger t2 = new BigInteger(sc.nextInt()+"");
        int n = sc.nextInt();
        BigInteger tn = new BigInteger("0");
        while(n-- > 2)
        {
            tn = t1.add(new BigInteger(String.valueOf(t2.multiply(new BigInteger(String.valueOf(t2))))));
            t1 = t2;
            t2 = tn;
        }
        System.out.println(tn);
    }
}
