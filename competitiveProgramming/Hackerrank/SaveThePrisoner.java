import java.io.*;
import java.util.*;

public class SaveThePrisoner
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0)
        {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            if((m+s-1)%n == 0)
                System.out.println(n);
            else
                System.out.println((m+s-1)%n);
        }
        in.close();
    }
}
