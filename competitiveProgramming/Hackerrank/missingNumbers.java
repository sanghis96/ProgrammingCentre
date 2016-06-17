import java.io.*;
import java.util.*;

public class missingNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[201];
        int n = sc.nextInt();
        int pivot = sc.nextInt();
        arr[pivot%201]++;
        pivot /= 201;
        for(int i=0; i<n-1; i++)
            arr[sc.nextInt()%201]++;
        int m = sc.nextInt();
        for(int i=0; i<m; i++)
            arr[sc.nextInt()%201]--;
        for(int i=0; i<201; i++)
            if(arr[i] != 0)
               System.out.print(((201*pivot)+i) + " ");
    }
}
