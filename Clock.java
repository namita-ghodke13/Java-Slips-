/*Slip - 9
Q.1) Define a “Clock” class that does the following :
 a. Accept Hours, Minutes and Seconds
 b. Check the validity of numbers
 c. Set the time to AM/PM mode
Use the necessary constructors and methods to do the above task.*/

import java.util.*; 
public class Clock 
{ 
    int hours,minutes,seconds; 
    Clock() 
    { 
       System.out.println("Enter Time in HH MM SS Format : "); 
       Scanner sc= new Scanner(System.in); 
       this.hours = sc.nextInt(); 
       this.minutes = sc.nextInt(); 
       this.seconds = sc.nextInt(); 
    } 
    void isTimeValid() 
    { 
       if(hours>=0 && hours<24 && minutes>0 &&minutes<60 && seconds>0 && seconds<60) 
              System.out.println("Time is Valid"); 
       else 
              System.out.println("Time is not Valid"); 
    } 
    void setTimeMode() 
    { 
        if(hours<12) 
        { 
            System.out.println("Time =" +hours+":"+minutes+":"+seconds +" AM"); 
        } 
        else 
              hours = hours-12; 
              System.out.println("Time =" +hours+":"+minutes+":"+seconds +" PM"); 
    } 
    public static void main(String args[]) 
    { 
         Clock c = new Clock(); 
         c.isTimeValid(); 
         c.setTimeMode(); 
    } 
} 