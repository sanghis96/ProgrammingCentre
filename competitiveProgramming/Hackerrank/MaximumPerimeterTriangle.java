import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximumPerimeterTriangle 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] l = new long[n];
        for(int i=0; i<n; i++)
            l[i] = sc.nextInt();
        long[] triangle = new long[]{0,0,0};
        long max_peri = 0;
        for(int i=0; i<n-2; i++)
            for(int j=i+1; j<n-1; j++)
                for(int k=j+1; k<n; k++)
                    if(isTriangle(l[i], l[j], l[k]))
                    {
                        if(l[i]+l[j]+l[k] > max_peri)
                        {    
                            max_peri = l[i]+l[j]+l[k];
                            triangle[0] = l[i];
                            triangle[1] = l[j];
                            triangle[2] = l[k];
                        }
                        if(l[i]+l[j]+l[k] == max_peri)
                        {
                            if(longestSide(l[i],l[j],l[k]) > longestSide(triangle[0],triangle[1],triangle[2]))
                            {
                                triangle[0] = l[i];
                                triangle[1] = l[j];
                                triangle[2] = l[k];
                            }
                            if(longestSide(l[i],l[j],l[k]) == longestSide(triangle[0],triangle[1],triangle[2]))
                            {
                                if(shortestSide(l[i],l[j],l[k]) > shortestSide(triangle[0],triangle[1],triangle[2]))
                                {
                                    triangle[0] = l[i];
                                    triangle[1] = l[j];
                                    triangle[2] = l[k];
                                }
                                if(shortestSide(l[i],l[j],l[k]) == shortestSide(triangle[0],triangle[1],triangle[2]))
                                {
                                    triangle[0] = shortestSide(l[i],l[j],l[k]);
                                    triangle[2] = longestSide(l[i],l[j],l[k]);
                                    triangle[1] = l[i]+l[j]+l[k]-triangle[0]-triangle[2];
                                }
                            }
                        }
                    }
        if(triangle[0]!=0 && triangle[1]!=0 && triangle[2]!=0)
            System.out.println(triangle[0] + " " + triangle[1] + " " + triangle[2]);
        else
            System.out.println("-1");
	}
    private static boolean isTriangle(long a, long b, long c)
    {
        if(a+b <= c)
            return false;
        else if(b+c <= a)
            return false;
        else if(a+c <= b)
            return false;
        return true;
    }
    private static long longestSide(long a, long b, long c)
    {
        return (a>b && a>c) ? a : (b>a && b>c) ? b : c;
    }
    private static long shortestSide(long a, long b, long c)
    {
        return (a<b && a<c) ? a : (b<a && b<c) ? b : c;
    }
}
