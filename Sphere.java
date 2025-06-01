/*Slip - 8
Q.1) Create a class Sphere, to calculate the volume and surface area of sphere.
(Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))*/

public class Sphere
{
	void volume(float r)
	{
		float v=(4/3)*3.14f*(r*r*r);
		System.out.println("Volume of Sphere = "+v);
	}
	void area(float r)
	{
		float a=4*3.14f*r*r;
		System.out.println("Area of Sphere = "+a);
	}
	public static void main(String[] args) 
	{
	    Sphere ob=new Sphere();
	    ob.volume(5.3f);
	    ob.area(7.3f);
	}
}