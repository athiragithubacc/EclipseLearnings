package stringprograms;

public class StringFunctions {

	public static void main(String[] args) {
		//  built-in methods that you can use on strings.
		
		String s1="hi";
		String s2="Hi";
		String s3="hi I am a student";
		String s4="Blue Sky";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//Compares two strings. Returns true if the strings are equal, and false if not
		System.out.println(s1.equalsIgnoreCase(s2));//Compares two strings, ignoring case considerations
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		//Concat
		System.out.println(s1.concat(s3));
		
		//length
		System.out.println(s3.length());
		
		//Toupper,Tolower
		System.out.println(s3.toLowerCase());
		
		//startswith
		//Endswith
		System.out.println(s3.startsWith(s1));
		
		//replace() 	Searches a string for a specified value, and returns a new string where the specified values are replaced 	String
		//replaceAll() 	Replaces each substring of this string that matches the given regular expression with the given replacement
		System.out.println("Replace:");
		System.out.println(s3.replace(s3, s4));
		
		//split  	Splits a string into an array of substrings
		String[] arr=s3.split(" ");
		
	  for(String j:arr)
	  {
		  System.out.println(j);
	  }
	 
	  //charAt
	  //chararray
	  System.out.println(s3.charAt(1));
	  
	  char[] ch=s3.toCharArray();
	  
	  for(char c:ch)
	  {
		  System.out.print(c);
	  }
	}
}
