import java.util.*;

public class BackToTheOrigin
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long xT = in.nextLong();
        long yT = in.nextLong();
        int n = in.nextInt();
        long[][] direction = new long[n][2];
        for(int i=0; i<n; i++)
            for(int j=0; j<2; j++)
                direction[i][j] = in.nextLong();
        long xV = xT;
        long yV = yT;
        for(int i=n-1; i>=0; i--)
        {
            xV -= direction[i][0];
            yV -= direction[i][1];
        }
        System.out.println(xV + " " + yV);
        in.close();
    }
}
