package microvave;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class microvave extends JFrame
{
	public microvave(String frameTitle)
	{
		super(frameTitle);
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(4,3));
		for(int i=1 ; i<=9 ; i++)
			jp1.add(new JButton("" + i));
		jp1.add(new JButton("" + 0));
		jp1.add(new JButton("Start"));
		jp1.add(new JButton("Stop"));
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new BorderLayout());
		jp2.add(new JTextField("Time to be displayed here"),BorderLayout.NORTH);
		jp2.add(jp1,BorderLayout.CENTER);
		add(jp2,BorderLayout.EAST);
		add(new JButton("Food to be placed here"));
	}
	public static void main(String[] args)
	{
		microvave frame = new microvave("Microvave Front Screen");
		//frame.setSize(367,250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
}
