/*Slip - 18
Q.1) Write a program to implement Border Layout Manager.*/

import java.awt.*;
public class BorderDemo extends Frame
{
	Button b1;
	BorderDemo()
	{
	    setVisible(true);
	    setSize(500,500);
	    b1=new Button("Ok");
	    add(b1,BorderLayout.NORTH);
	}
    public static void main(String[] args)
    {
	    new BorderDemo();
    }  
}