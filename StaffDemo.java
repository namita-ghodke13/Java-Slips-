/*Slip - 1
Q.2) Define an abstract class Staff with protected members id and name. Define a 
parameterized constructor. Define one subclass OfficeStaff with member department. 
Create n objects of OfficeStaff and display all details.*/

import java.util.*;
abstract class Staff
{
    protected int id;
    protected String name;
    Staff(int id,String name)
    {
	    this.id=id;
	    this.name=name;
    }
}
class OfficeStaff extends Staff
{
    String dept;
	public OfficeStaff(int id,String name,String dept)
	{
	    super(id,name);
	    this.dept=dept;
	}
	void display()
	{
		System.out.println("\nId = "+id);
		System.out.println("Name = "+name);
		System.out.println("Department = "+dept);
	}
}
public class StaffDemo
{
    public static void main(String[] args)
    {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Limit : ");
	    int n=sc.nextInt();
	    OfficeStaff ob[]=new OfficeStaff[n];
	    for(int i=0;i<n;i++)
	    {
		    System.out.println("Enter Id : ");
		    int id=sc.nextInt();
		    System.out.println("Enter Name : ");
		    String name=sc.next();
		    System.out.println("Enter Department : ");
		    String dept=sc.next();
	    	ob[i]=new OfficeStaff(id, name, dept);
	    }
	    for(int i=0;i<n;i++)
	          ob[i].display();
    }
}