/*Slip - 21
Q.2) Create an employee class(id,name,deptname,salary). Define a default and 
parameterized constructor. Use �this� keyword to initialize instance variables. Keep a 
count of objects created. Create objects using parameterized constructor and display the 
object count after each object is created. (Use static member and method). Also display 
the contents of each object.*/

public class Emp 
{ 
     int id; 
     String name,deptname; 
     double sal; 
     static int cnt=0; 
     Emp() 
     { 
          cnt++; 
          displayCount(); 
     } 
     Emp(int id,String name,String deptname,double sal) 
     { 
          this.id=id; 
          this.name=name; 
          this.deptname=deptname; 
          this.sal=sal; 
          cnt++; 
          displayCount(); 
     } 
     public static void displayCount() 
     { 
	      System.out.println("Total Objects Created : "+cnt); 
     } 
     public void displayData() 
     { 
          System.out.println(this.id+"\t\t"+this.name+"\t\t\t"+this.deptname+"\t\t\t"+this.sal); 
     } 
     public static void main(String args[]) 
     { 
          Emp e1=new Emp(101,"Maithili","HR    ",120020.20); 
          Emp e2=new Emp(102,"Soham","IT      ",140020.20); 
          Emp e3=new Emp(104,"Akshay","Accounts",100020.20); 
          System.out.println("\nId\t\tName\t\t\tDepartment\t\tSalary\n"); 
          e1.displayData(); 
          e2.displayData(); 
          e3.displayData(); 
     } 
}