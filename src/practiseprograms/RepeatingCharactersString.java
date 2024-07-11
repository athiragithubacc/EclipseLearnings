package practiseprograms;

import java.util.Scanner;

//******REPEATING CHARACTERS IN STRING

public class RepeatingCharactersString {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a string");		
		String inputWord=reader.next();
		System.out.println("Repeating Characters :");
		for(int i=0;i<inputWord.length()-1;i++)
		{
			char current=inputWord.charAt(i);
			
			if(current==inputWord.charAt(i+1))
			{
				System.out.println(current);
			}
		}

	}

}
