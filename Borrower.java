/*Slip - 17
Q.1) Design a Super class Customer (name, phone-number). Derive a class Depositor
(accno , balance) from Customer. Again, derive a class Borrower (loan-no, loan-amt) from 
Depositor. Write necessary member functions to read and display the details of 'n' 
customers.*/

import java.util.*; 
class Cust
{ 
    String name; 
    long Pno; 
} 
class Depositer extends Cust 
{ 
    long accno; 
    double bal; 
} 
public class Borrower extends Depositer 
{ 
    int loanno; 
    double loanamt;  
    void read() 
    { 
    	Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Name : ");
        this.name = sc.next(); 
        System.out.println("Enter Phone No : ");
        this.Pno = sc.nextLong(); 
        System.out.println("Enter Account No : ");
        this.accno = sc.nextLong(); 
        System.out.println("Enter Balance : ");
        this.bal = sc.nextDouble(); 
        System.out.println("Enter Loan No : ");
        this.loanno = sc.nextInt(); 
        System.out.println("Enter Loan Amount : ");
        this.loanamt = sc.nextDouble(); 
    } 
    void display() 
    { 
        System.out.println("Details -\n"); 
        System.out.println("Name : " +this.name); 
        System.out.println("Phone No : "+this.Pno); 
        System.out.println("Account No : " +this.accno); 
        System.out.println("Balance : " +this.bal); 
        System.out.println("Loan No : "+this.loanno); 
        System.out.println("Loan Amount : "+this.loanamt); 
        System.out.println("------------------------------------");  
    } 
    public static void main(String args[])
    { 
        int i; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Limit : ");
        int n =sc.nextInt(); 
        Borrower[] l = new Borrower[n]; 
        for(i=0;i<n;i++)
        { 
            l[i] = new Borrower(); 
            l[i].read(); 
        } 
        for(i=0;i<n;i++)
        { 
            l[i].display(); 
        } 
    } 
}