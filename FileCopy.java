/*Slip - 15
Q1) Accept the names of two files and copy the contents of the first to the second. First 
file having Book name and Author name in file.*/

import java.io.*; 
import java.util.*; 
public class FileCopy  
{ 
     public static void main(String[] args) throws Exception 
     { 
	      Scanner sc= new Scanner(System.in); 
	      System.out.println("Enter First File Name : "); 
	      String f1=sc.next(); 
	      System.out.println("Enter Second File Name : "); 
	      String f2=sc.next(); 
	 
	      FileInputStream fis=new FileInputStream(f1); 
	      FileOutputStream fos=new FileOutputStream(f2); 
	      int ch; 
	      while((ch=fis.read())!=-1) 
	      { 
	         fos.write(ch); 
	      } 
	      System.out.println("File Copied Successfully......."); 
	      fis.close(); 
	      fos.close(); 
	 } 
}