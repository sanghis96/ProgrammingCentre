import java.io.*;
import java.util.*;

class Mystery14 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
        	int n = sc.nextInt();
        	int[] ar = new int[n];
        	for(int i=0; i<n; i++)
        		ar[i] = sc.nextInt();
        	int sum = 0;
        	for(int i=0; i<n; i++)
        		if(ar[i]%2 == 1)
        			sum += ar[i];
        	System.out.println(sum);
        }
    }
}
