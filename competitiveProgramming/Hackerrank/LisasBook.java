import java.io.*;
import java.util.*;

public class LisasBook 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] t = new int[n]; 
        for(int i=0; i<n; i++)
            t[i] = sc.nextInt();
        int pageNo = 0;
        int noOfQues = 0;
        int specialProblem = 0;
        int chapterNo = 1;
        while(chapterNo<=n)
        {
            pageNo++;
            for(int j=0; j<k; j++)
            {
                noOfQues++;
                if(noOfQues == pageNo)
                    specialProblem++;
                if(noOfQues == t[chapterNo-1])
                {
                    chapterNo++;
                    noOfQues = 0;
                    break;
                }
            }
        }
        System.out.println(specialProblem);
    }
}