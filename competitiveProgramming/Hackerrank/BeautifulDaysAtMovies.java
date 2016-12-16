import java.io.*;
import java.util.*;

public class BeautifulDaysAtMovies
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        
        int count = 0;
        for (int x=i; x<=j; x++)
        {
            int rev = reverse(x);
            if(Math.abs((x-rev))%k == 0)
                count++;
        }
        System.out.println(count);
        in.close();
    }
    private static int reverse(int num)
    {
        int rev = 0;
		while(num > 0)
		{
			rev += num%10;
			rev *= 10;
			num /= 10;
		}
		return rev/10;
    }
}