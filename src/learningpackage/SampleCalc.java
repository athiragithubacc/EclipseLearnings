package learningpackage;

import java.util.Scanner;

public class SampleCalc {

	public static void main(String[] args) {
		//Calculator
		
		double num1,num2;
		int count;
		Scanner reader=new Scanner(System.in);
		do
		{
				System.out.println("Select the operator (+ - * / %)");
				char C=reader.next().charAt(0);
				System.out.println("Enter two numbers : ");
			    num1=reader.nextDouble();
			    num2=reader.nextDouble();
				//System.out.println(C);
				
				switch(C)
				{
						case '+': System.out.println("Addition Result :"+(num1+num2));
						          break;
						case '-': System.out.println("Subtraction Result :"+(num1-num2));
									break;
						case '*': System.out.println("Multiplication Result :"+(num1*num2));
				        			break;
						case '/': System.out.println("Division Result :"+(num1/num2));
				        			break;
						case '%': System.out.println("Modulus Result :"+(num1%num2));
				        			break;
				}
				System.out.println("Do you want to exit? Select (0 or 1)");
				count=reader.nextInt();
				}while(count!=0);
		System.out.println("End of program");
reader.close();
	}

}
