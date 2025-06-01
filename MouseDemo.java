/*Slip - 8
Q.2) Design a screen to handle the Mouse Events such as MOUSE_MOVED and 
MOUSE_CLICKED and display the position of the Mouse_Click in a TextField.*/

import java.awt.*;
import java.awt.event.*;
public class MouseDemo extends Frame implements MouseListener,MouseMotionListener
{
    TextField t1;	
	MouseDemo()
	{
	     setVisible(true);
	     setSize(500,500);
	     setLayout(new FlowLayout());
	     t1=new TextField(30);
	     add(t1);
	     addMouseListener(this);
	     addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		t1.setText("X pos="+me.getX()+" Y pos="+me.getY());
	}
	public void mouseEntered(MouseEvent me)
	{}
	public void mouseReleased(MouseEvent me)
	{}
	public void mouseExited(MouseEvent me)
	{}
	public void mousePressed(MouseEvent me)
	{}
	public void mouseMoved(MouseEvent me)
	{
	 t1.setText("X Position = "+me.getX()+","+" Y Position = "+me.getY());
	}
	public void mouseDragged(MouseEvent me)
	{}
    public static void main(String[] args)
    {
	   MouseDemo ob=new MouseDemo();
    }
}