import java.io.*;
import java.util.*;

public class Day25 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int n = sc.nextInt();
            if(n == 1)
                System.out.println("Not prime");
            else
            {
                boolean flag = true;
                int sqRoot = (int)Math.sqrt(n);
                for(int i=2; i<=sqRoot; i++)
                    if(n%i == 0)
                    {
                      flag = false;
                      break;
                    }
                if(flag)
                    System.out.println("Prime");
                else
                    System.out.println("Not prime");
            }
        }
    }
}
