/*Slip - 15
Q.2) Write a program to define a class Account having members custname, accno. Define 
default and parameterized constructor. Create a subclass called SavingAccount with 
member savingbal, minbal. Create a derived class AccountDetail that extends the class 
SavingAccount with members, depositamt and withdrawalamt. Write a appropriate 
method to display customer details.*/

class Account 
{
      protected String custName;
      protected String accNo;
      public Account() 
      {
           this.custName = "Unknown";
           this.accNo = "0000";
      }
      public Account(String custName, String accNo) 
      {
           this.custName = custName;
           this.accNo = accNo;
      }
}
class SavingAccount extends Account 
{
      protected double savingBal;
      protected double minBal;
      public SavingAccount() 
      { 
           super(); 
           this.savingBal = 0.0;
           this.minBal = 500.0;
      }
      public SavingAccount(String custName, String accNo, double savingBal,double minBal) 
      {
           super(custName, accNo); 
           this.savingBal = savingBal;
           this.minBal = minBal;
      }
}
class AccountDetail extends SavingAccount 
{
      private double depositAmt;
      private double withdrawalAmt;
      public AccountDetail() 
      {
           super(); 
           this.depositAmt = 0.0;
           this.withdrawalAmt = 0.0; 
      }
      public AccountDetail(String custName, String accNo, double savingBal,double minBal, double depositAmt, double withdrawalAmt) 
      {
           super(custName, accNo, savingBal, minBal);
           this.depositAmt = depositAmt;
           this.withdrawalAmt = withdrawalAmt;
      }
      public void displayCustomerDetails() 
      {
           System.out.println("Customer Name : " + custName);
           System.out.println("Account Number : " + accNo);
           System.out.println("Savings Balance : " + savingBal);
           System.out.println("Minimum Balance : " + minBal);
           System.out.println("Deposit Amount : " + depositAmt);
           System.out.println("Withdrawal Amount : " + withdrawalAmt);
      }
}
public class BankAccountDemo 
{
      public static void main(String[] args) 
      {
            AccountDetail account = new AccountDetail("Ravi Sharma", "123456897633",1000.0, 500.0, 200.0, 100.0);
            account.displayCustomerDetails();
      }
}