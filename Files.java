/*Slip - 27
Q.2) Write a program to accept a string as command line argument and check whether it 
is a file or directory. Also perform operations as follows:
i)If it is a directory,delete all text files in that directory. Confirm delete operation from
  user before deleting text files. Also, display a count showing the number of files deleted,
  if any, from the directory.
ii)If it is a file display various details of that file.*/

import java.util.*; 
import java.io.*; 
public class Files 
{ 
     public static void main(String[] args) 
     { 
         Scanner sc=new Scanner(System.in); 
         String fname=args[0]; 
         File f=new File(fname); 
         if(f.isFile()) 
         { 
             System.out.println("File Name : "+ f.getName()); 
             System.out.println("File Length : "+ f.length()); 
             System.out.println("File Absolute Path : "+ f.getAbsolutePath()); 
             System.out.println("File Path : "+ f.getPath()); 
         } 
         else if(f.isDirectory()) 
         { 
             System.out.println("Are you Sure you want to Delete all Files (Press 1) : \n"); 
             int n=sc.nextInt(); 
             if(n==1) 
             { 
                   String[] s1=f.list(); 
                   String a=".txt"; 
                   for(String str: s1) 
                   { 
                       System.out.println(str); 
                       if(str.endsWith(a)) 
                       { 
                           File f1=new File(fname, str); 
                           System.out.println(str+"-->Deleted"); 
                           f1.delete(); 
                       } 
                   } 
             } 
             else 
                 System.out.println("OKK"); 
         } 
     } 
}