package usingClass;

import java.util.Scanner;

public class Exam05July2024 {

	public static void main(String[] args) {
		// Exam : Write a program to reverse a number in java
		Scanner reader=new Scanner(System.in);
		int num;
		System.out.println("Enter a number :");
		num=reader.nextInt();
		int rev=0;
		
		while(num>0)
		{
			rev=(rev*10)+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
