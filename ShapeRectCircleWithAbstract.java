
package anudip_assignment;

import java.util.Scanner;

//Abstract class Shape 
abstract class Shape 
{
protected final double pi = 3.14;

public abstract double calcarea();

}

//Class Circle derived from class Shape
class Circle extends Shape 
{
private double radius;

public Circle(double radius) 
{
   this.radius = radius;
}

@Override
public double calcarea() 
{
   return pi * radius*radius;
}
}

//Class Rectangle derived from class Shape
class Rectangle extends Shape 
{
private double length;
private double breadth;

public Rectangle(double length, double breadth) 
{
   this.length = length;
   this.breadth = breadth;
}

@Override
public double calcarea() 
{
   return length*breadth;
}
}

public class ShapeRectCircleWithAbstract 
{
	 public static void main(String[] args) 
	 {
	     
	     Scanner sc=new Scanner(System.in);
			System.out.print("Enter radius of a circle: ");
			double radius =sc.nextDouble();
			//object of class circle
			Circle A =new Circle(radius);
			double area=A.calcarea();
			
			System.out.print("Enter length of a Rectangle: ");
			double length =sc.nextDouble();
			System.out.print("Enter breadth of a Rectangle: ");
			double breadth =sc.nextDouble();
			//object of class rectangle
			Rectangle B =new Rectangle(length,breadth);
			double area1=B.calcarea();
			
			System.out.println("Area of Circle: "+area);

			System.out.println("Area of Rectangle: "+area1);

			sc.close();
}
}




