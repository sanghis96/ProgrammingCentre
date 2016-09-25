import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class calculator extends JFrame implements ActionListener
{
	private JTextField jtfArea = new JTextField();
	//private JScrollPane jsp = new JScrollPane(jtfArea);
	private JButton jb1 = new JButton("1");
	private JButton jb2 = new JButton("2");
	private JButton jb3 = new JButton("3");
	private JButton jb4 = new JButton("4");
	private JButton jb5 = new JButton("5");
	private JButton jb6 = new JButton("6");
	private JButton jb7 = new JButton("7");
	private JButton jb8 = new JButton("8");
	private JButton jb9 = new JButton("9");
	private JButton jb0 = new JButton("0");
	private JButton jbAdd = new JButton("+");
	private JButton jbSub = new JButton("-");
	private JButton jbMul = new JButton("x");
	private char divSymbol = 247;
	private JButton jbDiv = new JButton("" + divSymbol);
	private JButton jbEq = new JButton("=");
	private JButton jbDot = new JButton(".");
	
	String expr = "(";
	
	public calculator()
	{
		JPanel jpKeys = new JPanel(new GridLayout(4,4,5,5));
		jpKeys.add(jb1);
		jpKeys.add(jb2);
		jpKeys.add(jb3);
		jpKeys.add(jbDiv);
		jpKeys.add(jb4);
		jpKeys.add(jb5);
		jpKeys.add(jb6);
		jpKeys.add(jbMul);
		jpKeys.add(jb7);
		jpKeys.add(jb8);
		jpKeys.add(jb9);
		jpKeys.add(jbSub);
		jpKeys.add(jb0);
		jpKeys.add(jbDot);
		jpKeys.add(jbEq);
		jpKeys.add(jbAdd);
		
		add(jtfArea,BorderLayout.NORTH);
		//add(jsp,BorderLayout.EAST);
		add(jpKeys);
		
		//jtfArea.setHorizontalAlignment(JTextField.RIGHT);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
		jb0.addActionListener(this);
		jbAdd.addActionListener(this);
		jbSub.addActionListener(this);
		jbMul.addActionListener(this);
		jbDiv.addActionListener(this);
		jbDot.addActionListener(this);
		jbEq.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		try{
		if(e.getSource() == jb1)
			expr += "1";
		else if(e.getSource() == jb2)
			expr += "2";
		else if(e.getSource() == jb3)
			expr += "3";
		else if(e.getSource() == jb4)
			expr += "4";
		else if(e.getSource() == jb5)
			expr += "5";
		else if(e.getSource() == jb6)
			expr += "6";
		else if(e.getSource() == jb7)
			expr += "7";
		else if(e.getSource() == jb8)
			expr += "8";
		else if(e.getSource() == jb9)
			expr += "9";
		else if(e.getSource() == jb0)
			expr += "0";
		else if(e.getSource() == jbDot)
			expr += ".";
		else if(e.getSource() == jbAdd)
			expr += "+";
		else if(e.getSource() == jbSub)
			expr += "-";
		else if(e.getSource() == jbMul)
			expr += "*";
		else if(e.getSource() == jbDiv)
			expr += "/";
		jtfArea.setText(expr.substring(1, expr.length()));
		if(e.getSource() == jbEq)
		{	
			if(expr.length() == 1)
				JOptionPane.showMessageDialog(null,"Invald Expression!!!");
			else
			{
				expr += ")";
				try{
					jtfArea.setText(evaluateExpression(expr));
				}catch(Exception ex)
				{	ex.printStackTrace();JOptionPane.showMessageDialog(null,"Invald Expression!!!");	}
				expr = "(";
			}
		}
		}catch(Exception ex)
		{	JOptionPane.showMessageDialog(null,"ERORR.... ");	}
	}
	private class Stack<T>
	{
		private java.util.ArrayList<T> stack = new java.util.ArrayList<T>();
		int getSize()
		{	return stack.size();	}
		void push(T ob)
		{	stack.add(ob);	}
		T pop()
		{	return stack.remove(getSize() - 1);	}
		T peek()
		{	return stack.get(getSize() - 1);	}
		boolean isEmpty()
		{	return stack.isEmpty();	}
	}
	String evaluateExpression(String expression)
	{
		Stack<Integer> operandStack = new Stack<Integer>();
		Stack<Character> operatorStack = new Stack<Character>();
		java.util.StringTokenizer tokens = new java.util.StringTokenizer(expression,"()+-*/",true);
		while(tokens.hasMoreTokens())
		{
			String token = tokens.nextToken().trim();
			System.out.println(token);
			//System.out.println(operandStack.peek());
			//System.out.println(operatorStack.peek());
			if(token.length() == 0)
				continue;
			else if(token.charAt(0)=='+' || token.charAt(0)=='-')
			{
				while(!operatorStack.isEmpty() && (operatorStack.peek()=='+' || operatorStack.peek()=='-' || operatorStack.peek()=='*' || operatorStack.peek()=='/'))
					processAnOperator(operandStack,operatorStack);
				operatorStack.push(token.charAt(0));
			}
			else if(token.charAt(0)=='*' || token.charAt(0)=='/')
			{
				while(!operatorStack.isEmpty() && (operatorStack.peek()=='*' || operatorStack.peek()=='/'))
					processAnOperator(operandStack,operatorStack);
				operatorStack.push(token.charAt(0));
			}
			else if(token.trim().charAt(0) == '(')
				operatorStack.push('(');
			else if(token.trim().charAt(0) == ')')
			{
				while(operatorStack.pop() != '(')
					processAnOperator(operandStack,operatorStack);
				operatorStack.pop();
			}
			else
				operandStack.push(new Integer(token));
		}
		while(!operatorStack.isEmpty())
			processAnOperator(operandStack,operatorStack);
		return ("" + operandStack.pop());
	}
	void processAnOperator(Stack<Integer> operandStack,Stack<Character> operatorStack)
	{
		char op = operatorStack.pop();
		Integer op1 = operandStack.pop();
		Integer op2 = operandStack.pop();
		if(op == '+')
			operandStack.push(op2 + op1);
		else if(op == '-')
			operandStack.push(op2 - op1);
		else if(op == '*')
			operandStack.push(op2 * op1);
		else if(op == '/')
			operandStack.push(op2 / op1);
	}
}


public class MyCalculator 
{
	public static void main(String[] args) 
	{
		calculator calci = new calculator();
		calci.setTitle("CALCULATOR");
		calci.setLocationRelativeTo(null);
		calci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calci.pack();
		calci.setVisible(true);
	}
}
