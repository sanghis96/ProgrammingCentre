package sepCookOff;

import java.util.Scanner;

class StatisticsConstruction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			String s = sc.next();
			int[] count = new int[26];
			for(int i=0; i<26; i++)
				count[i] = 0;
			int len = s.length();
			boolean flag = false;
			for(int i=0; i<len; i++) {
				count[s.charAt(i)-97]++;
				if(count[s.charAt(i)-97] > 1) {
					System.out.println("yes");
					flag = true;
					break;
				}					
			}
			if(!flag)
				System.out.println("no");
		}
		sc.close();

	}

}
