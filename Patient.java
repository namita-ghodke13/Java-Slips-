/*Slip - 3
Q.2) Define a class patient (patient_name, patient_age, patient_oxy_level,
patient_HRCT_report).Create an object of patient. Handle appropriate exception while 
patient oxygen level less than 95% and HRCT scan report greater than 10, then throw 
user defined Exception “Patient is Covid Positive(+) and Need to Hospitalized” otherwise 
display its information.*/

import java.util.*;
class Covid extends Exception
{
    public String toString()
    {
	    return "\nPatient is Covid Positive(+) and Need to Hospitalized......";
    }
}
public class Patient
{
    String name;
    int age,olevel,hrct;
    void accept()
    {
	    try
	    {
             Scanner sc=new Scanner(System.in);
	         System.out.println("Enter Patient Name : ");
	         name=sc.next();
	         System.out.println("Enter Patient Age : ");
	         age=sc.nextInt();
	         System.out.println("Enter Patient Oxygen Level : ");
	         olevel=sc.nextInt();
	         System.out.println("Enter Patient HRCT Report : ");
	         hrct=sc.nextInt();
	         if(olevel<95&&hrct>=10)
		        throw new Covid();
	         System.out.println("\nPatient Name = "+name);
	         System.out.println("Patient Age = "+age);
	         System.out.println("Patient Oxygen Level = "+olevel);
	         System.out.println("Patient HRCT Report = "+hrct);
	    }
	    catch(Exception e)
	    {
		     System.out.println(e);
	    }
    }
    public static void main(String[] args)
    {
    	 Patient ob=new Patient();
	     ob.accept();
    }
}