/*Slip - 30
Q.2) Write a program that creates a user interface to perform integer divisions. The user 
enters two numbers in the text fields, Number1 and Number2. The division of Number1 
and Number2 is displayed in the Result field when the Divide button is clicked. If 
Number1 or Number2 were not an integer, the program would throw a 
NumberFormatException. If Number2 were Zero, the program would throw an 
Arithmetic Exception Display the exception in a message dialog box.*/

import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
class Division extends JFrame implements ActionListener 
{ 
     JButton btn1; 
     JTextField t1,t2; 
     JLabel l1,l2,Result; 
     Division() 
     { 
         t1=new JTextField(10); 
         t2=new JTextField(10); 
         Result=new JLabel(); 
         l1=new JLabel("Enter First Number : "); 
         l2=new JLabel("Enter Second Number : "); 
         btn1=new JButton("Divide"); 
         add(l1); 
         add(t1); 
         add(l2); 
         add(t2); 
         add(btn1); 
         add(Result); 
         setLayout(new FlowLayout()); 
         btn1.addActionListener(this); 
         setVisible(true); 
         setSize(300,400); 
     } 
     public void actionPerformed(ActionEvent ae) 
     { 
         try 
         { 
             int v1=Integer.parseInt(t1.getText()); 
             int v2=Integer.parseInt(t2.getText()); 
             int ans=v1/v2;  
             Result.setText(ans+" "); 
         } 
         catch(NumberFormatException e) 
         { 
             System.out.println("Enter Valid Number !"); 
         } 
         catch(ArithmeticException o) 
         { 
             System.out.println("Divided by Zero......"); 
         } 
     } 
     public static void main(String args[]) 
     { 
          Division ob1=new Division(); 
     } 
}