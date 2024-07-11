package selfpractisequest;
import java.util.Scanner;

public class LongestWord {

	
	public static void main(String[] args) {
		//Longest word in a sentence
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String inputSentence=reader.nextLine();
		String[] words=inputSentence.split(" ");
		int i;
		String Longest=words[0];
		for(i=0;i<words.length-1;i++) 
		{
			if(words[i].length()>words[i+1].length())
			{
				Longest=words[i];
			}
			else
			{
				Longest=words[i+1];
			}
		}
		System.out.println("Longest Word is :"+Longest);
		}
	}


