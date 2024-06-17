package Test100;

import java.util.Scanner;

public class StackOperation {
	
	static void push(int item,int top[],int array[])
	{
		if(top[0] == 9)
		{
			System.out.println("Stack Overflow");
			return;
		}
		
		top[0] = top[0]+1;
		array[top[0]] = item;
	}
	
	static int pop(int top[],int array[])
	{
		int item;
		if(top[0] == -1)
		{
			return -1;
		}
		
		item = array[top[0]];
		top[0] = top[0]-1;
		return item;
	}
	
	static void display(int top[],int array[])
	{
		int i;
		if(top[0] == -1)
		{
			System.out.println("Stack is Empty");
			return;
		}
		
		System.out.println("The elements of stack are:");
		for(i=0;i<=top[0];i++)
		{
			System.out.println(array[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int item,choice,y;
		int[] array = new int[10];
		int[] top = {-1};
		
		for(;;)
		{
			System.out.println("1.PUSH		2.POP		3.DISPLAY		4.EXIT");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
					case 1 :
							System.out.println("Enter the item:");
							item = sc.nextInt();
							push(item,top,array);
							break;
							
					case 2 :
							y = pop(top,array);
							if(y == -1)
							{
								System.out.println("Stack is Empty");
							}
							
							else
							{
								System.out.println("Item deleted: "+y);
							}
							break;
					case 3 :
							display(top,array);
							break;
							
					case 4 :
							System.exit(0);
			}
		}
		
		
		
	}

}
