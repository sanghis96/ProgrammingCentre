import java.io.*;
import java.util.*;

class CricketRating 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rating = new int[n];
        for(int i=0; i<n; i++)
        	rating[i] = sc.nextInt();
        int max=0, maxSoFar=0;
        for(int i=0; i<n; i++)
        {
        	max = 0 > (max+rating[i]) ? 0 : (max+rating[i]);
        	maxSoFar = maxSoFar > max ? maxSoFar : max;
        }
        System.out.println(maxSoFar);
    }
}
