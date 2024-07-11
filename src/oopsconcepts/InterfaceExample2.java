package oopsconcepts;

interface IBasicAnimal
{
	void Eat();
	void Sleep();
}
class Monkey  
{
	public void Jump()
	{
		System.out.println("Jump Method from Monkey");
	}
	public void Bite()
	{
		System.out.println("Bite Method from Monkey");
	}
}
class Human extends Monkey implements IBasicAnimal
{
	public void Speak()
	{
		System.out.println("Speak Method from Human Class");
	}

	@Override
	public void Eat() {
		System.out.println("Eat method implemented to Human");
		
	}

	@Override
	public void Sleep() {
		System.out.println("Sleep method implemented to Human");
		
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		Human Hobj=new Human();
		Hobj.Speak();
		Hobj.Eat();
		Hobj.Sleep();
		
		Hobj.Jump();
		Hobj.Bite();

	}

}
