import java.util.Scanner;

public class DisplayTime 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter seconds:");
		int sec = input.nextInt();
		int min = sec / 60;
		int remainingSec = sec % 60;
		System.out.println(sec + " is " + min + " Minutes " + remainingSec + " Seconds");
		input.close();
	}
}