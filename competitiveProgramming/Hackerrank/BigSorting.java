import java.util.Scanner;

public class BigSorting {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++)
        	arr[i] = sc.next();
        sort(arr);
        for(int i=0; i<n; i++)
        	System.out.println(arr[i] + " ");
        sc.close();
    }
	
	private static boolean compare(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();
		if(lenA == lenB)
			for(int i=0; i<lenA; i++)
			{
				if(Integer.parseInt("" + a.charAt(i)) < Integer.parseInt("" + b.charAt(i)))
					return true;
				if(Integer.parseInt("" + a.charAt(i)) > Integer.parseInt("" + b.charAt(i)))
					return false;
			}
		return (lenA < lenB);
	}
	
	private static void sort(String[] a)
	{
		if(a.length >1)
		{
			String[] firstHalf = new String[a.length/2];
			System.arraycopy(a, 0, firstHalf, 0, a.length/2);
			sort(firstHalf);
			int secondHalfLength = a.length - a.length/2;
			String[] secondHalf = new String[secondHalfLength];
			System.arraycopy(a, a.length/2, secondHalf, 0, secondHalfLength);
			sort(secondHalf);
			String temp[] = sortMerge(firstHalf,secondHalf);
			System.arraycopy(temp, 0, a, 0, temp.length);		
		}
	}
	private static String[] sortMerge(String list1[], String list2[])
	{
		String[] temp = new String[list1.length + list2.length];
		int i=0, j=0, k=0;
		while(i<list1.length && j<list2.length)
			if(compare(list1[i], list2[j]))
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
