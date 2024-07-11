package practiseprograms;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String mainString=reader.nextLine();
		System.out.println("Enter the word to search");
		String searchWord=reader.nextLine();
		mainString=mainString.toLowerCase();
		if(mainString.contains(searchWord.toLowerCase()))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
	}

}
