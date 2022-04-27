import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialGUI extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	
	FactorialGUI()
	{
		setTitle("Factorial of a Number");
		
		l1=new JLabel("Enter the Number:");
		l2=new JLabel("Factorial is:");
				
		t1=new JTextField(10);
		t2=new JTextField(10);
			
		b1=new JButton("Factorial");
		
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		b1.addActionListener(this);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int n=Integer.parseInt(t1.getText());
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		t2.setText(""+fact);
	}
	public static void main(String args[])
	{
		new FactorialGUI();
	}
	
}