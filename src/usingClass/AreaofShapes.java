package usingClass;

import java.util.Scanner;

public class AreaofShapes {

	public static void main(String[] args) {
		// Cirlce,Triangle,Rectangle,Square
		
		Scanner reader=new Scanner(System.in);
		AreaofShapes obj=new AreaofShapes();
		System.out.println("Select the Shapes to find Area (1.Circle, 2.Triangle,3.Rectangle,4.Square)");
		int Operator=reader.nextInt();
		switch(Operator)
		{
				case 1: System.out.println("Addition Result :"+(obj.CircleArea()));
				            break;
				case 2: System.out.println("Subtraction Result :"+(obj.CircleArea()));
							break;
				case 3: System.out.println("Multiplication Result :"+(obj.CircleArea()));
		        			break;
				case 4: System.out.println("Division Result :"+(obj.CircleArea()));
		        			break;									
		        default : System.out.println("Invalid operator");
    			
		}
	}
	
	public double CircleArea()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the radius");
		double r=reader.nextDouble();		
		double Area=3.14*r*r;
		return Area;
	}
	public double TriangleArea()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the breadth and height");
		double h=reader.nextDouble();
		double b=reader.nextDouble();
		double Area=0.5*b*h;
		return Area;
	}
	public double RecArea()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		double l=reader.nextDouble();
		double b=reader.nextDouble();
		double Area=0.5*l*b;
		return Area;
	}
	public double SquareArea()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the length");
		double a=10;
		double Area=a*a;
		return Area;
	}
	
}
