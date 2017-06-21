package snackDown;

import java.util.Scanner;

class SnElect 
{
    public static void main(String[] args)
    {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while(T-->0)
        {
            String item;
            item = sc.next();
            int cntS=0, cntM=0;
            char[] a = item.toCharArray();
            int n = a.length;
            for(int i=0; i<n; i++)
            {
                if(a[i]=='s')
                    cntS++;
                else
                {
                    cntM++;
                    if(i == 0)
                    {	
                    	if(a[i+1] == 's')
                    		cntS--;
                    }
                    else if(i == n-1)
                    {
                    	if(a[i-1] == 's')
                    		cntS--;
                    }
                    else if(a[i-1]=='s'||a[i+1]=='s')  
                        cntS--;
                }
            }
            if(cntS>cntM)
                System.out.println("snakes");
            else if(cntS<cntM)
                System.out.println("mongooses");
            else
                System.out.println("tie");
        }
        sc.close();
    }
}