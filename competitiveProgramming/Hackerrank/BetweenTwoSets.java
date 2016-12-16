import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = in.nextInt();
        int[] b = new int[m];
        for (int i=0; i<m; i++)
            b[i] = in.nextInt();
        int count = 0;
        for (int x=a[n-1]; x<=b[0]; x++)
        {
            boolean flag = true;
            for (int i=0; i<m; i++)
                if (b[i]%x != 0)
                {
                    flag = false;
                    break;
                }
            if (flag)
            {
                for (int i=0; i<n; i++)
                    if (x%a[i] != 0)
                    {
                        flag = false;
                        break;
                    }
            }
            if (flag)
                count++;
        }
        System.out.println(count);
    }
}