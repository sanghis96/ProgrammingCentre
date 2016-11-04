import java.io.*;
import java.util.*;

public class ANDxorOR
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = in.nextInt();
        int sMax = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        for(int i=1; i<n; i++)
        {
            while(!stack.isEmpty())
            {
                sMax = Math.max(sMax,cal(a[i],a[stack.peek()]));
                if(a[stack.peek()] > a[i])
                    stack.pop();
                else
                    break;
            }
            stack.push(i);
        }
        System.out.println(sMax);
    }
    private static int cal(int a, int b)
    {
        return (a^b);
    }
}
