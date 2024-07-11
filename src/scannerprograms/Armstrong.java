package scannerprograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int num,cube=0,temp,Arm=0;
	
		Scanner reader=new Scanner(System.in);
	    System.out.println("Enter a number: ");		
		num=reader.nextInt();
		
		int copy=num;
		
			while(num>0)
			{
				temp=num%10;  
				cube=temp*temp*temp;
				Arm=cube+Arm;
				num=num/10; 
			}
		System.out.println(Arm);
		
				if(copy==Arm)
				{
					System.out.println(copy+"is Armstrong");
				}
				else
				{
					System.out.println(copy+"is not Armstrong");
				}
			
	}

}
