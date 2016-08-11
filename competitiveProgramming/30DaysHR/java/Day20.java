import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        int numberOfSwaps = 0;
        for(int i=0; i<n; i++) 
        {
            int flag = 0;
            for(int j=0; j<n-1-i; j++) 
                if(a[j] > a[j+1]) 
                {
                    a[j] += a[j+1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] -= a[j+1];
                    numberOfSwaps++;
                    flag = 1;
                }
            if(flag == 0)
                break;
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
