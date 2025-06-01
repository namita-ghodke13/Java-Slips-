/*Slip - 7
Q.1) Design a class for Bank. Bank Class should support following operations :
 a. Deposit a certain amount into an account
 b. Withdraw a certain amount from an account
 c. Return a Balance value specifying the amount with details*/

public class Bank 
{ 
     private double balance;  
     public Bank() 
     { 
        balance = 0; 
     } 
     public Bank(double initialBalance) 
     { 
        balance = initialBalance; 
     } 
     public void deposit(double amount) 
     { 
        balance = balance + amount; 
     } 
     public void withdraw(double amount) 
     { 
        balance = balance - amount; 
     } 
     public double getBalance() 
     { 
        return balance; 
     } 
     public static void main(String[] args) 
     { 
         Bank b = new Bank(1000); 
         b.withdraw(250); 
         System.out.println("Withdrawn : "+ b.balance); 
         b.deposit(400); 
         System.out.println("Deposit : "+ b.balance); 
         System.out.println("Balance : "+ b.getBalance()); 
     }
}