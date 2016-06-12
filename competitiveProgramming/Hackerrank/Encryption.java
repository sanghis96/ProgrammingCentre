import java.io.*;
import java.util.*;

public class Encryption 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int c = (int)(Math.ceil(Math.sqrt(len)));
        for(int i=0; i<c; i++)
        {
            for(int j=i; j<len; j+=c)
                System.out.print(s.charAt(j));
            System.out.print(" ");
        }   
    }
}
