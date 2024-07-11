package oopsconcepts;

		class Member //Parent Class
		    {
				String Name;
				int Age;
				int phoneno;
				String addr;
				int Salary;
				
					public void printDetails()
							{
							 System.out.println("Details are :\nName: "+Name+"\nAge: "+Age+"\nPhoneno: "+phoneno+"\nSalary :"+Salary);
							}
						
			 }
				class Employee extends Member
				    {
						String Specilization;	  			  
					}
				class Manager extends Member
					{
						String Dept;			
					}
			public class HeirarchicalProblems
			    {
			
						public static void main(String[] args) 
						  {	
							    Employee Empobj=new Employee();
							    Manager Mngobj=new Manager();
							    
							    Empobj.Name="Ananya";
							    Empobj.Age=21;
							    Empobj.phoneno=12344545;
							    Empobj.Salary=30000;
							    Empobj.Specilization="HR";
							    Mngobj.Dept="Sales";
							    Empobj.printDetails();
							    System.out.println(Empobj.Specilization+"\n"+Mngobj.Dept);
					    
						}
			
			   }
