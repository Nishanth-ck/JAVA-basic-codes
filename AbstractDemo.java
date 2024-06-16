package Test100;

import java.util.Scanner;

abstract class Shape
{
	int a,b;
	abstract public void printPerimeter();
	abstract public void printArea();
}

class Triangle extends Shape
{

	@Override
	public void printPerimeter() {
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c sides of triangle:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		double triangle_perimeter = (a+b+c);
		
		System.out.println("The perimeter of the trianle is : "+ triangle_perimeter);
		
	}

	@Override
	public void printArea() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and height of triangle:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		double triangle_area = (0.5*a*b);
		
		System.out.println("The area of the triangle is : "+ triangle_area);
		
	}
	
}

class Circle extends Shape
{

	@Override
	public void printPerimeter() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle : ");
		a = sc.nextInt(); 
		
		double circle_circumference = (2*3.14*a);
		
		System.out.println("The circumference of the circle is :"+ circle_circumference);
	}

	@Override
	public void printArea() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle : ");
		a = sc.nextInt(); 
		
		double circle_area = (3.14*a*a);
		
		System.out.println("The area of the circle is :"+ circle_area);
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.printPerimeter();
		t.printArea();
		
		Circle c = new Circle();
		c.printPerimeter();
		c.printArea();

	}

}
