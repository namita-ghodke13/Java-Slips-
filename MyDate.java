/*Slip - 21
Q.1) Define a class MyDate(Day, Month, year) with methods to accept and display a 
MyDateobject. Accept date as dd,mm,yyyy. Throw user defined exception 
"InvalidDateException" if the date is invalid.*/

import java.util.*;
class InvalidDateException extends Exception
{
     public String toString()
     {
         return "Date is Invalid....";
     }
}
public class MyDate
{
     int dd,mm,yy,f=0;
     Scanner sc=new Scanner(System.in);
     MyDate()
     {
         System.out.println("Enter Date as dd-mm-yyyy : ");
         dd=sc.nextInt();
         mm=sc.nextInt();
         yy=sc.nextInt();
         try
         {
             if(mm>=1 || mm<=12)
             {
                 if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)
                 {
                     if(dd>=1 && dd<=31)
                         f=1;
                     else
                         throw new InvalidDateException();
                 }
                 if(mm==2)
                 {
                     if(dd>=1 && dd<=28)
                         f=1;
                     else
                         throw new InvalidDateException();
                 }
                 if(mm==4 || mm==6 || mm==9 || mm==11)
                 {
                     if(dd>=1 && dd<=30)
                         f=1;
                     else
                         throw new InvalidDateException();
                 } 
             }
             else
             {
                 throw new InvalidDateException();
             }
         }
         catch(InvalidDateException e)
         {
             System.out.println("\nError : "+e);
         }
     }
     void display()	
     {
    	  System.out.println("Date is Valid");
          System.out.println("DD-MM-YYYY");
          System.out.println(dd+"-"+mm+"-"+yy);
     }
     public static void main(String arg[])
     {
          MyDate ob=new MyDate();
          if(ob.f==1)
          {
              ob.display();
          }
     }
}