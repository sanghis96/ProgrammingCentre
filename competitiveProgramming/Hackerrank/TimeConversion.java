import java.util.*;

public class TimeConversion 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String time12 = sc.next();
        String time24 = new String();
        if(time12.substring(8,10).compareTo("AM") == 0)
           if(time12.substring(0,2).compareTo("12") == 0)
                time24 = "00";
           else
                time24 = time12.substring(0,2);
        else
           if(time12.substring(0,2).compareTo("12") == 0)
                time24 = time12.substring(0,2);
           else
                time24 = "" + (Integer.parseInt(time12.substring(0,2)) + 12);
        time24 += time12.substring(2,8);
        System.out.println(time24);
        sc.close();
    }
}