/*Slip - 10
Q.1) Write a program to find the cube of given number using functional interface.*/

interface Cube
{
    void calculate(int s);	
}
public class CubeDemo implements Cube
{
     public void calculate(int s)
     {
	     int c=s*s*s;
	     System.out.println("Cube = "+c);
     }
     public static void main(String[] args)
     {
         CubeDemo ob=new CubeDemo();
         ob.calculate(5);
     }
}