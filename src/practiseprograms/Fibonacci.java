/**
 * 
 */
package practiseprograms;
import java.util.Scanner;

public class Fibonacci {

	
	public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	int num,fib,first,next;
	fib=0;
	first=0;
	next=1;
	System.out.println("Enter the limit: ");
	num=reader.nextInt();
	System.out.print(first);
	System.out.print(next);
	for(int i=1;i<=num;i++)
	{
	 fib=first+next;
	 System.out.print(fib);
	 first=next;
	 next=fib;
	}
	//System.out.println(fib);
	reader.close();
	}

}
