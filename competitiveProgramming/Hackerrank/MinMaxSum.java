import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long[] nums = new long[5];
        for (int i=0; i<5; i++)
            nums[i] = in.nextLong();
        
        sort(nums);
        
        long minSum = 0;
        for (int i=0; i<4; i++)
            minSum += nums[i];
        
        long maxSum = 0;
        for (int i=1; i<5; i++)
            maxSum += nums[i];
        
        System.out.println(minSum + " " + maxSum);
        
        in.close();
    }
    private static void sort(long[] list)
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
