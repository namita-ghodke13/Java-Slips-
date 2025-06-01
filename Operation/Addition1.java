package Operation;

import java.util.*; 
class Addition1 
{ 
     public int addans,n1,n2; 
     public float subans,num1,num2; 
     public Addition1(int n1,int n2,float num1,float num2) 
     { 
         this.n1=n1; 
         this.n2=n2;
         this.num1=num1; 
         this.num2=num2; 
     } 
     public void add() 
     { 
         addans=n1+n2; 
         System.out.println("\nAddition ="+addans); 
     } 
     public void sub() 
     { 
    	 subans=num1-num2; 
         System.out.println("\nSubtraction = "+subans); 
     } 
}