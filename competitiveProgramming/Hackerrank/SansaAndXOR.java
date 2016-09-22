import java.io.*;
import java.util.*;

public class SansaAndXOR 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            int ans;
            if(n%2 == 0)
                ans = 0;
            else
            {
                ans = arr[0];
                for(int i=2; i<n; i+=2)
                    ans ^= arr[i];
            }
            System.out.println(ans);
        }
    }
}
