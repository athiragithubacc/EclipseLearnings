package arrayconcepts;

import java.util.Scanner;

public class Multiarray {

	public static void main(String[] args) {
		// Multi Dimentional Array
		
		int[][] arr=new int[3][4];
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the 12 numbers in 3 rows x 4 columns array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=reader.nextInt();
			}
		}
		System.out.println("Array is :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
