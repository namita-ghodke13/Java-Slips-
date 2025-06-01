/*Slip - 16
Q.2) Write a program to design a screen using Awt.*/

import java.awt.*; 
public class Screen
{ 
    Menu File; 
    Menu Edit; 
    Menu About; 
    MenuItem i1, i2, i3, i4, i5; 
    Screen()
    { 
        Frame f= new Frame("Java AWT Examples"); 
        MenuBar mb=new MenuBar(); 
        File=new Menu("File"); 
        Edit=new Menu("Edit"); 
        About=new Menu("About"); 
        i1=new MenuItem("New          Ctrl+N"); 
        i2=new MenuItem("Open"); 
        i3=new MenuItem("Save"); 
        i4=new MenuItem("✓ Show About"); 
        i5=new MenuItem("Exit"); 
        File.add(i1); 
        File.add(i2); 
        File.add(i3);
        File.addSeparator();
        File.add(i4);
        File.addSeparator();
        File.add(i5); 
        mb.add(File); 
        mb.add(Edit); 
        mb.add(About); 
        f.setMenuBar(mb); 
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true); 
    } 
    public static void main(String args[]) 
    { 
        Screen scr=new Screen(); 
    } 
}