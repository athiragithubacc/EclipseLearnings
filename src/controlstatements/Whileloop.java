package controlstatements;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i=0;
  int num=1234567890;
  int temp=num;
  while(temp!=0) 
  {
	 temp=temp/10;
	// System.out.println(temp);
	  i++;
	 
  }
  System.out.println("No. of digits in "+num+" is "+i);
 
	}

}
