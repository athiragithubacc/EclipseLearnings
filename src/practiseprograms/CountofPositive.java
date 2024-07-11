package practiseprograms;

import java.util.Scanner;

public class CountofPositive {

	public static void main(String[] args) {
		// Count Positive,Negative and Zeros in array
		
		Scanner reader=new Scanner(System.in);
		int limit=0,negativeCount=0,positiveCount=0,zeroCount=0;
		System.out.println("Enter the limit of Array");
		limit=reader.nextInt();
		int[] arr=new int [limit];
		System.out.println("Enter the elements of this Array");
		for(int i=0;i<limit;i++)
		{
			arr[i]=reader.nextInt();
			if(arr[i]==0)
			{
			 zeroCount++;
			}
			else if(arr[i]<0)
			{
				negativeCount++;
			}
			else 
			{
				positiveCount++;
			}
				
		}
		
		System.out.println("Count of Positive numbers :"+positiveCount+"\nCount of Negative numbers :"+negativeCount+"\nCount of zeros :"+zeroCount);

	}

}
