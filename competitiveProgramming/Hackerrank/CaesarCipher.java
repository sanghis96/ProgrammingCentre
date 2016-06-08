import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String string = sc.next();
        char[] info = string.toCharArray();
        int k = sc.nextInt();
        int letter = 65;
        for(int i=0; i<n; i++)
        {
            if(info[i]>=65 && info[i]<=90)
                letter = (((int)info[i]-65)+k)%26 + 65;
            else if(info[i]>=97 && info[i]<=122)
                    letter = (((int)info[i]-97)+k)%26 + 97;
                 else
                    letter = info[i];
            info[i] = (char)letter;
        }
        for(int i=0; i<n; i++)
            System.out.print(info[i]);
    }
}