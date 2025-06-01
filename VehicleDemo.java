/*Slip - 29
Q.2) Write a program to create a super class Vehicle having members Company and price.
Derive two different classes LightMotorVehicle(mileage) and HeavyMotorVehicle 
(capacity_in_tons). Accept the information for "n" vehicles and display the information in
appropriate form. While taking data, ask user about the type of vehicle first.*/

import java.io.*; 
class Vehicle
{ 
    String company; 
    double price; 
    public void accept() throws IOException 
    { 
        System.out.println("Enter Company and Price of the Vehicle : "); 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        company=br.readLine(); 
        price=Double.parseDouble(br.readLine()); 
    } 
    public void display() 
    { 
        System.out.println("\nCompany : "+company+"\nPrice : "+price); 
    }  
} 
class LightMotorVehicle extends Vehicle 
{ 
    double mileage; 
    public void accept() throws IOException 
    { 
        super.accept(); 
        System.out.println("Enter Mileage of Vehicle : "); 
        BufferedReader br=new BufferedReader(new 
        InputStreamReader(System.in)); 
        mileage=Double.parseDouble(br.readLine()); 
    } 
    public void display() 
    { 
        super.display(); 
        System.out.println("Mileage : "+mileage); 
    } 
}  
class HeavyMotorVehicle extends Vehicle 
{ 
      double captons; 
      public void accept() throws IOException 
      { 
          super.accept(); 
          System.out.println("Enter Capacity of Vehicle in Tons : "); 
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
          captons=Double.parseDouble(br.readLine()); 
      } 
      public void display() 
      { 
          super.display(); 
          System.out.println("Capacity in Tons : "+captons);
      } 
} 
class VehicleDemo 
{ 
      public static void main(String [] args) throws IOException 
      { 
          int i; 
          System.out.println("Enter Type of Vehicle : "); 
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
          System.out.println("1. Light Vehicle"); 
          System.out.println("2. Heavy Vehicle"); 
          int ch=Integer.parseInt(br.readLine()); 
          switch(ch) 
          { 
              case 1: System.out.println("Enter Number of Light Vehicles : "); 
                          int n=Integer.parseInt(br.readLine()); 
                          LightMotorVehicle [] l=new LightMotorVehicle[n]; 
                          for(i=0;i<n;i++) 
                          { 
                                l[i]=new LightMotorVehicle(); 
                                l[i].accept(); 
                          } 
                          for(i=0;i<n;i++) 
                          { 
                                l[i].display(); 
                          } 
                          break; 
              case 2: System.out.println("Enter Number of Heavy Vehicles : "); 
                          int m=Integer.parseInt(br.readLine()); 
                          HeavyMotorVehicle [] h=new HeavyMotorVehicle[m]; 
                          for(i=0;i<m;i++) 
                          { 
                                h[i]=new HeavyMotorVehicle(); 
                                h[i].accept(); 
                          } 
                          for(i=0;i<m;i++)
                          { 
                                h[i].display(); 
                          } 
                          break; 
          } 
      } 
}