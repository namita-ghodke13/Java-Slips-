/*Slip - 26
Q.1) Define a Item class (item_number, item_name, item_price). Define a default and 
parameterized constructor. Keep a count of objects created. Create objects using 
parameterized constructor and display the object count after each object is created.(Use 
static member and method). Also display the contents of each object.*/

public class Item
{ 
      int ino; 
      String nm; 
      double iprice; 
      static int count=0; 
      Item() 
      {
    	  
      } 
      Item(int ino,String nm,double iprice) 
      { 
           this.ino=ino; 
           this.nm=nm; 
           this.iprice=iprice; 
           count++; 
      } 
      public void display() 
      { 
           System.out.println("\nTotal Objects created : "+count); 
           System.out.println("Item No : "+ino+"\nItem Name : "+nm+"\nItem Price : "+iprice); 
      } 
      public static void main(String args[]) 
      { 
         Item ob1=new Item(101,"Dell Laptop",45000.00); 
         ob1.display(); 
         Item ob2=new Item(102,"Lenovo Laptop",33000.00); 
         ob2.display(); 
      } 
}