package scannerprograms;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=reader.nextInt();
		int sum=0;
		for(int i=1;i<=limit;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of "+limit+" numbers is "+sum);
	}

}
