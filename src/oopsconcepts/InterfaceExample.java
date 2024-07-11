package oopsconcepts;
interface shapesProperties
{
	void Sides();
	void Dimensions();
	void Area();
}
interface Display
{
	void Colour();
	
}
class Triangle implements  shapesProperties
	{

	@Override
	public void Sides() {
		System.out.println("3 sides");
		
	}

	@Override
	public void Dimensions() {
		System.out.println("L B H");
		
	}

	@Override
	public void Area() {
		System.out.println("1/2 * B * H");	
		
	}
	}
class Cirlce implements  shapesProperties,Display
{

@Override
public void Sides() {
	System.out.println("No sides");
	
}

@Override
public void Dimensions() {
	System.out.println("Radius");
	
}

@Override
public void Area() {
	System.out.println("3.14* R* R");	
	
}

@Override
public void Colour() {
	System.out.println("Colour of figures");
	
}
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		Triangle Tobj=new Triangle();
		Cirlce Cobj=new Cirlce();
		Tobj.Area();
		Tobj.Dimensions();
		Tobj.Sides();
		Cobj.Area();
		Cobj.Dimensions();
		Cobj.Sides();
		Cobj.Colour();
	}

}
