import java.io.*;
import java.util.*;

public class BonAppetit
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for (int i=0; i<n; i++)
            c[i] = in.nextInt();
        int bCharged = in.nextInt();
        int bActual = 0;
        for (int i=0; i<n; i++)
        {
            if (i == k)
                continue;
            bActual += c[i];
        }
        bActual /= 2;
        if (bCharged == bActual)
            System.out.println("Bon Appetit");
        else
            System.out.println(bCharged-bActual);
        in.close();
    }
}