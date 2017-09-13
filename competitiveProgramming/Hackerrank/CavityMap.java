import java.util.*;

public class CavityMap 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] map = new String[n];
        for(int i=0;i<n;i++)
            map[i] = sc.next();
        if(n==1)
            System.out.println(map[0]);
        else {
	        System.out.println(map[0]);
	        for(int i=1;i<n-1;i++)
	        {
	            System.out.print(map[i].charAt(0));
	            for(int j=1;j<n-1;j++)
	                if(Integer.parseInt(""+map[i].charAt(j))>Integer.parseInt(""+map[i+1].charAt(j)) && Integer.parseInt(""+map[i].charAt(j))>Integer.parseInt(""+map[i-1].charAt(j)) && Integer.parseInt(""+map[i].charAt(j))>Integer.parseInt(""+map[i].charAt(j+1)) && Integer.parseInt(""+map[i].charAt(j))>Integer.parseInt(""+map[i].charAt(j-1)))
	                    System.out.print("X");
	                else
	                    System.out.print(map[i].charAt(j));
	            System.out.println(map[i].charAt(n-1));
	        }
	        System.out.println(map[n-1]);
        }
        sc.close();
    }
}