import java.io.*;
import java.util.*;

public class IceCreamParlor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] c = new int[n];
            for(int i=0; i<n; i++)
                c[i] = sc.nextInt();
            int flag = 0;
            for(int i=0; i<n-1; i++)
            {
                for(int j=i+1; j<n; j++)
                    if(c[i]+c[j] == m)
                    {
                        System.out.println((i+1) + " " + (j+1));
                        flag = 1;
                        break;
                    }
                if(flag == 1)
                    break;
            }
            T--;
        }
    }
}
