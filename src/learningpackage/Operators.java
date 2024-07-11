package learningpackage;

public class Operators {

	
	public static void main(String[] args) {
		// Operators
		int num1=20,num2=10;
		//Arithmetic
		System.out.println("Addition "+(num1+num2));
		System.out.println("Subtraction "+(num1-num2));
		System.out.println("Multiplication "+(num1*num2));
		System.out.println("Division "+(num1/num2));
		System.out.println("Modulus "+(num1%num2));
		
	
		//Assignment 
		
		System.out.println("num1+=num2");
		System.out.println(num1+=num2);
		System.out.println("num1-=num2");
		System.out.println(num1-=num2);
		
	//Relational
		int R1=10,R2=20;
		System.out.println(R1==R2);
		System.out.println(R1>R2);
		System.out.println(R1<R2);
		
	//Logical
		System.out.println((R1<R2)&&(num1==num2));
		System.out.println((R1<R2)&&(num1!=num2));
	//Unary 
		int A=10,B=15;
		System.out.println(A++);
		System.out.println(++A);
		System.out.println(B--);
		System.out.println(--B);
		
	//Ternary
		String answer=R1>R2?"R1 is greater":"R2 is greater";
		System.out.println(answer);
	}

}
