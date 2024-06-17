package Test100;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key)
	{
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			
			if(arr[mid] == key)
			{
				return mid;
			}
			else if(arr[mid]<key)
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter the elements of the array :");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		System.out.println("Enter the element to search:");
		int key = sc.nextInt();
		
		int result = binarySearch(array,key);
		
		if(result != -1)
		{
			System.out.println("Element found at index : "+result);
		}
		else
		{
			System.out.println("Element not found in the array:");
		}

	}

}
