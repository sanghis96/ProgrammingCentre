import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConsecutiveOnes
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0, max=0;
        while(n != 0)
        {
            if(n%2 == 1)
                count++;
            else
                count = 0;
            if(count > max)
                max = count;
            n /= 2;
        }
        System.out.println(max);
    }
}
