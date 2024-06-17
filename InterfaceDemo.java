package Test100;

interface Resizeable
{
	void resizeWidth(int width);
	void resizeHeight(int height);
}

class Rectangle implements Resizeable
{
	private int width;
	private int height;
	
	public Rectangle(int width,int height)
	{
		this.width = width;
		this.height = height;
	}

	@Override
	public void resizeWidth(int width) {
			this.width = width;
		
	}

	@Override
	public void resizeHeight(int height) {
		this.height = height;
		
	}
	
	public void printSize()
	{
		System.out.println("Width: "+width+ "Height: "+height);
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(100,150);
		rectangle.printSize();
		
		System.out.println("After resizing width and height:");
		rectangle.resizeWidth(150);
		rectangle.resizeHeight(200);
		
		rectangle.printSize();

	}

}
