import java.io.*;
import java.util.*;

public class ACM_ICPC_Team 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        String s = "";
        for(int i=0; i<n; i++)
        {   
            s = sc.next();
            for(int j=0; j<m; j++)
                arr[i][j] = Integer.parseInt(s.charAt(j)+"");
        }
        int maxNoOfTopic=0, noOfTeams=0, count=0;
        int[] topics = new int[m+1];
        for(int i=0; i<=m; i++)
            topics[i] = 0; 
        for(int i=0; i<n-1; i++)
            for(int j=i+1; j<n; j++)
            {
                count = 0;
                for(int k=0; k<m; k++)
                    if(arr[i][k]==1 || arr[j][k]==1)
                        count++;
                topics[count]++;
                maxNoOfTopic = count>maxNoOfTopic?count:maxNoOfTopic;
            }
        System.out.println(maxNoOfTopic + "\n" + topics[maxNoOfTopic]);
    }
}
