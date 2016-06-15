import java.io.*;
import java.util.*;

public class Solution 
{
    static void quickSort(int[] list)
    {   quickSort(list,0,list.length-1);    }
    private static void quickSort(int[] list, int first, int last)
    {
        if(first < last)
        {
            int pivotIndex = partition(list,first,last);
            quickSort(list,first,pivotIndex-1);
            quickSort(list,pivotIndex+1,last);
        }
    }
    private static int partition(int[] list, int first, int last)
    {
        int pivot = list[first];
        int low = first+1;
        int high = last;
        while(high > low)
        {
            while(low<=high && list[low]<=pivot)
                low++;
            while(low<=high && list[high]>pivot)
                high--;
            if (high > low) 
            {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
            while (high > first && list[high] >= pivot)
                high--;
            if (pivot > list[high]) 
            {
                list[first] = list[high];
                list[high] = pivot;
                return high;
            }
        }
        return first;
    }
    private static void printArray(int[] arr,int first,int last)
    {
        for(int i=first; i<=last; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++)
            ar[i] = sc.nextInt();
        quickSort(ar);
    }
}
