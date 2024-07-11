package stringprograms;

import java.util.Scanner;

public class Problem4Largest {

	public static void main(String[] args) {
		// Largest Element in Array
		int max=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit =reader.nextInt();
		int[] arr=new int[limit];
		
		System.out.println("Enter the numbers");
		for(int i=0;i<limit;i++)
		{
			arr[i]=reader.nextInt();
		}
		
		//LArgest
		
		for(int i=0;i<limit;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		}
		
		System.out.println("Largest number is "+max);

	}

}
