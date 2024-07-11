package accessmodifierpckg;
 class AccessModifierExample
{
	private int privateVariable=10;
	public int publicVariable=12;
	int defaultVariable=100;
	protected int protectVariable=15;
}
public class AcessModClass1 {
	protected int protectVariable=15;
	public static void main(String[] args) {
		
		
		AccessModifierExample obj=new AccessModifierExample();
		System.out.println(obj.defaultVariable);
		//System.out.println(obj.privateVariable);
		System.out.println(obj.protectVariable);
		System.out.println(obj.publicVariable);
	}

}
