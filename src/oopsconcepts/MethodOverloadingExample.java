package oopsconcepts;
// Method Overloading Example
class Numbers
{
	int num1,num2;
	double num3;
	
	public int Sum()
	{
		num1=10;num2=10;
		return(num1+num2);
	}
	public int Sum(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		return(num1+num2);
	}
	public double Sum(double num1,int num2)
	{
		this.num3=num1;
		this.num2=num2;
		return(num3+num2);
	}
	public double Sum(int num1,double num2)
	{
		this.num1=num1;
		this.num3=num2;
		return(num3+num2);
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
	
		Numbers Nobj=new Numbers();
		System.out.println(Nobj.Sum());
		System.out.println(Nobj.Sum(10,20));
		System.out.println(Nobj.Sum(15.5, 10));
		System.out.println(Nobj.Sum(20.5, 10));
	}

}
