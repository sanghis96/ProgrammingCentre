import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int t=0; t<T; t++)
        {
            int n = scan.nextInt();
            int p=0,q=0,flag=0;
            for(int i=(n/3)*3; i>=0; i-=3)
            {
                for(int j=0; j<=(n/5)*5; j+=5)
                    if(i+j > n)
                        break;
                    else if(i+j == n)
                    {
                        p = i;
                        q = j;
                        flag = 1;
                        break;
                    }  
                    else
                        continue;
                if(flag == 1)
                    break;
            }
            if(flag == 1)
            {
                for(int i=0; i<p; i++)
                  System.out.print("5");
                for(int j=0; j<q; j++)
                  System.out.print("3");
            }
            else
                System.out.print("-1");
            System.out.println();
        }
    }
}
