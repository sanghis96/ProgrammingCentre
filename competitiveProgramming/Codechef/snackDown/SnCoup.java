package snackDown;

import java.util.Scanner;

class SnCoup 
{
    public static void main(String[] args)
    {
        /*
    	int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while(T-->0)
        {
            int n,fence=0;
            n = sc.nextInt();
            char[][] s = new char[2][n];
            for(int i=0;i<2;i++)
            {
                String temp = sc.next();
                s[i] = temp.toCharArray();
            }
            
            int count1=0, count2=0;
            for(int i=0; i<n; i++)
            	if(s[0][i] == '*')
            		count1++;
            for(int i=0; i<n; i++)
            	if(s[1][i] == '*')
            		count2++;
            
            if((count1^count2)  == 1)
            {
            	if(count1 == 0)
                	fence = count2-1;
            	else
                	fence = count1-1;
            }
            else
            	fence = count1>count2?count1:count2;
            
            	/*
            int flag1=0,j;
            for(int i=0;i<n;i++)
            {
                if(s[0][i]=='*'&&s[1][i]=='*')
                {
                    fence++;
                    flag1=1;
                    break;
                }
                else if(i!=n-1)
                {
                    if(s[0][i]=='*'&&s[1][i+1]=='*')
                    {
                        fence++;
                        flag1=1;
                        break;
                    }
                    else if(s[1][i]=='*'&&s[0][i+1]=='*')
                    {
                        fence++;
                        flag1=1;
                        break;
                    }
                }
            }
            for(int i=0;i<n-1;i++)
            {
                    if(s[0][i]=='*'&&s[0][i+1]=='*')
                        fence++;
                    else if(s[1][i]=='*'&&s[1][i+1]=='*')
                        fence++;
                    else if(s[0][i]=='*'&&s[1][i+1]=='*'&&flag1==0)
                        fence++;
                    else if(s[1][i]=='*'&&s[0][i+1]=='*'&&flag1==0)
                        fence++;
                    else
                    {
                        int flag=0;
                        for(j=i+1;j<n;j++)
                        {
                            if(s[0][j]=='*'&&s[0][i]=='*')
                            {
                                fence++;
                                flag=1;
                                break;
                            }
                            else if(s[1][j]=='*'&&s[1][i]=='*'&&flag==0)
                            {
                                fence++;
                                break;
                            }
                            else if(s[1][j]=='*'&&s[0][i]=='*'&&flag1==0)
                            {
                                fence++;
                                break;
                            }
                            else if(s[0][j]=='*'&&s[1][i]=='*'&&flag1==0)
                            {
                                fence++;
                                break;
                            }
                        }
                        i=j-1;
                    }
            }
            
            System.out.println(fence);
        }
        sc.close();*/
        Scanner sc = new Scanner(System.in);
        int testcase,i,j,flag = 0,count = 0,k,flag1 = 0;
        int countb = 0,counta = 0,z;
        String one;
        testcase = sc.nextInt();
        int[] ans = new int[testcase];
        for(i=0;i<testcase;i++)
        {
            flag1 = 0; //flag1 is for horizontal fence
            count = 0; // final count of fence
            int n = sc.nextInt();
            one = sc.next(); //first row as string
            char[] aone = one.toCharArray(); // aone is the first row of characters
            one = sc.next();
            char[] bone = one.toCharArray(); // bone is the second row of characters
            for(j=0;j<n;j++)
            {
                if(aone[j] == '*') 
                    for(k=0;k<n;k++)
                    {
                        if(bone[k] == '*')  // if there is atleast one star in both the rows then count = 1 and flag1 = horizontal row is set
                        {
                             count++;
                             flag1 = 1;
                             break;
                         }
                     }
                if(flag1 == 1)
                    break;
            }
            for(j=0;j<n-1;j++)
            {
                flag = 0; // flag is for same row control mostly
                if(aone[j] == '*' && aone[j+1] == '*') // if any two consecutive stars present in first row then we need a fence also set flag = 1
                {
                    count++;
                    flag = 1;
                }
                if(bone[j] == '*' && bone[j+1] == '*' && flag == 0) // if any two consecutive stars present in second row 
                                         //and no fence offered by the first row i.e flag == 0 we need a fence here
                {
                    flag = 2;
                    count++;
                }
                if(aone[j] == '*' && flag == 0 )
                {    // if a star is present in row one and no consecutive star is present then this condition
                    countb = 0; // count no of stars in 2nd row between two non consecutive stars in row 1
                     for(k=j+2;k<n;k++)
                     {
                         if(aone[k] == '*' && flag == 0)
                         {
                             for(z = j;z<=k;z++)
                             {
                                 if(bone[z] == '*' )
                                     countb++;
                             }
                             if(countb == 1 || countb == 0)//if countb is only one then we need a fence and update the value of j testcase 5 will explain this step
                             {
                                 count++;
                                 flag = 1;
                                 j = k;
                                 break;
                             }
                             // if countb > 1 then those 2 stars are closer than stars in row 1 and hence fence will be divided by them
                         }
                     }
                }
                if(bone[j] == '*' && flag == 0)
                {
                    counta = 0;
                     for(k=j+2;k<n;k++)
                     {
                         if(bone[k] == '*' && flag == 0)
                         {
                             for(z=j;z<=k;z++)
                             {
                                 if(aone[z] == '*')
                                     counta++;
                             }
                             if(counta == 1 || counta == 0)
                             {   count++;
                                 j = k;
                                 flag = 1;
                                 break;
                             }
                         }
                     }
                }
            }
            ans[i] = count;
        }
        for(i=0;i<testcase;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
/*
5
5
**..*
**...
5
**..*
.**.*
4
*...
..*.
5
*..*.
**...
4
*.*.
.*.*
    */