import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LexicographicallyGreaterString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0)
        {
            String s = in.next();
            char[] w = s.toCharArray();
            int n = w.length;
            int index = -1, index2 = 0;
            String result = "";
            for(int i=n-2; i>=0; i--)
                if (w[i] < w[i + 1])
                {
                   index = i;
                   break;
                }
            if(index == -1)
                result += "no answer";
            else
            {
                for(int i =n-1; i>index; i--)
                    if(w[i] > w[index])
                    {
                       index2 = i;
                       break;
                    }
                char t;
                t = w[index];
                w[index] = w[index2];
                w[index2] = t;
                for(int i=0; i<=index; i++)
                    result += w[i];
                for(int i=n-1; i>index; i--)
                    result += w[i];
            }
            System.out.println(result);
        }
    }
}
