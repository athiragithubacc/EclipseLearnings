package controlstatements;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args){
		//Calculator using switch
		
		double num1=10.5,num2=20;					
		char Operator='-';
		Scanner reader=new Scanner(System.in);
		char choice;
		do {
					System.out.println("Select the operator (+ - * / %)");
					Operator=reader.next().charAt(0);
					System.out.println("Enter two numbers");
					num1=reader.nextDouble();
					num2=reader.nextDouble();
					
					
						
							switch(Operator)
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
							        default : System.out.println("Invalid operator");
				        			
							}
							
					System.out.println("Do you want to continue? (Y/N)");
					choice=reader.next().charAt(0);
					
		}while(choice=='Y'||choice=='y');
			System.out.println("Exiting from calculator program");
	}

}
