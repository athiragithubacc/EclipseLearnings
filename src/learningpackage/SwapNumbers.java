package learningpackage;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=30,num2=40,temp=0;
		System.out.println("Before Swapping first number= "+num1);
		System.out.println("Before Swapping second number= "+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping first number= "+num1);
		System.out.println("After Swapping second number= "+num2);
		
		//without temp variable
		num1=30;
		num2=40;
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swapping first number= "+num1);
		System.out.println("After Swapping second number= "+num2);
		

	}

}
