package stringprograms;

public class SubstringExample {

	public static void main(String[] args) {
		String originalWord="Java2.0";
		String wordToInsert="Tutorial";		
		String newWord = originalWord.substring(0, 4) + wordToInsert + originalWord.substring(4);
		System.out.println(newWord);

		
	}

}
