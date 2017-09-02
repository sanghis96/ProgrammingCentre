package codeAgon;

import java.util.Scanner;

public class SubsequenceAgain {
	private static String subsequenceAgain(String s, int k) {
        String subsequence = "";
		int count[] = new int[26];
		int len = s.length();
		for(int i=0; i<len; i++)
			count[i] = 0;
		for(int i=0; i<len; i++)
			count[s.charAt(i)-97]++;
		for(int i=0; i<len; i++)
			if(count[s.charAt(i)-97] >= k)
				subsequence += s.charAt(i);
		return subsequence;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String result = subsequenceAgain(s, k);
        System.out.println(result);
        in.close();
    }

}
