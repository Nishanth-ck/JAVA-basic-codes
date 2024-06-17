package Test100;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		if(args.length != 4)
		{
			System.out.println("Usage : java MatrixAddition <order>");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		
		int rows1 = Integer.parseInt(args[0]);
		int columns1 = Integer.parseInt(args[1]);
		
		int rows2 = Integer.parseInt(args[2]);
		int columns2 = Integer.parseInt(args[3]);
		
		if(rows1 != rows2 && columns1 != columns2)
		{
			System.out.println("Matrix Addition not possible:");
			System.exit(0);
		}
		
		int[][] matrixA = new int[rows1][columns1];
		int[][] matrixB = new int[rows2][columns2];
		
		int[][] resultMatrix = new int[rows1][columns1];
		
		System.out.println("Enter the elements of matrixA:");
		
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<columns1;j++)
			{
				matrixA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of matrixB:");
		
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<columns2;j++)
			{
				matrixB[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<columns1;j++)
			{
				resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		
		System.out.println("The resultant matrix after addition is:");
		
		for(int[] row : resultMatrix)
		{
			for(int value : row)
			{
				System.out.print(value+" ");
			}
			
			System.out.println();
		}
		
	}

}
