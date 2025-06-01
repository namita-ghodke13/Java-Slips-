/*Slip - 14
Q.2) Write a Java program to create a Package “SY” which has a class SYMarks 
(members – ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY 
which has a class TYMarks (members – Theory, Practicals). Create ‘n’ objects of Student 
class (having rollNumber, name, SYMarks and TYMarks). Add the marks of SY and TY 
computer subjects and calculate the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50, 
Pass Class for > =40 else 'FAIL') and display the result of the student in proper format.*/

import SY.SYMarks; 
import TY.TYMarks; 
import java.util.*; 
public class SYTY 
{ 
     int rollno; 
     int ComputerTotal, MathsTotal, ElecTotal, Theory, Practicals; 
     String name; 
     Scanner sc =new Scanner(System.in); 
     public SYTY() 
     {} 
     public SYTY(int rollno,String name) throws Exception 
     { 
         this.rollno = rollno; 
         this.name = name; 
 
         System.out.println("\nEnter SY Marks - "); 
         System.out.println("Enter Computer Marks : "); 
         int ComputerTotal =sc.nextInt(); 
         while((ComputerTotal<0 || ComputerTotal>100)) 
         { 
             System.out.println("\n\tInvalid Marks....."); 
             System.out.println("Please Re-Enter Marks : "); 
             ComputerTotal =sc.nextInt(); 
         } 
         
         System.out.println("\nEnter Maths Marks : "); 
         int MathsTotal=sc.nextInt(); 
         while((MathsTotal<0 || MathsTotal>100)) 
         { 
             System.out.println("\n\tInvalid Marks....."); 
             System.out.println("Please Re-Enter Marks : "); 
             MathsTotal =sc.nextInt();
         } 
 
         System.out.println("\nEnter Electronics Marks : "); 
         int ElecTotal=sc.nextInt(); 
         while((ElecTotal<0 || ElecTotal>100)) 
         { 
             System.out.println("\n\tInvalid Marks....."); 
             System.out.println("Please Re-Enter Marks : "); 
             ElecTotal=sc.nextInt();
         } 
        SYMarks sy = new SYMarks(ComputerTotal, MathsTotal, ElecTotal); 
        System.out.print("\nEnter TY Marks : "); 
        System.out.print("\nEnter Theory Marks : "); 
        int Theory=sc.nextInt(); 
        while((Theory<0 || Theory>100)) 
        { 
            System.out.println("\n\tInvalid Marks....."); 
            System.out.println("Please Re-Enter Marks : "); 
            Theory=sc.nextInt(); 
        } 
        
        System.out.print("\nEnter Practicals Marks : "); 
        int Practicals=sc.nextInt(); 
        while((Practicals<0 || Practicals>100)) 
        { 
            System.out.println("\n\tInvalid Marks....."); 
            System.out.println("Please Re-Enter Marks : "); 
            Practicals=sc.nextInt(); 
        } 
        TYMarks ty = new TYMarks(Theory, Practicals); 
        CalculateGrade(); 
     } 
     public void getdata() throws Exception 
     { 
         System.out.println("\nEnter Number of Students : ");
         int n=sc.nextInt();
         SYTY object[]=new SYTY[n]; 
         for(int i=0; i<n; i++) 
         { 
             System.out.println("\nEnter Roll No : "); 
             int roll = sc.nextInt(); 
             System.out.println("Enter Name : "); 
             String name = sc.next(); 
 
             object[i] = new SYTY(roll,name); 
             System.out.println("-----------------------------------"); 
         } 
     } 
     public void CalculateGrade() 
     { 
          float percentage; 
          percentage = (ComputerTotal + MathsTotal + ElecTotal + Theory + Practicals)/5; 
          System.out.println("Percentage = "+percentage);
          System.out.println("Result : ");  
          if(percentage >= 70) 
              System.out.println("Grade - A");
          else if(percentage >= 60) 
	          System.out.println("Grade - B"); 
	      else if(percentage >= 50) 
	          System.out.println("Grade - C"); 
	      else if(percentage >= 40) 
	          System.out.println("Grade - PASS"); 
	      else 
	          System.out.println("Grade - FAIL"); 
	 } 
	 public static void main(String[] args) throws Exception 
	 { 
	      SYTY st = new SYTY(); 
	      st.getdata(); 
	 } 
} 