package practiseprograms;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		//Average
		Scanner reader=new Scanner(System.in);
		int[] arr=new int[3];
		System.out.println("enter 3 numbers");
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			arr[i]=reader.nextInt();
			sum=sum+arr[i];
		}

		
		System.out.println("Average is "+(sum/3));
	}

}
