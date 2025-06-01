/*Slip - 12
Q.2) Write a java program that works as a simple calculator. Use a grid layout to arrange 
buttons for the digits and for the +, -, *, % operations. Add a text field to display the 
result.*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame implements ActionListener
{
    float a,b,c;
    int ch;
    JPanel p1;
    JPanel p2;
    JTextField t1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq;
    Calculator()
    {
    	super();
    	setTitle("Simple Calculator");
    	setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1=new JPanel();
        p2=new JPanel();
        t1=new JTextField(20);
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        badd=new JButton("+");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        bsub=new JButton("-");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        bmul=new JButton("*");
        b0=new JButton("0");
        bdot=new JButton(".");
        beq=new JButton("=");
        bdiv=new JButton("/");
        p1.add(t1);
        p2.add(b1); p2.add(b2); p2.add(b3); p2.add(badd);
        p2.add(b4); p2.add(b5); p2.add(b6); p2.add(bsub);
        p2.add(b7); p2.add(b8); p2.add(b9); p2.add(bmul);
        p2.add(b0); p2.add(bdot); p2.add(beq); p2.add(bdiv);
        p1.setLayout(new FlowLayout());
        p2.setLayout(new GridLayout(4,4));
        add(p1);
        add(p2);
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bdot.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        beq.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
            t1.setText(t1.getText()+"1");
        if(ae.getSource()==b2)
            t1.setText(t1.getText()+"2");  
        if(ae.getSource()==b3)
            t1.setText(t1.getText()+"3");  
        if(ae.getSource()==b4)
            t1.setText(t1.getText()+"4");
        if(ae.getSource()==b5)
            t1.setText(t1.getText()+"5");
        if(ae.getSource()==b6)
            t1.setText(t1.getText()+"6");
        if(ae.getSource()==b7)
            t1.setText(t1.getText()+"7");
        if(ae.getSource()==b8)
            t1.setText(t1.getText()+"8");
        if(ae.getSource()==b9)
            t1.setText(t1.getText()+"9");
        if(ae.getSource()==b0)
            t1.setText(t1.getText()+"0");
        if(ae.getSource()==bdot)
            t1.setText(t1.getText()+".");
        if(ae.getSource()==badd)
        {
            a=Float.parseFloat(t1.getText());
            t1.setText("");
            ch=1;
        }
        if(ae.getSource()==bsub)
        {
            a=Float.parseFloat(t1.getText());
            t1.setText("");
            ch=2;
        }
        if(ae.getSource()==bmul)
        {
            a=Float.parseFloat(t1.getText());
            t1.setText("");
            ch=3;
        }
        if(ae.getSource()==bdiv)
        {
            a=Float.parseFloat(t1.getText());
            t1.setText("");
            ch=4;
        }
        if(ae.getSource()==beq)
        {
            b=Float.parseFloat(t1.getText());
            if(ch==1)
                c=a+b;
            if(ch==2)
                c=a-b;  
            if(ch==3)
                c=a*b;
            if(ch==4)
                c=a/b;
            t1.setText(""+c);
        }
    }
}
public class Simple_Calculator 
{
	public static void main(String[] args) 
	{
		 Calculator cal=new Calculator();
	}
}
