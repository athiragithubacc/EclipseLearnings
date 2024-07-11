package arrayconcepts;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		// Sum of numbers in an Array
		
		int i,sum=0;
		int[] arr=new int[5];
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		for(i=0;i<5;i++)
		{
			arr[i]=reader.nextInt();
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of numbers is "+sum);

	}

}
