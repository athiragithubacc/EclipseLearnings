package scannerprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num,rev,temp;
		
		Scanner reader=new Scanner(System.in);
	    System.out.println("Enter a number: ");
		num=reader.nextInt();		
		
		rev=0;
		
		while(num>0)
		{
			temp=num%10;  //256%10=6   
			rev=rev*10+temp; //0+6
			//System.out.println(rev);
			num=num/10; //25
		}
		System.out.println(rev);
	}

}
