import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n,c,m,totalC,remR,remW;
        for(int i=0 ; i<t ; i++)
        {
            n = sc.nextInt();
            c = sc.nextInt();
            m = sc.nextInt();
            totalC = remW = n/c;
            remR = n%c + (remW/m)*c;
            remW = remW%m;
            while(remR>=c)
            {
                totalC += remR/c;
                remW += remR/c; 
                remR = (remW/m)*c;
                remW = remW%m;
            }
            System.out.println(totalC);
        }
    }
}