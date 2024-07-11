package practiseprograms;

import java.util.Scanner;

public class DowhileProblems {
	

	public static void main(String[] args) {
		//Problem No.8
		Scanner reader=new Scanner(System.in);
		char choice='N';
		do
		{
			System.out.println("Enter two numbers");
			int num1=reader.nextInt();
			int num2=reader.nextInt();
			System.out.println("Sum is "+(num1+num2));
			System.out.println("Do you want to continue? (y/n)");
			choice=reader.next().charAt(0);
		}while((choice=='y'||choice=='Y'));
		
		System.out.println("Exiting from program");
	}

}
