import java.util.Scanner;

class CIELAB 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if((A<=B || A>10000) && (B<1 || B>=A))
				System.exit(0);
		int ans = A-B;
		if(ans%10 == 9)
			System.out.println(ans-1);
		else
			System.out.println(ans+1);
		sc.close();
	}
}
