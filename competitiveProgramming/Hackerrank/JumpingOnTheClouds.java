import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheClouds
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int i=0; i<n; i++)
            c[i] = in.nextInt();
        int jumps = 0;
        int i = 0;
        while(i<n-1)
        {
            if(c[i] == 0)
                i += 2;
            else
                i++;
            jumps++;
        }
        System.out.println(jumps);
        in.close();
    }
}
