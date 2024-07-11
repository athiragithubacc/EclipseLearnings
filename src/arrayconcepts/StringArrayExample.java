package arrayconcepts;

import java.util.Scanner;

public class StringArrayExample {

	public static void main(String[] args) {
		// String Array
		
		String[] Students=new String[4];
		int i;
		System.out.println("Enter the names of 4 students");
		Scanner reader=new Scanner(System.in);
		for(i=0;i<4;i++)
		{
			Students[i]=reader.next();
		}
		
		//***read using for each
		
		/*for(String j : Students)
		{
			j=reader.next();
			//System.out.println(j);
		}*/
		
		for(String j : Students)
		{			
			System.out.println(j);
		}
	
		reader.close();
	
	}
	

}
