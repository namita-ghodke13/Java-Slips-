/*Slip - 6
Q.1) Write a program to display the Employee(Empid, Empname, Empdesignation,
Empsal) information using toString().*/

import java.util.*;
public class Employee
{
    int id,sal;
    String name,desig;
    void accept()
    {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Employee Id : ");
	    id=sc.nextInt();
	    System.out.println("Enter Employee Name : ");
	    name=sc.next();
	    System.out.println("Enter Employee Designation : ");
	    desig=sc.next();
	    System.out.println("Enter Employee Salary : ");
	    sal=sc.nextInt();
    }
    public String toString()
    {
        return "\nEmployee Id = "+id+"\nEmployee Name = "+name+"\nEmployee Designation = "+desig+"\nEmployee Salary = "+sal;			  
    }
    public static void main(String[] args)
    {
        Employee ob=new Employee();
        ob.accept();
        System.out.println(ob);
    }
}