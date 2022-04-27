import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 
 class Myframe extends JFrame implements ActionListener{
    JLabel label1,label2,label3,label4,label5;
	JTextField t1,t2;
	JRadioButton male,female;
	JComboBox day,month,year;
	JTextArea ta1;
	JCheckBox terms;
	JButton submit;
	JLabel msg;
	JTextArea screen;
 
 
    Myframe(){
		    setTitle("Registration Form");
			setSize(700,500);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		    Container c = getContentPane();
			c.setLayout(null);
			
		   label1 = new JLabel("Name");
		   label1.setBounds(20,50,100,20);
		   c.add(label1);
		   
		   t1 = new JTextField();
		   t1.setBounds(130,50,100,20);
		   c.add(t1);
		   
		   
		   label2 = new JLabel("Mobile");
		   label2.setBounds(20,100,100,20);
		   c.add(label2);
		   
		   t2 = new JTextField();
		   t2.setBounds(130,100,100,20);
		   c.add(t2);
		   
		   label3 = new JLabel("Gender");
		   label3.setBounds(20,150,100,20);
		   c.add(label3);
		   
		   male =new JRadioButton("Male");
		   female =new JRadioButton("Female");
		   
		   male.setBounds(130,150,80,20);
		   female.setBounds(220,150,80,20);
		   male.setSelected(true);
		   
		   c.add(male);
		   c.add(female);
		   
		   ButtonGroup gen = new ButtonGroup();
		   gen.add(male);
		   gen.add(female);
		   
		   label4 = new JLabel("DOB");
		   label4.setBounds(20,200,100,20);
		   c.add(label4);
		   
		   String days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		   String months[]={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
		   String years[]={"2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000"};
		   
		   
		   day = new JComboBox(days);
		   month =new JComboBox(months);
		   year = new JComboBox(years);
		   
		   day.setBounds(130,200,50,20);
		   month.setBounds(190,200,50,20);
		   year.setBounds(250,200,60,20);

            c.add(day);
			c.add(month);
			c.add(year);
			
			label5=new JLabel("Address");
			label5.setBounds(20,250,100,20);
			c.add(label5);
			
			ta1 = new JTextArea();
			ta1.setBounds(130,240,200,50);
			c.add(ta1);
			
			terms = new JCheckBox("Please accept terms and conditions ");
			terms.setBounds(50,300,290,20);
			c.add(terms);
			
			
			submit=new JButton("submit");
			submit.setBounds(150,350,90,20);
			c.add(submit);
			
			submit.addActionListener(this);
			
			screen = new JTextArea();
			screen.setBounds(350,50,300,300);
			c.add(screen);
			
			c.setBackground(Color.GRAY);
			
			msg=new JLabel("");
			msg.setBounds(20,400,290,20);
			msg.setForeground(Color.red);
			c.add(msg);
			
			
			
		   
		   setVisible(true);
		   
		   
       }
	   public void actionPerformed(ActionEvent e){
		   if(terms.isSelected()){
			   msg.setText("Registration Successful!!");
			   
			   String name = t1.getText();
			   String mobile =t2.getText();
			   String gender ="male";
			   if(female.isSelected()){
				   gender = "female";				 
			   }
			   String dob =day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem() ;
			   String address = ta1.getText();
			   
			   screen.setText("Name : "+name+"\n"+"Mobile : "+mobile+"\n"+"Gender : "+gender+"\n"+"DOB : "+dob+"\n"+"Address : "+address);
		   }
		   
		   else{
			   msg.setText("Accept terms and conditions to submit");
			   screen.setText("");
		   } 
		   
	   }
 
 }
 class RegistrationForm2{
      public static void main(String args[]){
	   new Myframe();
	  }
	  
	  
	  
 }