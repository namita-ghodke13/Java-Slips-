/*Slip - 10
Q.2) Write a program to create a package name student. Define class StudentInfo with 
method to display information about student such as rollno, class, and percentage. Create 
another class StudentPer with method to find percentage of the student. Accept student 
details like rollno, name, class and marks of 6 subject from user.*/

import Student.StudentInfo;
import Student.StudentPer;
import java.util.*;
public class StudentDemo
{
     public static void main(String[] args)
     {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Roll No :");
	     int rno=sc.nextInt();
	     System.out.println("Enter Name : ");
	     String name=sc.next();
	     System.out.println("Enter Class : ");
	     String c=sc.next();
	     System.out.println("Enter Six Subject Marks : ");
	     int m[]=new int[6];
	     for(int i=0;i<6;i++)
	           m[i]=sc.nextInt();
	 
    	 StudentPer ob=new StudentPer();
	     float p=ob.calculate(m);
	     StudentInfo ob1=new StudentInfo();
	     ob1.display(rno, name, c, p);
     }
}