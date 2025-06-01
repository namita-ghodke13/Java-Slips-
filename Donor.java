/*Slip - 26
Q.2) Define a class ‘Donor’ to store the below mentioned details of a blood donor name, 
age, address, contactnumber, bloodgroup, date of last donation. Create ‘n’ objects of this
class for all the regular donors at Pune. Write these objects to a file. Read these objects 
from the file and display only those donors’ details whose blood group is ‘A+ve’ and had 
not donated for the recent six months.*/

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
class Donor implements Serializable 
{
     private String name;
     private int age;
     private String address; 
     private String contactNumber;
     private String bloodGroup;
     private String lastDonationDate;
     public Donor(String name, int age, String address, String contactNumber, String bloodGroup, String lastDonationDate) 
     {
          this.name = name;
          this.age = age;
          this.address = address;
          this.contactNumber = contactNumber;
          this.bloodGroup = bloodGroup;
          this.lastDonationDate = lastDonationDate;
     }
     public boolean isEligibleDonor() 
     {
          if (!bloodGroup.equals("A+ve")) 
          {
               return false; 
          }
          DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate lastDonation = LocalDate.parse(lastDonationDate,formatter);
          LocalDate currentDate = LocalDate.now();
          long monthsSinceLastDonation =ChronoUnit.MONTHS.between(lastDonation, currentDate);
          return monthsSinceLastDonation >= 6;
     }
     public void displayDonorDetails() 
     {
          System.out.println("Name : " + name);
          System.out.println("Age : " + age);
          System.out.println("Address : " + address);
          System.out.println("Contact Number : " + contactNumber);
          System.out.println("Blood Group : " + bloodGroup);
          System.out.println("Last Donation Date : " + lastDonationDate);
          System.out.println("------------------------------------------");
     }
     public static void main(String[] args) 
     {
         Donor[] donors = {
            new Donor("Gauri Sharma", 35, "Pune", "1234567890", "A+ve","01/01/2023"),
            new Donor("Om Shinde", 28, "Pune", "9987654321", "B+ve","15/03/2023"),
            new Donor("Rahul Chavan", 42, "Pune", "5556667777", "A+ve","05/10/2022"),
            new Donor("Riya Yadav", 31, "Pune", "8889991111", "O+ve","02/02/2023"),
            new Donor("Sneha Dixit", 29, "Pune", "2223334444", "A+ve","10/07/2023")
         };
         String fileName = "donors.dat";
         try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) 
         {
             for (Donor donor : donors) 
             {
                  oos.writeObject(donor);
             }
             System.out.println("Donor objects written to File Successfully.");
         } 
         catch (IOException e) 
         {
             e.printStackTrace();
         }
         System.out.println("\nDonors with A+ve blood group who haven't donated in the last 6 months :\n");
         try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) 
         {
               while (true) 
               {
                     try 
                     {
                           Donor donor = (Donor) ois.readObject();
                           if (donor.isEligibleDonor()) 
                           {
                               donor.displayDonorDetails();
                           }
                     } 
                     catch (EOFException eof) 
                     {
                           break;
                     }
               }
         } 
         catch (IOException | ClassNotFoundException e) 
         {
              e.printStackTrace();
         }
     }
}