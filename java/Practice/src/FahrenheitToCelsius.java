import java.util.Scanner;

public class FahrenheitToCelsius 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit:");
        double F = sc.nextDouble();
        double C = (5.0 / 9) * (F - 32);
        System.out.println(F + " Fahrenheit is " + C + " degree Celcius");
        sc.close();
	}
}
