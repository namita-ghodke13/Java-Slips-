/*Slip - 14
Q.1) Write a program to accept a number from the user, if number is zero then throw 
user defined exception "Number is 0" otherwise check whether no is prime or not 
(Use static keyword).*/

import java.util.*;
class InvalidNumber extends Exception
{
    public String toString()
    {
	    return "Number is Zero Error...";	
    }
}
public class Number
{
    static void prime(int n)
    {
	    int i;
	    for(i=2;i<n;i++)
	    {
		    if(n%i==0)
		    {
			    System.out.println("\nNumber is not Prime");
			    break;
		    }
	    }
	    if(i==n)
		    System.out.println("\nNumber is Prime");
    }
    public static void main(String[] args)
    {
       try
       {
	       Scanner sc=new Scanner(System.in);
           System.out.println("Enter Number : ");
           int n=sc.nextInt();
           if(n==0)
    	       throw new InvalidNumber();
           prime(n);
       }
       catch(Exception e)
       {
	       System.out.println(e);
       }
    }
}