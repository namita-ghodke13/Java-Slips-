/*Slip - 22
Q.1) Write a program to create an abstract class named Shape that contains two integers 
and an empty method named printArea(). Provide three classes named Rectangle,Triangle 
and Circle such that each one of the classes extends the class Shape. Each one of the 
classes contain only the method printArea() that prints the area of the given shape. (use 
method overriding).*/

import java.util.*; 
abstract class Shape 
{ 
	int n1,n2; 
    public abstract void printArea(); 
} 
class Rectangle extends Shape 
{ 
    Rectangle(int a,int b) 
    { 
         n1=a; 
         n2=b; 
    } 
    public void printArea() 
    { 
        float area; 
        area=n1*n2; 
        System.out.println("Area of Rectangle = "+area); 
    } 
} 
class Triangle extends Shape 
{ 
    Triangle(int a,int b) 
    { 
        n1=a; 
        n2=b; 
    } 
    public void printArea() 
    { 
        float area; 
        area=(n1*n2)/2; 
        System.out.println("Area of Triangle = "+area); 
    } 
} 
class Circle extends Shape 
{ 
    Circle(int a) 
    { 
        n1=a; 
    } 
    public void printArea() 
    {  
        System.out.println("Area of Circle = "+3.142*n1*n1); 
    } 
} 
public class Area 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter 2 Values : "); 
        int n1=sc.nextInt(); 
        int n2=sc.nextInt(); 
        Rectangle ob=new Rectangle(n1,n2);  
        ob.printArea(); 
        Triangle tr=new Triangle(n1,n2); 
        tr.printArea(); 
        Circle cr=new Circle(n1); 
        cr.printArea(); 
    } 
} 