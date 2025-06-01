/*Slip - 5
Q.2) Write a menu driven program to perform the following operations on 
multidimensional array i.e.matrices :
 Addition
 Multiplication
 Exit */

import java.util.*; 
public class Matrix 
{ 
      Scanner sc = new Scanner(System.in); 
      int a = sc.nextInt(); 
      int b = sc.nextInt(); 
      int M[][] = new int[a][b]; 
      void accept() 
      {
	      int a = this.a; 
	      int b = this.b; 
	      System.out.println("Enter "+(a*b)+ " values for Matrix : "); 
	      for(int i=0;i<a;i++) 
	      { 
	         for(int j=0;j<b;j++) 
	         { 
	            this.M[i][j] = sc.nextInt(); 
	         } 	 
	      } 
	  } 
	  void display() 
	  { 
	      for(int i =0;i<a;i++) 
	      { 
	         for(int j =0;j<b;j++) 
	         { 
	              System.out.print(" "+this.M[i][j]); 
	         } 
	         System.out.println(" "); 
	      } 
	  } 
	  public static void main(String a[]) 
	  { 
	      System.out.println("Enter number of rows and columns for Matrix 1 : "); 
	      Matrix m1 = new Matrix(); 
	      m1.accept(); 
	      System.out.println("Matrix 1 : "); 
	      m1.display(); 
	      System.out.println("Enter number of rows and columns for Matrix 2 : "); 
	      Matrix m2 = new Matrix(); 
	      m2.accept(); 
	      System.out.println("Matrix 2 : "); 
	      m2.display();  
	      int choice; 
	      Scanner sc = new Scanner(System.in); 
	      while(true) 
	      { 
	          System.out.println("\n1: Addition \n2: Multiplication \n3: Exit"); 
	          choice = sc.nextInt(); 
	          switch (choice) 
	          { 
	             case 1: System.out.println("Addition : " ); 
	                         for(int i=0;i<m1.a;i++) 
	                         { 
	                             for(int j=0;j<m1.b;j++) 
	                             { 
	                                 System.out.print(" "+ (m1.M[i][j]+m2.M[i][j])); 
	                             } 
	                             System.out.println(" "); 
	                         } 
	                         break; 
	             case 2: System.out.println("Multiplication : "); 
	                         for(int i=0;i<m2.a;i++) 
	                         { 
	                            for(int j=0;j<m2.b;j++) 
	                            { 
	                                System.out.print(" "+ (m1.M[i][j]*m2.M[i][j])); 
	                            } 
	                            System.out.println(" "); 
	                         } 
	                         break;  
	             case 3: System.exit(0); 
	          } 
	      } 
	  } 
} 