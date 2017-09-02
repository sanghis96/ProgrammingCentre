package codeAgon;

import java.util.Scanner;

public class UglyOrBeautiful {

	private static String uglyOrBeautiful(int[] a) {
        
        int len = a.length;
        
        //Checking condition 3
        for(int i=0; i<len; i++)
        	if(a[i]>len || a[i]<1) 
        		return "Ugly";
        
        //Checking condition 2
        boolean cond2 = false;
        for(int i=0; i<len-1; i++)
        	if(a[i] > a[i+1]) {
        		cond2 = true;
        		break;
        	}
        if(!cond2)
        	return "Ugly";
        
        //Checking condition 1
        int count[] = new int[len];
        for(int i=0; i<len; i++)
        	count[i] = 0;
        for(int i=0; i<len; i++)
        	count[a[i]-1]++;
        for(int i=0; i<len; i++)
        	if(count[i] > 1)
            	return "Ugly";
        
        return "Beautiful";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = uglyOrBeautiful(a);
            System.out.println(result);
        }
        in.close();
    }

}
