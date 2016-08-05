import java.io.*;
import java.util.*;
import java.math.*;

public class MaximumSubarray
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
            
            //1) For max continuous sub array
            int max_ending_here = 0;
            int max_so_far = Integer.MIN_VALUE;
            for(int x : arr)
            {
                max_ending_here = Math.max(x, max_ending_here + x);
                max_so_far = Math.max(max_so_far, max_ending_here);
            }
            System.out.print(max_so_far);
            
            //2) For max non-continuous sub array, order doesn't matter
            Arrays.sort(arr);
            int sum = 0;
            //if there is none positive value in entire array
            if(arr[arr.length-1] <= 0)
                sum = arr[arr.length - 1];
            //accumulate all positive values in entire array
            else
                for(int x : arr)
                    if(x > 0)
                        sum += x;
            System.out.println(" " + sum);
        }
    }
}
