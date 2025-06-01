/*Slip - 4 
Q.2) Write a program to design a screen using Awt that will take a user name and 
password. If the user name and password are not same, raise an Exception with 
appropriate message.User can have 3 login chances only. Use clear button to clear the 
TextFields.*/

import java.awt.*; 
import java.awt.event.*; 
class InvalidPasswordException extends Exception 
{ 
       InvalidPasswordException() 
       { 
            System.out.println("User name and Password is not same"); 
       } 
} 
public class login extends Frame implements ActionListener 
{ 
     Label uname,upass; 
     TextField nametext; 
     TextField passtext,msg; 
     Button login,Clear; 
     Panel p; 
     int attempt=0; 
     char c= '*' ; 
     public void login() 
     { 
        p=new Panel(); 
        uname=new Label("User Name : " ,Label.CENTER); 
        upass=new Label ("Password : ",Label.RIGHT); 
        nametext=new TextField(20); 
        passtext =new TextField(20); 
        passtext.setEchoChar(c); 
        msg=new TextField(10); 
        msg.setEditable(false); 
        login=new Button("Login"); 
        Clear=new Button("Clear"); 
        login.addActionListener(this); 
        Clear.addActionListener(this); 
        p.add(uname); 
        p.add(nametext); 
        p.add(upass); 
        p.add(passtext); 
        p.add(login); 
        p.add(Clear); 
        p.add(msg); 
        add(p); 
        setTitle("Login "); 
        setSize(290,200); 
        setResizable(false); 
        setVisible(true); 
     } 
     public void actionPerformed(ActionEvent ae) 
     { 
        Button btn=(Button)(ae.getSource()); 
        if(attempt<3) 
        { 
           if((btn.getLabel())=="Clear") 
           { 
               nametext.setText(""); 
               passtext.setText(""); 
           } 
           if((btn.getLabel()).equals("Login")) 
           { 
               try 
               { 
                    String user=nametext.getText(); 
                    String upass=passtext.getText(); 
                    if(user.compareTo(upass)==0) 
                    { 
                          msg.setText("Valid"); 
                          System.out.println("Username is Valid"); 
                    } 
                    else 
                    { 
                          throw new InvalidPasswordException(); 
                    } 
               } 
               catch(Exception e) 
               { 
	                 msg.setText("Error..."); 
	           } 
	           attempt++; 
	       } 
	    } 
	    else 
	    { 
	         System.out.println("You have used 3 Attempts....."); 
	         System.exit(0); 
	    } 
	 } 
	 public static void main(String[] args) 
	 { 
	     login ob=new login(); 
	     ob.login(); 
	 } 
}