package ICPC;

import java.util.Scanner;

public class HelpRobot
{
    public static void main(String[] args) throws Exception
    {
    	Scanner sc= new Scanner(System.in);
    	int T = sc.nextInt();
    	if(T<1 || T>5000)
    		System.exit(0);
    	while(T-- > 0)
    	{
    		int x1=sc.nextInt();
    		int y1=sc.nextInt();
    		int x2=sc.nextInt();
    		int y2=sc.nextInt();
    		if((x1<0 || x1>100)||(x2<0 || x2>100)|| (y1<0 || y1>100)||(y2<0 || y2>100))
    			System.exit(0);
    		int temp = 1;
    		String dir;
    		if(x1==x2)
    		{
    			if(y1>y2)
    				dir="down";
    			else
    				dir="up";
    		}
    		else if(y1==y2)
    		{
    			if(x1>x2)
    				dir="left";
    			else
    				dir="right";
    		}
    		else
    			dir="sad";
    		switch(dir)
    		{
             	case "down":
             		while(temp==1)
             		{
             			y1--;
             			if(y1 == y2)
             				temp = 0;
             		}
             		break;
             		case "up":
             			while(temp == 1)
             			{
             				y1++;
             				if(y1 == y2)
             					temp = 0;
             			}
             			break;
             		case "right":
             			while(temp == 1)
             			{
             				x1++;
             				if(x1 == x2)
             					temp = 0;
             			}
             			break;
             		case "left":
             			while(temp == 1)
             			{
             				x1--;
             				if(x1==x2)
             					temp = 0;
             			}
             			break;
    		}
    		System.out.println(dir);
    	}
    	sc.close();
    }
} 