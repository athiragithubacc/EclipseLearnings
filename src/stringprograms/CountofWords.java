package stringprograms;

import java.util.Scanner;

public class CountofWords {

	public static void main(String[] args) {
		// Count the words
		String sentence;	
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the sentence");
		sentence=reader.nextLine();
		String[] arr=sentence.split(" ");
		System.out.println(arr.length);
	}

}
