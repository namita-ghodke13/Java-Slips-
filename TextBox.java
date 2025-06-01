/*Slip - 17
Q.2) Write Java program to design three text boxes and two buttons using swing. Enter 
different strings in first and second textbox. On clicking the First command button, 
concatenation of two strings should be displayed in third text box and on clicking second 
command button,reverse of string should display in third text box.*/

import java.util.*; 

import javax.swing.*; 

import java.awt.event.*; 
class TextBox implements ActionListener
{ 
      JTextField tf1,tf2,tf3; 
      JButton b1,b2; 
      TextBox()
      { 
          JFrame f= new JFrame(); 
          tf1=new JTextField(); 
          tf1.setBounds(50,50,150,20); 
          tf2=new JTextField(); 
          tf2.setBounds(50,100,150,20); 
          tf3=new JTextField(); 
          tf3.setBounds(50,150,150,20); 
          tf3.setEditable(false); 
          b1=new JButton("Concatenation"); 
          b1.setBounds(30,200,100,50); 
          b2=new JButton("Reverse"); 
          b2.setBounds(150,200,100,50); 
          b1.addActionListener(this); 
          b2.addActionListener(this); 
          f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2); 
          f.setSize(300,300); 
          f.setLayout(null); 
          f.setVisible(true); 
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      } 
      public void actionPerformed(ActionEvent e) 
      { 
          StringBuffer sb = new StringBuffer(); 
          String s1=tf1.getText(); 
          String s2=tf2.getText();
          if(e.getSource()==b1)
          { 
	           String s3= s1+s2; 
	           tf3.setText(s3); 
	      }
          else if(e.getSource()==b2)
          { 
	           String str = s1; 
	           String strArray = ""; 
	           for (int i = str.length()-1; i>=0 ; i--)
	           { 
	               strArray+=str.charAt(i); 
	           } 
	           tf3.setText(strArray); 
	      } 
	  } 
	  public static void main(String[] args) 
	  { 
	        new TextBox(); 
	  }
} 