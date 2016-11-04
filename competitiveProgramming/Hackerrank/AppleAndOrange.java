import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        
        int[] apple = new int[m];
        for(int i=0; i<m; i++)
            apple[i] = in.nextInt();
        
        int[] orange = new int[n];
        for(int i=0; i<n; i++)
            orange[i] = in.nextInt();
        
        int countApple=0, countOrange=0;
        for(int i=0; i<m; i++)
            if(a+apple[i]>=s && a+apple[i]<=t)
                countApple++;
        for(int i=0; i<n; i++)
            if(b+orange[i]>=s && b+orange[i]<=t)
                countOrange++;
        
        System.out.println(countApple);
        System.out.println(countOrange);
    }
}
