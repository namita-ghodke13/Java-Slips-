/*Slip - 1 
Q.1) Write a Program to print all Prime numbers in an array of ‘n’ elements.
(use command line arguments)*/

public class Prime
{
  public static void main(String[] args)
  {
	   System.out.println("Prime Numbers : ");
	   for(int i=0;i<args.length;i++)
	   {
		   int n=Integer.parseInt(args[i]);
	       int flag=0;
		   for(int j=2;j<n;j++)
		   {
			     if(n%j==0)
			     {
				     flag=1; 
				     break;
			     }
	       }
		   if(flag==0)
		      System.out.print(" "+n);
	   }
   }
}