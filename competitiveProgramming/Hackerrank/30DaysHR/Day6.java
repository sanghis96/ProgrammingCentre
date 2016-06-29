import java.io.*;
import java.util.*;

public class Day6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++)
        {
            String string = sc.next();
            for(int i=0; i<string.length(); i+=2)
                System.out.print(string.charAt(i));
            System.out.print(" ");
            for(int i=1; i<string.length(); i+=2)
                System.out.print(string.charAt(i));
            System.out.println();
        }
    }
}
