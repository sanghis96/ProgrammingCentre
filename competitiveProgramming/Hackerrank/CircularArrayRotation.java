import java.io.*;
import java.util.*;

public class CircularArrayRotation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int r = k%n;
        for(int i=0; i<q; i++)
        {
            int m = sc.nextInt();
            System.out.println(arr[(m+(n-r))%n]);
        }
    }
}
