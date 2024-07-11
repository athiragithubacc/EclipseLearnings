package stringprograms;

import java.util.Scanner;

public class Problem6EvenOdd {

	public static void main(String[] args) {
		// Count the number of Odd and Even numbers 
		int EvenCount=0,OddCount=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit =reader.nextInt();
		int[] arr=new int[limit];
		
		System.out.println("Enter the numbers");
		for(int i=0;i<limit;i++)
		{
			arr[i]=reader.nextInt();
		}
		
		
		for(int i=0;i<limit;i++)
		{
			if(arr[i]%2==0)
			{
				EvenCount++;
			}	
			else
			{
				OddCount++;
			}
	
		}
		
		System.out.println("No. of Even numbers : "+EvenCount+"\nNo. of Odd numbers: "+OddCount);
		
		
	
	}

}
