/*Slip - 2
Q.1) Write a program to read the First Name and Last Name of a person, his weight and 
height using command line arguments. Calculate the BMI Index which is defined as the 
individual's body mass divided by the square of their height. 
(Hint : BMI = Wts. In kgs / (ht)^2)*/

public class BMI
{
     public static void main(String[] args)
     {
	     String fname=args[0];
	     String lname=args[1];
	     Double w=Double.parseDouble(args[2]);
	     Double h=Double.parseDouble(args[3]);
	     Double BMI_index=w/(h*h);
	     System.out.println("First Name = "+fname);
	     System.out.println("Last Name = "+lname);
	     System.out.println("Weight = "+w);
	     System.out.println("Height = "+h);
	     System.out.println("BMI Index = "+BMI_index+" kg/m^2");
     }
}