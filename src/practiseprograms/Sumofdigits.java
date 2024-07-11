package practiseprograms;
import java.util.Scanner;
public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner reader=new Scanner(System.in);
 int num,digit=0,sum=0;

 System.out.println("Enter the number: ");
	num=reader.nextInt();
	while(num>0)
	{
		digit=num%10;		
		sum=sum+digit;
		num=num/10;
		
		
	}
	System.out.println("Sum of digits "+sum);
	reader.close();
	}

}
