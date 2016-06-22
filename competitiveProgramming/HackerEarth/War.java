import java.util.*;
import java.io.*;

class War 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
        	int n = sc.nextInt();
        	int[] bob = new int[n];
        	int[] alice = new int[n];
        	for(int i=0; i<n; i++)
        		bob[i] = sc.nextInt();
        	for(int i=0; i<n; i++)
        		alice[i] = sc.nextInt();
        	int maxStrengthBob = maxStrength(bob);
        	int maxStrengthAlice = maxStrength(alice);
        	if(maxStrengthBob == maxStrengthAlice)
        		System.out.println("Tie");
        	else if(maxStrengthBob > maxStrengthAlice)
        		System.out.println("Bob");
        		else
        			System.out.println("Alice");
        }
    }
    private static int maxStrength(int[] player)
    {
    	int max = 0;
    	for(int i=0; i<player.length; i++)
    		if(player[i] > max)
    			max = player[i];
    	return max;
    }
}
