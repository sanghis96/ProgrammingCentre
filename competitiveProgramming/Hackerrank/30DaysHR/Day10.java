import java.io.*;
import java.util.*;

public class binaryNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = convertToBinary(num);
        int count=0, max=0;
        for(int i=0; i<s.length(); i++)
        {   
            if(s.charAt(i) == '0')
                count=0;
            else if(s.charAt(i) == '1')
                count++;
            if(count>max)
                max=count;
        }
        System.out.println(max);
    }
    private static String convertToBinary(int number)
    {
        if(number > 0)
            return convertToBinary(number/2) + number%2;
        return "";
    }
}
