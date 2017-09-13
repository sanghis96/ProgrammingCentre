import java.util.*;

public class AngryProfessor 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int test = 0;
        while(test<t)
        {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arrivalTime = new int[n];
            int count = 0;
            for(int i=0; i<n; i++)
            {
                arrivalTime[i] = scan.nextInt();
                if(arrivalTime[i] <= 0)
                    count++;
            }       
            if(count >= k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        scan.close();
    }
}