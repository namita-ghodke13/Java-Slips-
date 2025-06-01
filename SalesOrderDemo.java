/*Slip - 6
Q.2) Create an abstract class "order" having members id, description. Create two 
subclasses "PurchaseOrder" and "SalesOrder" having members customer name and 
Vendor name respectively. Define methods accept and display in all cases. Create 3 
objects each of Purchase Order and Sales Order and accept and display details.*/

import java.util.*;
abstract class order
{
	  Scanner sc = new Scanner(System.in);
	  int id;
	  String description;
	  abstract void accept();
	  abstract void display();
}
class PurchaseOrder extends order
{
	  String customername;
	  void accept()
	  {
		   System.out.println("\nEnter Customer Id : ");
		   id=sc.nextInt();
	  	   System.out.println("Enter Customer Description : ");
		   description=sc.next();
		   System.out.println("Enter Customer Name : ");
		   customername=sc.next();
	  }
	  void display()
	  {
		   System.out.println("\nCustomer Id = "+id);
		   System.out.println("Customer description = "+description);
		   System.out.println("Customer name = "+customername);
	  }
}
class SalesOrder extends order
{
	String Vendorname;
	void accept()
	{
		System.out.println("Enter Vendor Id : ");
		id=sc.nextInt();		
		System.out.println("Enter Vendor Description : ");
		description=sc.next();
		System.out.println("Enter Vendor Name : ");
		Vendorname=sc.next();
	}
	void display()
	{
		System.out.println("\nVendor Id = "+id);
		System.out.println("Vendor Description = "+description);
		System.out.println("Vendor Name = "+Vendorname);	
	}
}
public class SalesOrderDemo
{
	public static void main(String ab[])
	{
	    SalesOrder ob1=new SalesOrder();
	    SalesOrder ob2=new SalesOrder();
	    SalesOrder ob3=new SalesOrder();		
		PurchaseOrder ob4=new PurchaseOrder();
		PurchaseOrder ob5=new PurchaseOrder();
		PurchaseOrder ob6=new PurchaseOrder();
		ob1.accept();
		ob2.accept();
		ob3.accept();
		
		ob1.display();
		ob2.display();
		ob3.display();
		
		ob4.accept();
		ob5.accept();
		ob6.accept();
		
		ob4.display();
		ob5.display();
		ob6.display();	
	}
}