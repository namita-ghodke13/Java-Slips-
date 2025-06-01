/*Slip - 27
Q.1) Define an Employee class with suitable attributes having getSalary() method, which 
returns salary withdrawn by a particular employee. Write a class Manager which extends 
a class Employee, override the getSalary() method, which will return salary of manager by
adding traveling allowance, house rent allowance etc.*/

import java.util.*; 
class Employee1
{ 
      int BasicSalary=35000; 
      public void getSalary() 
      { 
          System.out.println("\nEmployee Salary : "+BasicSalary); 
      } 
} 
public class Manager extends Employee1 
{ 
      int traveling =2000; 
      int rent =5000;  
      public void getSalary() 
      {  
          System.out.println("\nManager Salary : "+(BasicSalary+traveling+rent)); 
          System.out.println("Basic Salary : "+BasicSalary); 
          System.out.println("Traveling Allowance : "+traveling); 
          System.out.println("House Rent Allowance : "+rent); 
      } 
      public static void main(String[] args) 
      { 
          Scanner sc=new Scanner(System.in); 
          System.out.println("Press 1 for Employee Salary and 0 for Manager Salary -"); 
          int ch=sc.nextInt(); 
          if(ch==1) 
          { 
              Employee1 Eob=new Employee1(); 
              Eob.getSalary(); 
          } 
          else if(ch == 0) 
          { 
              Manager Mob=new Manager(); 
              Mob.getSalary(); 
          } 
          else
              System.out.println("Entered Choice is Wrong");  
      } 
} 