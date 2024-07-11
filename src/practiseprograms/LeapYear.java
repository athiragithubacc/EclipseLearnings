package practiseprograms;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the year");
		year=read.nextInt();
		
		if(year%4==0)
		{
			if(year%100!=0||year%400==0)
			{
				System.out.println(year+" is Leap Year");
			}
		}
		else
		{
			System.out.println(year+" is not a Leap Year");
		}
		read.close();

	}

}
