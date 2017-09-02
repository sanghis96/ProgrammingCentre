package codeAgon;

import java.util.Scanner;

public class BuyingEverything {
	private static long minimumTime(int[] b, int n, int m, int k) {
        long minutes = 0;
        int c= 0, prevShop= 0;
        for(int i=0; i<n; i++) {
        	if(b[i] == 0)
        		continue;
        	else {
        		minutes += c==0 ? (i-prevShop) : (i-prevShop)*c*k;
        		prevShop = i;
        		c++;
        		if(c == m)
        			break;
        	}
        }
        
        if(c == m)
        	return minutes;
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] b = new int[n];
        for(int b_i = 0; b_i < n; b_i++){
            b[b_i] = in.nextInt();
        }
        long result = minimumTime(b, n, m, k);
        System.out.println(result);
        in.close();
    }
}
