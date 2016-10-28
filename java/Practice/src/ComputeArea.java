import java.util.Scanner;

public class ComputeArea 
{
	public static void main(String[] args)
	{
	    final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter Radius:");
	    double radius = input.nextDouble();
	    double area = radius * radius * PI;
	    System.out.println("Area for the Circle of Radius " + radius + " is " + area);
	    input.close();
	}
}
