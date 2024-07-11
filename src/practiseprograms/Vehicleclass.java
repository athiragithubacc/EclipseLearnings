package practiseprograms;
class Vehicle
	{
	public void drive()
		{
			System.out.println("This is Vehicle Class");
		}
	}
class Car extends Vehicle
{
	
	@Override
	public void drive() {
		System.out.println("Repairing the car");
	}
}
public class Vehicleclass {

	public static void main(String[] args) {
		
		Car obj=new Car();
		obj.drive();

	}

}
