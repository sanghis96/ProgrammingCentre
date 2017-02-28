import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class OrganizingContainersOfBalls
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++)
        {
            int n = in.nextInt();
            int[][] M = new int[n][n];
            int[] ball_type_count = new int[n];
            int[] ball_container_count = new int[n];
            for(int i=0; i<n; i++)
                ball_type_count[i] = ball_container_count[i] = 0;
            for(int i=0; i<n; i++)
                for(int j=0; j<n; j++)
                {
                    M[i][j] = in.nextInt();
                    ball_container_count[j] += M[i][j];
                    ball_type_count[i] += M[i][j];
                }
            sort(ball_container_count);
            sort(ball_type_count);
            int j;
            for(j=0; j<n; j++)
                if(ball_container_count[j] != ball_type_count[j])
                    break;
            if(j == n)
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
        in.close();
    }
    private static void sort(int[] list)
	{
		if(list.length >1)
		{
			int[] firstHalf = new int[list.length/2];
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			sort(firstHalf);
			int secondHalfLength = list.length - list.length/2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
			sort(secondHalf);
			int temp[] = sortMerge(firstHalf,secondHalf);
			System.arraycopy(temp, 0, list, 0, temp.length);		
		}
	}
	private static int[] sortMerge(int list1[], int list2[])
	{
		int[] temp = new int[list1.length + list2.length];
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
