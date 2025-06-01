/*Slip - 23
Q.2) Write a simple currency converter, as shown in the figure. User can enter the amount 
of "Singapore Dollars", "US Dollars", or "Euros", in floating-point number. The converted 
values shall be displayed to 2 decimal places. Assume that 1 USD = 1.41 SGD, 
1 USD = 0.92 Euro, 1 SGD = 0.65 Euro.*/

import javax.swing.*; 
import java.util.*; 
import java.text.*; 
import java.awt.*; 
import java.awt.event.*; 
public class CurrencyConverter extends KeyAdapter 
{ 
     JLabel l1,l2,l3; 
     JTextField t1,t2,t3; 
     CurrencyConverter() 
     { 
         JFrame ob=new JFrame(); 
         l1=new JLabel("US Dollars "); 
         l2=new JLabel("Singapore Dollars "); 
         l3=new JLabel("Euros "); 
         t1=new JTextField(10); 
         t2=new JTextField(10); 
         t3=new JTextField(10); 
         ob.add(l1); ob.add(t1); 
         ob.add(l2); ob.add(t2); 
         ob.add(l3); ob.add(t3); 
         ob.setVisible(true);
         ob.setTitle("Currency Converter");
         t1.addKeyListener(this); 
         ob.setLayout(new FlowLayout()); 
         ob.setSize(400,400); 
         ob.setDefaultCloseOperation(3); 
     } 
     public void keyReleased(KeyEvent ke) 
     { 
         try 
         { 
               Double USD=Double.parseDouble(t1.getText()); 
               Double S=1.41; 
               Double E=0.92; 
               //Double sgd =Double.parseDouble(t1.getText()); 
               Double SGD= USD * S; 
               //Double euro =Double.parseDouble(t1.getText()); 
               Formatter fob=new Formatter(); 
               fob.format("%.2f",SGD); 
               Double Euro=USD * E; 
               fob.format("%.2f",Euro); 
               t2.setText(""+SGD); 
               t3.setText(""+Euro); 
         } 
         catch(Exception e) 
         { 
               System.out.println("Enter Values in Box : "); 
         } 
     } 
     public static void main(String[] args) 
     { 
           CurrencyConverter ob=new CurrencyConverter(); 
           Scanner sc=new Scanner(System.in);  
     } 
} 