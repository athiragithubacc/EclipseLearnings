package selfpractisequest;

import java.util.Scanner;

public class PractisingQuestions {

	public static void main(String[] args) {
		String word="Malayalam";
		String Pal="";
		
		for(int i=word.length()-1;i>=0;i--)
		{
			Pal=Pal+word.charAt(i);
		}
		System.out.println(Pal);
	}

}
