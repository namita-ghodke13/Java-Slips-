package TY;

public class TYMarks 
{ 
     int Theory,Practicals; 
     public TYMarks(int Theory,int Practicals) 
     { 
         this.Theory=Theory; 
         this.Practicals=Practicals; 
     } 
     public void display() 
     { 
         System.out.println("\nMarks -"); 
         System.out.println("Theory\t Practicals"); 
         System.out.println(Theory+"\t"+Practicals); 
     } 
}