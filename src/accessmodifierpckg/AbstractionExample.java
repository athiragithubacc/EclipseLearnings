package accessmodifierpckg;
abstract class Car
	{
	  abstract public void abstractMethod1();
	  abstract public void abstractMethod2();
	   public void normalMethod() 
	   {
	     System.out.println("This is a method with body");
	   }
	}
class BMW extends Car
	{

	@Override
	public void abstractMethod1() {
		
		System.out.println("abstractMethod1: I am from BMW");
	}

	@Override
	public void abstractMethod2() {
		
		System.out.println("abstractMethod2: I am from BMW");
	}
	
	
	@Override
	public void normalMethod() {
		// TODO Auto-generated method stub
		super.normalMethod();
	}
	}
class Vokswagen extends Car
{

@Override
public void abstractMethod1() {
	
	System.out.println("abstractMethod1: I am from Vokswagen");
}

@Override
public void abstractMethod2() {
	
	System.out.println("abstractMethod2: I am from Vokswagen");
}

}
public class AbstractionExample {

	public static void main(String[] args) {
		
   BMW obj1=new BMW();
   obj1.abstractMethod1();
   obj1.abstractMethod2();
   obj1.normalMethod();
   
   Vokswagen obj2=new Vokswagen();
   obj2.abstractMethod1();
   obj2.abstractMethod2();
	}

}
