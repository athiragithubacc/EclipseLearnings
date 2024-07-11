package practiseprograms;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num =reader.nextInt();
		int i = 2;
	    boolean flag = false;
	    while (i <= num / 2) {
	     
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }

	}


