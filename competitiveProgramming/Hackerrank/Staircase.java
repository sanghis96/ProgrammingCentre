import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int spaces = N-1;
        for(int i=0 ; i<N ;i++)
        {
            for(int j=0 ; j<spaces ; j++)
                System.out.print(" ");
            for(int j=0 ; j<N-spaces ; j++)
                System.out.print("#");
            System.out.println();
            spaces--;
        }
    }
}
