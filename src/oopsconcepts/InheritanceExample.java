package oopsconcepts;
//MultiLevel Inheritance
class GrandParentClass
{
	public void grandParentMethod()
	{
		System.out.println("I am from GrandParent Class");
	}
}
class FatherClass extends GrandParentClass
{
	public void FatherMethod()
	{
		System.out.println("I am from Father Class");
	}
}
class Child extends FatherClass
{
	public void childMethod()
	{
		System.out.println("I am from Child Class");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		
		Child childobj=new Child();
		childobj.grandParentMethod();
		childobj.FatherMethod();
		childobj.childMethod();
	}

}
