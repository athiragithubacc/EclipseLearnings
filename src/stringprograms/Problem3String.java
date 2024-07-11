package stringprograms;

import java.util.Scanner;

public class Problem3String {

	public static void main(String[] args) {
		//Check String is Palindrome
		
		String s,rev="";
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a string");
		 s=reader.next();
		
		 for (int i =s.length() - 1; i >= 0; i--) 
		    {
	            rev = rev + s.charAt(i);
	        }

		if(s.equalsIgnoreCase(rev))
		    {
			System.out.println(s+" is Palindrome");
			}
		else
		    {
			System.out.println(s+" is not Palindrome");
			}
	}

}
