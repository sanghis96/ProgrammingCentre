import java.io.*;
import java.util.*;

public class Day9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    private static long factorial(int n)
    {
        if(n<=1)
            return 1;
        else
            return n * factorial(n-1);
    }
}
