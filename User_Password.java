/*Slip - 11
Q.2) Write a program to accept the username and password from user if username and 
password are not same then raise "Invalid Password" with appropriate msg.*/

import java.util.*;
class InvalidUserPass extends Exception
{
     public String toString()
     {
	      return "Invalid Username or Password.....";	
     }
}
public class User_Password
{
     public static void main(String[] args)
     {
         try
         {
	          Scanner sc=new Scanner(System.in);
	          System.out.println("Enter Username : ");
	          String u=sc.next();
	          System.out.println("Enter Password : ");
	          String p=sc.next();
	          if(u.equals(p))
		          System.out.println("Login Successfully...");
	          else 
                  throw new InvalidUserPass();		  
         }
         catch(Exception e)
         {
	          System.out.println(e);
         }
     }
}