import java.util.Scanner;

public class SeperateBallsB
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] A = new char[n];
		for(int a=0; a<n; a++)
			A[a] = sc.next().charAt(0);
		char[] B = new char[n];
		int i=0, j=1, k=2;
		for(int p=0; p<n; p++)
		{
			if(A[p] == 'R')
			{
				B[i] = A[p];
				i += 3;
			}
			if(A[p] == 'G')
			{
				B[j] = A[p];
				j += 3;
			}
			if(A[p] == 'B')
			{
				B[k] = A[p];
				k += 3;
			}
		}
		System.out.println();
		for(int b=0; b<n; b++)
			System.out.print(B[b] + " ");
		sc.close();
	    
    }
}

