import java.util.Scanner;

public class SeperateBallsA
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] a = new char[n];
		for(int a_i=0; a_i<n; a_i++)
			a[a_i] = sc.next().charAt(0);
		int i=0, j=n-1;
		while(a[j] == 'G')
			j--;
		int k = 0;
		while(k <= j)
		{
			if(a[k] == 'R')
			{
				char temp = a[k];
				a[k] = a[i];
				a[i] = temp;
				i++;
				k++;
			}
			else if(a[k] == 'G')
			{
				char temp = a[k];
				a[k] = a[j];
				a[j] = temp;
				j--;
				while(a[j] == 'G')
					j--;
			}
			else
				k++;
		}
		System.out.println();
		for(int a_i=0; a_i<n; a_i++)
			System.out.print(a[a_i] + " ");
		sc.close();
	    
    }
}

