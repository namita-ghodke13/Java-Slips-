/*Slip - 20
Q.2) Write a package for Operation, which has two classes, Addition and Maximum. 
Addition has two methods add () and subtract (), which are used to add two integers and 
subtract two,float values respectively. Maximum has a method max () to display the 
maximum of two integers.*/

import Operation.Maximum;

import java.util.*; 
class OperationDemo
{ 
      public static void main (String args[]) 
      { 
           int n1,n2; 
           float num1,num2; 
           Scanner sc=new Scanner(System.in); 
           System.out.println("Enter First Number (Integer Value) : "); 
           n1=sc.nextInt(); 
           System.out.println("Enter Second Number (Integer Value) : "); 
           n2=sc.nextInt(); 
           System.out.println("Enter Third Number (Float Value) : "); 
           num1=sc.nextFloat(); 
           System.out.println("Enter Fourth Number (Float Value) : "); 
           num2=sc.nextFloat();  
           Maximum ob1=new Maximum(n1,n2,num1,num2); 
 
           ob1.add(); 
           ob1.sub(); 
           ob1.max(); 
      } 
} 