package practiseprograms;

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// Swap 2 Strings
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String firstString = reader.next();
		System.out.println("Enter the second string: ");
		String secondString = reader.next();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Before swapping:");
		System.out.println("First string: " + firstString);
		System.out.println("Second string: " + secondString);

		firstString = firstString + secondString;
		secondString = firstString.substring(0, (firstString.length() - secondString.length()));		
		firstString = firstString.substring(secondString.length());

		System.out.println("After swapping:");
		System.out.println("First string: " + firstString);
		System.out.println("Second string: " + secondString);

	}

}
