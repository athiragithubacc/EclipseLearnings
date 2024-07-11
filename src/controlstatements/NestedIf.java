package controlstatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=16,weight=50;
			if(age>18)
			{
				if(weight>55)
				{
					System.out.println("Eligible for donating blood");
				}
				else
				{
					System.out.println("Under weight not eligible");
				}
			}
			else
				System.out.println("under age not eligible");
			
	}

}
