/*Slip - 25
Q.2) Create the following GUI screen using appropriate layout manager. Accept the name,
class,hobbies from the user and display the selected options in a textbox.*/

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class GUI extends JFrame implements ActionListener,ItemListener 
{ 
     JLabel l1,l2,l3,l4,l5; 
     JTextField tf1; 
     JRadioButton rb1,rb2,rb3; 
     ButtonGroup bg; 
     JCheckBox cb1,cb2,cb3; 
     JPanel p1,p2,p3,p4; 
     GUI() 
     { 
         l1=new JLabel("Your Name : "); 
         l2=new JLabel("Your Class : "); 
         l3=new JLabel("Your Hobbies : "); 
         l4=new JLabel(" "); 
         l5=new JLabel(" "); 
     
         tf1=new JTextField(); 
     
         rb1=new JRadioButton("FY"); 
         rb2=new JRadioButton("SY"); 
         rb3=new JRadioButton("TY"); 
         rb1.addActionListener(this); 
         rb2.addActionListener(this); 
         rb3.addActionListener(this); 
     
         bg=new ButtonGroup(); 
         bg.add(rb1); 
         bg.add(rb2); 
         bg.add(rb3); 
     
         cb1=new JCheckBox("Music"); 
         cb2=new JCheckBox("Dance"); 
         cb3=new JCheckBox("Sports"); 
         cb1.addItemListener(this); 
         cb2.addItemListener(this); 
         cb3.addItemListener(this); 
     
         p1=new JPanel(); 
         p1.setLayout(new GridLayout(1,2)); 
         p1.add(l1); p1.add(tf1); 
         p2=new JPanel(); 
         p2.setLayout(new GridLayout(4,1)); 
         p2.add(l2); 
         p2.add(rb1); 
         p2.add(rb2); 
         p2.add(rb3); 
     
         p3=new JPanel(); 
         p3.setLayout(new GridLayout(4,1)); 
         p3.add(l3); 
         p3.add(cb1); 
         p3.add(cb2); 
         p3.add(cb3);
         
         p4=new JPanel(); 
         p4.setLayout(new GridLayout(1,2)); 
         p4.add(l4); 
         p4.add(l5); 
         
         BorderLayout bob=new BorderLayout(); 
         setLayout(bob); 
         add(p1,BorderLayout.NORTH); 
         add(p2,BorderLayout.WEST); 
         add(p3,BorderLayout.EAST); 
         add(p4,BorderLayout.SOUTH); 
         
         setTitle("INFORMATION"); 
         setSize(500,300); 
         setVisible(true); 
         setDefaultCloseOperation(EXIT_ON_CLOSE);  
     } 
     public void actionPerformed(ActionEvent ae) 
     { 
         String s="\nNAME : "+tf1.getText()+ " \nCLASS : " +ae.getActionCommand(); 
         l4.setText(s); 
     } 
     public void itemStateChanged(ItemEvent ie) 
     { 
         String s=""; 
         if(cb1.isSelected()) 
         s=s+cb1.getText()+" "; 
         if(cb2.isSelected()) 
         s=s+cb2.getText()+" "; 
         if(cb3.isSelected()) 
         s=s+cb3.getText()+" "; 
         l5.setText("\nHOBBIES : "+s); 
     } 
     public static void main(String args[]) 
     { 
         GUI ob=new GUI(); 
     } 
}