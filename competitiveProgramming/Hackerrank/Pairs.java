import java.io.*;
import java.util.*;

public class Pairs 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextLong();
        sort(arr);
        int i=0,j=1,count=0;
        while(j < n) 
        {
            long diff = arr[j] - arr[i];
            if(diff == k) 
            {
               count++;
               j++;
               i++;
            }
            else if(diff > k)
                i++;
            else if(diff < k)
                j++;
        }
        System.out.println(count);

    }
    public static void sort(long[] list)
	{
		if(list.length >1)
		{
			long[] firstHalf = new long[list.length/2];
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			sort(firstHalf);
			int secondHalfLength = list.length - list.length/2;
			long[] secondHalf = new long[secondHalfLength];
			System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
			sort(secondHalf);
			long temp[] = sortMerge(firstHalf,secondHalf);
			System.arraycopy(temp, 0, list, 0, temp.length);		
		}
	}
	private static long[] sortMerge(long list1[], long list2[])
	{
		long[] temp = new long[list1.length + list2.length];
		int i=0, j=0, k=0;
		while(i<list1.length && j<list2.length)
			if(list1[i] < list2[j])
				temp[k++] = list1[i++];
			else
				temp[k++] = list2[j++];
		while(i < list1.length)
			temp[k++] = list1[i++];
		while(j < list2.length)
			temp[k++] = list2[j++];
		return temp;
	}
}
