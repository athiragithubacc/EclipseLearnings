package controlstatements;

public class GreatestofThree {

	public static void main(String[] args) {
		// Greatest of three numbers
		
		int num1=5,num2=35,num3=15,large=0;
		
		if((num1>num2)&&(num1>num3))
		{
			large=num1;
		}
		else if ((num2>num3)&&(num2>num1))
		{
			large=num2;
		}
		else
		{
			large=num3;
		}
		System.out.println("Largest number is "+large);
	}

}
