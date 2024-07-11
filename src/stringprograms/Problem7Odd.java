package stringprograms;

public class Problem7Odd {

	public static void main(String[] args) {
		// Odd numbers from 1 to 100
		
		for(int i=1;i<100;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			else
				continue;
		}
		
	}

}
