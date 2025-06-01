/*Slip - 28
Q.1) Write a program that reads on file name from the user, then displays information 
about whether the file exists, whether the file is readable, whether the file is writable, the
type of file and the length of the file in bytes.*/

import java.util.*; 
import java.io.*; 
public class FileReader 
{ 
    public static void main(String ar[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter File Name : ");  
        String f1=sc.next(); 
        File f=new File(f1); 
        if(f.exists()) 
        { 
            System.out.println("Name of the File is "+f.getName()); 
            if(f.canRead()) 
                System.out.println("File is Readable"); 
            else 
                System.out.println("File is not Readable"); 
            if(f.canWrite()) 
	            System.out.println("File is Writeable"); 
	        else 
	            System.out.println("File is not Writeable"); 	 
            	System.out.println("Length of the File = "+f.length()); 
	    } 
	    else 
	       System.out.println("File not Found....."); 
	} 
}