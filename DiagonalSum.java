/*Slip - 19
Q.1) Write a program to accept the two dimensional array from user and display sum of 
its diagonal elements.*/

import java.util.*;
public class DiagonalSum
{
     public static void main(String abc[])
     {
          int a[][]=new int[10][10];
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter Number of Rows and Columns : ");
          int m=sc.nextInt();
          int n=sc.nextInt();
          System.out.println("Enter Matrix : ");
          for(int i=0;i<m;i++)
          {
              for(int j=0;j<n;j++)
              {
                  a[i][j]=sc.nextInt();
              }
          }
          int sum=0;
          for(int i=0;i<m;i++)
          {
              for(int j=0;j<n;j++)
              {
                  if(i==j)
                     sum=sum+a[i][j];
              }
          }
          System.out.println("\nSum of Diagonal Elements = "+sum);
     }
}