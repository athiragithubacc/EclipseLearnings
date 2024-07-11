package oopsconcepts;

class Animals
{
	public void Print() {
		System.out.println("This is Animal Class");

	}
}
class Bird extends Animals
	{
	
	@Override
	public void Print() {
		System.out.println("This is Bird Class");
		//super.Print();
	}
	}

public class MethodOverridingExample {

	public static void main(String[] args) {
		Bird B=new Bird();
		B.Print();
		
		Animals A=new Animals();
		A.Print();
		
		
	}

}
