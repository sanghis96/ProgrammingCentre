import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MatchstickWarehouseThief
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[][] crate = new int[c][2];
        for(int i=0; i<c; i++)
            for(int j=0; j<2; j++)
                crate[i][j] = in.nextInt();
        sort(crate);
        int maxSticks = 0;
        int i = 0;
        for(int j=c-1; j>=0 && i<n; j--)
            for(int k=0; k<crate[j][0] && i<n; k++,i++)
                maxSticks += crate[j][1];
        System.out.println(maxSticks);
        in.close();
    }
    private static void sort(int[][] list)
	{
		if(list.length >1)
		{
			int[][] firstHalf = new int[list.length/2][2];
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			sort(firstHalf);
			int secondHalfLength = list.length - list.length/2;
			int[][] secondHalf = new int[secondHalfLength][2];
			System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
			sort(secondHalf);
			int temp[][] = sortMerge(firstHalf,secondHalf);
			System.arraycopy(temp, 0, list, 0, temp.length);		
		}
	}
	private static int[][] sortMerge(int list1[][], int list2[][])
	{
		int[][] temp = new int[list1.length + list2.length][2];
		int i=0, j=0, k=0;
		while(i<list1.length && j<list2.length)
			if(list1[i][1] < list2[j][1])
			{
                 temp[k][0] = list1[i][0];
                 temp[k][1] = list1[i][1];
                 k++;
                 i++;
            }	
			else
            {
                temp[k][0] = list2[j][0];
                temp[k][1] = list2[j][1];
                k++;
                j++;
            }
		while(i < list1.length)
		{
            temp[k][0] = list1[i][0];
            temp[k][1] = list1[i][1];
            k++;
            i++;
        }	
		while(j < list2.length)
		{
            temp[k][0] = list2[j][0];
            temp[k][1] = list2[j][1];
            k++;
            j++;
        }	
		return temp;
	}
}
