package Test100;

class Shape1
{
	public void display()
	{
		System.out.println("This is a Shape:");
	}
}


 class Circle1 extends Shape1
{
	public void draw()
	{
		System.out.println("Draw a circle:");
	}
	public void erase()
	{
		System.out.println("Erase a circle:");
	}
}

 class Triangle1 extends Shape1
{
	public void draw()
	{
		System.out.println("Draw a triangle:");
	}
	public void erase()
	{
		System.out.println("Erase a triangle:");
	}
}

 class Square1 extends Shape1
{
	public void draw()
	{
		System.out.println("Draw a square:");
	}
	public void erase()
	{
		System.out.println("Erase a square:");
	}
}

public class InheritanceDemo2 {

	 public static void main(String[] args) {
		
		Circle1 c1 = new Circle1();
		c1.display();
		c1.draw();
		c1.erase();
		
		Triangle1 t1 = new Triangle1();
		t1.display();
		t1.draw();
		t1.erase();
		
		Square1 s1 = new Square1();
		s1.display();
		s1.draw();
		s1.erase();
	}

}
