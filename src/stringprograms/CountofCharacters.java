package stringprograms;

import java.util.Scanner;

public class CountofCharacters {

	public static void main(String[] args) {
		// Count of characters in string
		
		String sentence;
		int count=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the sentence");
		sentence=reader.nextLine();
	
		for(int i=0;i<sentence.length();i++)
				{
					
			           if(sentence.charAt(i)!=' ') 
					     {
						   count++;
					     }
				}
				
		System.out.println("Count of characters: "+count);
	}

}
