import java.io.*;
import java.util.*;

public class ViralAdvertising
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        int m = 5;
        for(int i=0; i<n; i++)
        {
            int like = m/2;
            ans += like;
            like *= 3;
            m = like;
        }
        System.out.println(ans);
        in.close();
    }
}
