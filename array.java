/*Slip - 4
Q.1) Write a program to print an array after changing the rows and columns of a given 
 two-dimensional array.*/

import java.util.*; 
public class array 
{ 
      public static void main(String[] args) 
      { 
    	   Scanner sc = new Scanner(System.in); 
           System.out.println("Enter number of Rows and Columns : "); 
           int r = sc.nextInt(); 
           int c = sc.nextInt(); 
           int mat[][] = new int[r][c]; 
           System.out.println("Enter Array Elements : "); 
           for(int i=0;i<r;i++) 
           { 
               for(int j=0;j<c;j++) 
               { 
                   mat[i][j] = sc.nextInt(); 
               } 
           } 
           System.out.println("Matrix : \n"); 
           for(int i=0;i<c;i++) 
           { 
	          for(int j=0;j<r;j++) 
	          { 
	              System.out.print(" " +mat[j][i]); 
	          } 
	          System.out.println(" "); 
	       } 
	  } 
}