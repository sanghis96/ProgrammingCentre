import java.io.*;
import java.util.*;
 
class ToggleString 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0; i<s.length(); i++)
        	if(s.charAt(i)>=65 && s.charAt(i)<=90)
        		System.out.print((char)(s.charAt(i)+32));
        	else if(s.charAt(i)>=97 && s.charAt(i)<=122)
        		System.out.print((char)(s.charAt(i)-32));
    }
}
