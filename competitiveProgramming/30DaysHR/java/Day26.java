import java.io.*;
import java.util.*;

public class Day26 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        class date{   int dd,mm,yy;  }
        date da = new date();
        date de = new date();
        da.dd = sc.nextInt();
        da.mm = sc.nextInt();
        da.yy = sc.nextInt();
        de.dd = sc.nextInt();
        de.mm = sc.nextInt();
        de.yy = sc.nextInt();
        int fine;
        if(da.yy < de.yy)
            fine = 0;
        else if(da.yy == de.yy)
        {
            if(da.mm < de.mm)
                fine = 0;
            else if(da.mm == de.mm)
            {   
                if(da.dd <= de.dd)
                    fine = 0;
                else
                    fine = 15 * (da.dd - de.dd);
            }
            else
                fine = 500 * (da.mm - de.mm);
        }
        else
            fine = 10000;
        System.out.println(fine);
    }
}
