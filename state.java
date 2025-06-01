/*Slip - 5 and Slip - 20
Q.1) Write a Program to illustrate multilevel Inheritance such that country is inherited 
from continent. State is inherited from country. Display the place, state, country and 
continent.*/

import java.util.*; 
class continent 
{ 
     String c1; 
} 
class country extends continent 
{ 
     String c2; 
} 
class state extends country 
{ 
     String s1; 
     String p1; 
     public void display() 
     { 
         System.out.println("\nContinent Name : "+c1+"\n"+"Country Name : "+c2+"\n"+"State Name : "+s1+"\n"+"Place : "+p1); 
     } 
     public static void main(String args[]) 
     { 
         state ob=new state(); 
         Scanner sc=new Scanner(System.in); 
         System.out.println("Enter Continent Name : "); 
         ob.c1=sc.next(); 
         System.out.println("Enter Country Name : "); 
         ob.c2=sc.next(); 
         System.out.println("Enter State : "); 
         ob.s1=sc.next(); 
         System.out.println("Enter Place : "); 
         ob.p1=sc.next(); 
         ob.display(); 
     } 
} 