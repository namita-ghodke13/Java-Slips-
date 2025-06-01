/*Slip - 19
Q.2) Write a program which shows the combo box which includes list of T.Y.B.Sc.
(Comp. Sci) subjects. Display the selected subject in a text field.*/

import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
class ComboBox 
{ 
	 JFrame f; 
	 JTextField t1; 
	 ComboBox() 
	 { 
	     f=new JFrame("ComboBox Example"); 
	     final JLabel label = new JLabel(); 
	     t1=new JTextField(10); 
	     label.setHorizontalAlignment(JLabel.CENTER); 
	     label.setSize(400,100); 
	     JButton b=new JButton("Show"); 
	     b.setBounds(200,100,75,20); 
	     String languages[]={"C","C++","C#","Java","PHP","Python","JavaScript","HTML"}; 
	     final JComboBox cb=new JComboBox(languages); 
	     cb.setBounds(50, 100,90,20); 
	     f.add(cb); f.add(label); f.add(b); 
	     f.add(t1); 
	     f.setLayout(new FlowLayout()); 
	     f.setSize(350,350); 
	     f.setVisible(true); 
	     b.addActionListener(new ActionListener() 
	     { 
	           public void actionPerformed(ActionEvent e) 
	           { 
	                String data = " " + cb.getItemAt(cb.getSelectedIndex()); 
	                t1.setText(data); 
	           } 
	     }); 
	 } 
	 public static void main(String[] args) 
	 { 
	      new ComboBox(); 
	 } 
} 