package controlstatements;

import java.util.Scanner;

public class ScannerRead {

	public static void main(String[] args) {
		//Read from Console
		
		System.out.println("Enter a number :");
		Scanner reader=new Scanner(System.in);
		int num=reader.nextInt();
		System.out.println("Number is "+num);
		
	}

}
