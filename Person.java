/*Slip - 30
Q.1) Write program to define class Person with data member as Personname,Aadharno, 
Panno.Accept information for 5 objects and display appropriate information (use this 
keyword).*/

import java.util.*;
public class Person
{
	String pname,adhar,pan;
	void accept(String pname,String adhar,String pan)
	{
		this.pname=pname;
		this.adhar=adhar;
		this.pan=pan;
	}
	void disp()
	{
		System.out.println("\nPerson Name = "+pname);
		System.out.println("Person Adhar Number = "+adhar);
		System.out.println("Person Pancard Number = "+pan);
	}
    public static void main(String[] args)
    {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Limit : ");
	    int n=sc.nextInt();
	    Person ob[]=new Person[n];
	    for(int i=0;i<n;i++)
	    {
	        ob[i]=new Person();
	        System.out.println("Enter Person Name : ");
	        String pname=sc.next();
	        System.out.println("Enter Person Aadhar Number : ");
	        String ad=sc.next();
	        System.out.println("Enter Person Pancard Number : ");
	        String pan=sc.next();
	        ob[i].accept(pname, ad, pan);
	    }
	    for(int i=0;i<n;i++)
	    {
		    ob[i].disp();
	    }
    }
}