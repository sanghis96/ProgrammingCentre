import java.io.*;
import java.util.*;

public class javaStringCompare 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int k = sc.nextInt();
        int len = string.length();
        String min = "zzz";
        String max = "AAA";
        for(int i=0; i<=len-k; i++)
        {
            String substring = string.substring(i,i+k);
            if(substring.compareTo(max)>0)
                max = substring;
            if(substring.compareTo(min)<0)
                min = substring;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
