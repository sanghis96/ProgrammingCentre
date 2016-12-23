import java.util.Scanner;

class UncleJohny 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T<1 || T>1000)
			System.exit(0);
		while(T-- > 0)
		{
			int n = sc.nextInt();
			if(n<1 || n>100)
				System.exit(0);
			int[] songsLength = new int[n];
			for(int i=0; i<n; i++)
			{
				songsLength[i] = sc.nextInt();
				if(songsLength[i]<1 || songsLength[i]>1000000000)
					System.exit(0);
			}
			int k = sc.nextInt();
			int uncleJohny = songsLength[k-1];
			System.out.println(search(songsLength, uncleJohny)+1);
		}
		sc.close();
	}
	private static int search(int[] list, int key)
	{
		sort(list);
		return search(list,key,0,list.length);
	}
	private static int search(int[] list, int key, int low, int high)
	{
		if(low > high)
			return -1;
		int mid = (low+high)/2;
		if(key < list[mid])
			return search(list,key,low,mid-1);
		else if(key == list[mid])
			return mid;
		else
			return search(list,key,low+1,high);
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
