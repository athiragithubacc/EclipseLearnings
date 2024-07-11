package oopsconcepts;
interface iTvRemote
{
	void display();
}
interface iSmartTvRemote extends iTvRemote
{
	void Features();
}
class TV implements iSmartTvRemote
{

	@Override
	public void display() {
		System.out.println("Display of SmartTvRemote");
		
	}

	@Override
	public void Features() {
		System.out.println("Features of SmartTvRemote");
		
	}
	
}
public class InterfaceExample3 {

	public static void main(String[] args) {
		TV obj=new TV();
		obj.display();
		obj.Features();
	}

}
