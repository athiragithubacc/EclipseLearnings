package practiseprograms;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		int num,temp=1,rev=0;
		System.out.println("Enter the number :");
		num=reader.nextInt();
		int copy=num;
		while(num!=0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
			//System.out.println(temp);
		}
		if(copy==rev)
		{
			System.out.println(copy+" is Palindrome");
		}
		else
		{
			System.out.println(copy+" is not Palindrome");
		}
	reader.close();
	}

}
