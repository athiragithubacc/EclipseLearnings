package learningpackage;

import java.util.Scanner;

public class ReadExample {

	public static void main(String[] args) {
		try (
		Scanner reader = new Scanner(System.in)) 
		{
			int num1,num2,sum=0;
			System.out.println("Enter a number: ");
			num1=reader.nextInt();
			System.out.println("Enter a number: ");
			num2=reader.nextInt();
			sum=num1+num2;
			System.out.println("sum is : "+sum);
			reader.close();
			
			/*
			int num = scanner.nextInt();
			double num = scanner.nextDouble();
			float num = scanner.nextFloat();
			boolean flag = scanner.nextBoolean();
			
			String input = scanner.nextLine();
			
			char ch = scanner.next().charAt(0);
			*/
			
		}
		
	}

}
