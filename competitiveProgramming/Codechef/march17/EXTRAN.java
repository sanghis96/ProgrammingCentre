package march17;

import java.util.Scanner;

class EXTRAN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			sort(a);
			if(a[0] != a[1]-1)
				System.out.println(a[0]);
			else if(a[n-1] != a[n-2]+1)
				System.out.println(a[n-1]);
			else
				for(int i=1; i<n-1; i++)
					if(a[i] == a[i+1])
					{
						System.out.println(a[i]);
						break;
					}
		}
		sc.close();
	}
	private static void sort(int[] a)
	{
		if(a.length >1)
		{
			int[] firstHalf = new int[a.length/2];
			System.arraycopy(a, 0, firstHalf, 0, a.length/2);
			sort(firstHalf);
			int secondHalfLength = a.length - a.length/2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(a, a.length/2, secondHalf, 0, secondHalfLength);
			sort(secondHalf);
			int temp[] = sortMerge(firstHalf,secondHalf);
			System.arraycopy(temp, 0, a, 0, temp.length);		
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
