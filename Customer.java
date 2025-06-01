/*Slip - 29
Q.1) Write a program to create a class Customer(custno,custname,contactnumber,
custaddr).Write a method to search the customer name with given contact number and 
display the details. */

import java.util.*;
public class Customer
{
	 int custno;
	 String custname,contactnumber,custaddr;
	 void accept()
	 {
	   	 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Customer No : ");
		 custno=sc.nextInt();
		 System.out.println("Enter Customer Name : ");
		 custname=sc.next();
		 System.out.println("Enter Customer Address : ");
		 custaddr=sc.next();
		 System.out.println("Enter Customer Contact Number : ");
	 	 contactnumber=sc.next();
	}
	static void search(Customer ob[],String phone,int n)
	{
		int i;
		for(i=0;i<n;i++)
		{
			  if(ob[i].contactnumber.equals(phone))
			  {
				   System.out.println("\nName = "+ob[i].custname);
				   System.out.println("Address = "+ob[i].custaddr);
				   break;
			  }
		}
		if(i==n)
			System.out.println("Phone Number not Found......");
	}
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Limit : ");
	     int n=sc.nextInt();
	     Customer ob[]=new Customer[n];
	     for(int i=0;i<n;i++)
	     {
	    	  ob[i]=new Customer();
		      ob[i].accept();
	     }
	     System.out.println("Enter Phone Number to Search : ");
	     String phone=sc.next();
	     search(ob,phone,n);
    }
}