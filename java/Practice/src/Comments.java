import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Comments
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		int mood = 1;
		String comment = JOptionPane.showInputDialog(null , "Enter your comment: ", "Input Comment Box", JOptionPane.QUESTION_MESSAGE);
		String words[] = comment.split(" ");
		int len = words.length;
		boolean flag = false;
		Scanner positive = new Scanner(new File("E:\\ProgrammingCentre\\java\\Practice\\src\\positiveComment.txt"));
		while(positive.hasNextLine())
		{
			String w = positive.nextLine();
			for(int i=0; i<len; i++)
				if(words[i].equalsIgnoreCase(w))
				{
					mood *= 1;
					flag = true;
					break;
				}
		}
		positive.close();
		if(!flag)
		{
			Scanner negative = new Scanner(new File("E:\\ProgrammingCentre\\java\\Practice\\src\\negativeComment.txt"));
			while(negative.hasNextLine())
			{
				String w = negative.nextLine();
				for(int i=0; i<len; i++)
					if(words[i].equalsIgnoreCase(w))
					{
						mood *= -1;
						break;
					}
			}
			negative.close();
		}
		if(mood > 0)
			JOptionPane.showMessageDialog(null, "\nPositive Comment","Information Message",JOptionPane.INFORMATION_MESSAGE);
		if(mood < 0)
			JOptionPane.showMessageDialog(null, "\nNegative Comment","Information Message",JOptionPane.INFORMATION_MESSAGE);
	}
}
