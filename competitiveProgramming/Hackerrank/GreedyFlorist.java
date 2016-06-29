import java.io.*;
import java.util.*;

public class GreedyFlorist 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] cost = new int[n];
        for(int i=0; i<n; i++)
            cost[i] = sc.nextInt();
        for(int i=1; i<n; i++)                    //  Sorting
            for(int j=0; j<n-i; j++)
                if(cost[j] < cost[j+1])
                {
                     cost[j] += cost[j+1];
                     cost[j+1] = cost[j] - cost[j+1];
                     cost[j] -= cost[j+1];
                }
        int totalCost = 0;
        int l = 0;
        for(int i=0; i<n/k+1; i++)
            for(int j=0; j<k && l<n; j++)
            {
                totalCost += (i+1)*cost[l];
                l++;
            }
        System.out.println(totalCost);
        
    }
}
