import java.io.*;
import java.util.*;

class FinalDestination 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String direction = sc.next();
        int posx=0, posy=0;
        for(int i=0; i<direction.length(); i++)
        	switch(direction.charAt(i))
        	{
        		case 'L' :posx--;break;
        		case 'R' :posx++;break;
        		case 'U' :posy++;break;
        		case 'D' :posy--;break;
        	}
        System.out.println(posx + " " + posy);
    }
}
