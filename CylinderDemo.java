/*Slip - 11
Q.1) Define an interface "Operation" which has method volume( ).Define a constant PI 
having a value 3.142 Create a class cylinder which implements this interface 
(members – radius,height). Create one object and calculate the volume.*/

interface Operation
{
    void volume(float r,float h);
    float PI=3.14f;
}
class Cylinder implements Operation
{
     public void volume(float r,float h)
     {
	     float v=PI*r*r*h;
	     System.out.println("\nVolume of Cylinder = "+v);
     }
}
public class CylinderDemo
{
     public static void main(String[] args)
     {
  	     Cylinder ob=new Cylinder();
	     ob.volume(5.3f, 8.4f);
     }  
}