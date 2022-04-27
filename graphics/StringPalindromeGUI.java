import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringPalindromeGUI extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JButton b1;
	
	StringPalindromeGUI()
	{
		setTitle("String Palindrome GUI");
		
		l1=new JLabel("Enter the String:");
		l2=new JLabel("");
				
		t1=new JTextField(10);
				
		b1=new JButton("Check");
		
		setLayout(new GridLayout(4,1));
		
		add(l1);
		add(t1);
		add(b1);
		add(l2);
		b1.addActionListener(this);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str=t1.getText();
		StringBuilder sbd = new StringBuilder(str);
		sbd.reverse();
		String rev=sbd.toString();
		if(str.equals(rev))
			{
				l2.setForeground (Color.green);
				l2.setText("Palindrome String");
			}
		else
			{
				l2.setForeground (Color.red);
			    l2.setText("Not a Palindrome String");	
		    }
	}
	public static void main(String args[])
	{
		new StringPalindromeGUI();
	}
	
}

