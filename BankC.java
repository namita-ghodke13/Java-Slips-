/*Slip - 24
Q.1) Create an abstract class 'Bank' with an abstract method 'getBalance'. Rs.100, Rs.150 
and Rs.200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method 
by creating an object of each of the three classes.*/

abstract class Bank1 
{ 
     public abstract void getBalance(); 
} 
class BankA extends Bank1 
{ 
     int bal=100; 
     public void getBalance() 
     { 
          System.out.println("Balance of BankA is "+bal); 
     } 
} 
class BankB extends Bank1 
{ 
     int bal=150; 
     public void getBalance() 
     { 
          System.out.println("Balance of BankB is "+bal); 
     } 
} 
public class BankC extends Bank1 
{ 
     int bal=200; 
     public void getBalance() 
     { 
         System.out.println("Balance of BankC is "+bal); 
     } 
     public static void main(String args[]) 
     { 
	      BankA a=new BankA(); 
	      BankB b=new BankB(); 
	      BankC c=new BankC(); 
	      a.getBalance(); 
	      b.getBalance(); 
	      c.getBalance(); 
	 } 
}