package practiseprograms;

import java.util.Scanner;

public class StringEndswith {

	public static void main(String[] args) {
		
		String word;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the word");
		word=reader.nextLine();
		word=word.toLowerCase();
		if(word.endsWith("language"))
		{
			System.out.println("Word ends with language");
		}
		else
		{
			System.out.println("Word doesn't ends with language");
		}
	}

}
