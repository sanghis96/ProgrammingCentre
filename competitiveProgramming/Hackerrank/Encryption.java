import java.io.*;
import java.util.*;

public class Encryption 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int rootL = (int)Math.sqrt(l);
        int r, c;
        r = c = rootL;
        if(r*c<l)
        {
            c++;
            if(r*c<l)
                r++;
        }
        for(int i=0; i<c; i++)
        {
            for(int j=i; j<l; j+=c)
                System.out.print(s.charAt(j));
            System.out.print(" ");
        }   
    }
}
