/*Slip - 13
Q.2) Write a program to display the system date and time in various formats shown 
below:
Current date is : 31/08/2021
Current date is : 08-31-2021
Current date is : Tuesday August 31 2021
Current date and time is : Fri August 31 15:25:59 IST 2021
Current date and time is : 31/08/21 15:25:59 PM +0530 */

import java.text.SimpleDateFormat; 
import java.util.Date; 
public class date
{ 
    public static void main(String[] args) 
    { 
        Date d = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
        String strDate= formatter.format(d);
        System.out.println("Current date is : "+strDate);  
        SimpleDateFormat formatter1 = new SimpleDateFormat("MM-dd-yyyy"); 
        String strDate1= formatter1.format(d); 
        System.out.println("Current date is : "+strDate1);  
        SimpleDateFormat formatter2 = new SimpleDateFormat("EEEEE MMMMM dd yyyy"); 
        String strDate2= formatter2.format(d); 
        System.out.println("Current date is : "+strDate2);  
        SimpleDateFormat formatter3 = new SimpleDateFormat("EEEEE MMMMM dd HH:mm:ss z yyyy"); 
        String strDate3= formatter3.format(d); 
        System.out.println("Current date and time is : "+strDate3);  
        SimpleDateFormat formatter4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a"); 
        String strDate4= formatter4.format(d); 
        System.out.println("Current date and time is : "+strDate4); 
    } 
}