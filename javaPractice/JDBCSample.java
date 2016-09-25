import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class masti extends JFrame implements ActionListener
{
	private Connection connect;
	private Statement stmt;
	private ResultSet rs;
	
	private JTextField jtfName = new JTextField("Enter Name");
	private JButton jbtSearch = new JButton("Search");
	masti()
	{
		add(jtfName);
		add(jbtSearch);
		
		initializeDB();
		
		jbtSearch.addActionListener(this);
	}
	void initializeDB()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:6957/samdata","root","tiger");		
			stmt = connect.createStatement();
		}catch(Exception ex){	ex.printStackTrace();	}
	}
	public void actionPerformed(ActionEvent e)
	{
		try{
			rs = stmt.executeQuery("select * from frnds where frndName = \"" + jtfName.getText() + "\"" );
			while(rs.next())
				JOptionPane.showMessageDialog(null, "Name    :   " + rs.getString(2) + "\nAge        :   " + rs.getString(3) + "\nD.O.B.    :   " + rs.getString(4) + "\nBranch  :  " + rs.getString(5) + "\nFrom      :  " + rs.getString(6));
			connect.close();
		}catch(Exception ex){	System.out.println("Error in printing");ex.printStackTrace();	}
	}
}
public class JDBCSample 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		masti m = new masti();
		m.setTitle("Get Info");
		m.setSize(100,150);
		m.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//m.pack();
		m.setVisible(true);
	}
}
