package usingClass;


//CONSTRUCTOR
public class ConstructorExample {
		 
	int Id;
	String EName;
	int Age;
	public ConstructorExample(int Id,String EName,int Age)
	{
		this.Id=Id;
		this.EName=EName;
		this.Age=Age;
	}
	public static void main(String[] args) {
		
		ConstructorExample obj=new ConstructorExample(22,"Athira",30);
		System.out.println("Details:"+" "+obj.Id+" "+obj.EName+" "+obj.Id);
	
	}

}
