package Test100;

import java.util.Scanner;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows for the first matrix:");
		int rows1 = sc.nextInt();
		System.out.println("Enter the number of columns for the first matrix:");
		int cols1 = sc.nextInt();
		
		System.out.println("Enter the number of rows for the second matrix:");
		int rows2 = sc.nextInt();
		System.out.println("Enter the number of columns for the second matrix:");
		int cols2 = sc.nextInt();
		
		if(cols1 != rows2)
		{
			System.out.println("Matrix Multiplication not possible:");
			return;
		}
		
		System.out.println("Enter the elements of the first matrix:");
		//int[][] matrix1 = inputMatrix(sc,rows1,cols1);
		int[][] matrix1 = new int[rows1][cols1];
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of the second matrix:");
		//int[][] matrix2 = inputMatrix(sc,rows2,cols2);
		int[][] matrix2 = new int[rows2][cols2];
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<cols2;j++)
			{
				matrix2[i][j] = sc.nextInt();
			}
		}

		
		//int[][] resultMatrix = multiplyMatrices(matrix1,matrix2);
		
		int[][] resultMatrix = new int[rows1][cols2];
		
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols2;j++)
			{
				for(int k=0;k<cols1;k++)
				{
					resultMatrix[i][j] += matrix1[i][k] + matrix2[k][j];
				}
			}
		}
		
		
		System.out.println("Resultant matrix after multiplication:");
		//displayMatrix(resultMatrix);
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols2;j++)
			{
				System.out.print(resultMatrix[i][j]+" ");
			}
			
			System.out.println();
		}

	}
}
	