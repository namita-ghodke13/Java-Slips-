/*Slip - 25
Q.1) Create a class Student(rollno, name ,class, per), to read student information from the
console and display them (Using BufferedReader class).*/

import java.io.* ; 
public class Student 
{ 
         public static void main(String args[])throws Exception 
         { 
	          InputStreamReader r=new InputStreamReader(System.in); 
	          BufferedReader br=new BufferedReader(r); 
	          System.out.println("Enter Name : "); 
	          String name = br.readLine(); 
	          System.out.println("Enter Roll No : "); 
	          String number=br.readLine(); 
	          System.out.println("Enter Percentage : "); 
	          String per=br.readLine(); 	 
	          System.out.println("Enter Class : "); 
	          String classname=br.readLine(); 	 
	          System.out.println("\nName : "+name); 
	          System.out.println("Roll No : "+number); 
	          System.out.println("Percentage : "+per); 	 
	          System.out.println("Class : "+classname); 
	     } 
} 