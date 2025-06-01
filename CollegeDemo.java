/*Slip - 12
Q.1) Write a program to create parent class College(cno, cname, caddr) and derived class 
Department(dno, dname) from College. Write a necessary methods to display College 
details.*/

import java.util.*; 
class College 
{ 
      int cno; 
      String cname; 
      String caddrs; 
} 
class Department extends College 
{ 
     int dno; 
     String dname; 
     Scanner sc = new Scanner(System.in); 
     public void accept() 
     { 
         System.out.println("Enter College No : "); 
         cno=sc.nextInt(); 
         System.out.println("Enter College Name : "); 
         cname=sc.next(); 
         System.out.println("Enter College Address : "); 
         caddrs=sc.next(); 
         System.out.println("Enter Department No : "); 
         dno=sc.nextInt(); 
         System.out.println("Enter Department Name : "); 
         dname=sc.next(); 
     } 
     public void display() 
     { 
         System.out.println("\nCollege No = "+cno); 
         System.out.println("College Name = "+cname); 
         System.out.println("College Address = "+caddrs); 
         System.out.println("Department No = "+dno); 
         System.out.println("Department Name = "+dname); 
     } 
}
public class CollegeDemo
{
     public static void main(String a[]) 
     { 
         Department ob=new Department(); 
         ob.accept(); 
         ob.display(); 
     } 
} 