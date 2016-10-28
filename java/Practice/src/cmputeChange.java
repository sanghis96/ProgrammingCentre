import java.util.Scanner;

public class cmputeChange 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount(Eg. 34.57):");
		double amt = scan.nextDouble();
		int remainingAmt = (int)(amt * 100);
		int noOfOneDollars = remainingAmt / 100;
		remainingAmt %= 100;
		int noOfQuarters = remainingAmt / 25;
		remainingAmt %= 25;
		int noOfDimes = remainingAmt / 10;
		remainingAmt %= 10;
		int noOfNickels = remainingAmt / 5;
		remainingAmt %= 5;
		int noOfPennies = remainingAmt;
		System.out.println("Your amount " + amt + " consists of \n" +"\t" + noOfOneDollars + " dollars\n" + "\t" + noOfQuarters + " quarters\n" + "\t" + noOfDimes + " dimes\n" + "\t" + noOfNickels + " nickels\n" + "\t" + noOfPennies + " pennies");
		scan.close();
	}
}
