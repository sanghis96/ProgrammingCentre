import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int i=0; i<n; i++)
            c[i] = in.nextInt();
        int count = 0;
        for(int i=0; i<n-1; i++)
            if(c[i] != -1)
                for(int j=i+1; j<n; j++)
                    if(c[i] == c[j])
                    {
                        c[i] = -1;
                        c[j] = -1;
                        count++;
                        break;
                    }
        System.out.println(count);
        in.close();
    }
}
