/*Slip - 16
Q.1) Write a program to find the Square of given number using function interface. */

interface Square
{
    void calculate(int c);	
}
public class SquareDemo implements Square
{
     public void calculate(int c)
     {
	     int s=c*c;
	     System.out.println("Square = "+s);
     }
     public static void main(String[] args)
     {
         SquareDemo ob=new SquareDemo();
         ob.calculate(5);
     }
}