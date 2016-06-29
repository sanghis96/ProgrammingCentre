import java.io.*;
import java.util.*;

public class Day16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try{
            int intS = Integer.parseInt(s);
            System.out.println(intS);
        }catch(Exception e)
        {   System.out.println("Bad String");   }
    }
}
