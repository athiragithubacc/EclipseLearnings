package usingClass;

import java.util.Scanner;

public class MethodOnly {

	public static void main(String[] args) {
		double num1=10.5,num2=20;					
		char Operator='-';
		Scanner reader=new Scanner(System.in);
		char choice;
		MethodOnly obj=new MethodOnly();
		do {
					
			System.out.println("Select the operator (+ - * /)");
			Operator=reader.next().charAt(0);	
			System.out.println("Enter two numbers");
			num1=reader.nextDouble();
			num2=reader.nextDouble();		
						
							switch(Operator)
							{
									case '+': System.out.println("Addition Result :"+(obj.sum(num1,num2)));
									            break;
									case '-': System.out.println("Subtraction Result :"+(obj.Diff(num1,num2)));
												break;
									case '*': System.out.println("Multiplication Result :"+(obj.Multiply(num1,num2)));
							        			break;
									case '/': System.out.println("Division Result :"+(obj.Div(num1,num2)));
							        			break;									
							        default : System.out.println("Invalid operator");
				        			
							}
							
					System.out.println("Do you want to continue? (Y/N)");
					choice=reader.next().charAt(0);
					
		}while(choice=='Y'||choice=='y');
			System.out.println("Exiting from calculator program");
			reader.close();
	}

	public double sum(double a,double b)
	{
		double S=a+b;
		return S;
	}
	public double Diff(double a,double b)
	{
		double Sub=a-b;
		return Sub;
	}
	public double Multiply(double a,double b)
	{
		double M=a*b;
		return M;
	}
	public double Div(double a,double b)
	{
		double D=a/b;
		return D;
	}

}
