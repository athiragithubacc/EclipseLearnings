package oopsconcepts;

class Animal
{
	public void animalMethod()
	{
		System.out.println("I am from Animal Class");
	}
}
class Tiger extends Animal
{
	public void tigerMethod()
	{
		System.out.println("I am from Tiger Class");
	}
}
class Leopard extends Animal
{
	public void leopardMethod()
	{
		System.out.println("I am from Leopard Class");
	}
}

public class HierarchialExample {

	public static void main(String[] args) {
		Tiger T=new Tiger();
		T.animalMethod();
		T.tigerMethod();
		
		Leopard L=new Leopard();
		L.animalMethod();
		L.leopardMethod();

	}

}
