package arrayconcepts;

import java.util.Scanner;

public class ArraySingleDimension {

	public static void main(String[] args) {
		// Array 
		
		int[] arr=new int[5];
		int i;
		
		System.out.println("Enter 5 numbers");
		Scanner reader=new Scanner(System.in);
		for(i=0;i<=4;i++)
		{
			arr[i]=reader.nextInt();
		}
		
		for(i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
