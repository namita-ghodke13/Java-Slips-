package Operation;

public class Maximum extends Addition1 
{ 
    public Maximum(int n1,int n2, float num1, float num2) 
    { 
        super(n1,n2,num1,num2); 
    } 
    public void max() 
    { 
       if (n1>n2) 
            System.out.println("\n"+n1+" is Greater than "+n2); 
       else 
            System.out.println("\n"+n2+" is Greater than "+n1); 
    } 
 }