package usingClass;
import accessmodifierpckg.*;


public class TestAccessModi extends AcessModClass1 {

	public static void main(String[] args) {
		
		AcessModClass1 obj=new AcessModClass1();
		TestAccessModi obj2=new TestAccessModi();
		System.out.println(obj2.protectVariable);
		
	}

}
