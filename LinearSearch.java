package Test100;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == key)
			{
				return (i+1);
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to search:");
		int key = sc.nextInt();
		
		int result = linearSearch(array,key);
		
		if(result != -1)
		{
			System.out.println("Element found at index : "+ result);
		}
		else
		{
			System.out.println("Element not found in the array:");
		}
		
		

	}

}
