import java.util.Scanner;

class CleaningUp 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T<1 || T>50)
			System.exit(0);
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n<m || n>1000) && (m<0 || m>n))
				System.exit(0);
			int[] completedJobs = new int[m];
			for(int i=0; i<m; i++)
			{
				completedJobs[i] = sc.nextInt();
				if(completedJobs[i]<1 || completedJobs[i]>n)
					System.exit(0);
			}
			
			sort(completedJobs);
			int[] chefJobs = new int[(n-m)/2+1];
			int[] asstJobs = new int[(n-m)/2+1];
			int i=1, j=0, k=0, l=0, x=1;
			while(i<=n && j<m)
			{
				if(completedJobs[j] != i)
				{
					if(x%2 == 1)
						chefJobs[k++] = i;
					else
						asstJobs[l++] = i;
					x++;
				}
				else
					j++;
				i++;
			}
			while(i<=n)
			{
				if(x%2 == 1)
					chefJobs[k++] = i;
				else
					asstJobs[l++] = i;
				x++;
				i++;
			}
			for(i=0; i<k; i++)
				System.out.print(chefJobs[i] + " ");
			System.out.println();
			for(i=0; i<l; i++)
				System.out.print(asstJobs[i] + " ");
			System.out.println();
		}
		sc.close();
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
