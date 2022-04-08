package variable_study;

public class Employee {
	
	// We take Following Parameter for Employee Information
	// Employee Name, Employee ID , Grade , Post , Salary...
	
	String name;
	String emp_id;
	char grade;
	String emp_post;
	float salary;
	
	
	public void status() 
	{
	
	  System.out.println("=================================");	
	  System.out.println("The name of Employee is "+name);	
	  System.out.println("The Salary of "+name+" is "+salary);
	  System.out.println("The Employee ID is "+emp_id);
	  System.out.println("Grade of Employee is "+grade);
	  System.out.println("The Post of "+name+" is "+emp_post);
	  
	  
	}
	
	// We take the following parameter for health_info
	// Height, Weight, BMI, 
	
	
	float height;
	int weight;
	
	public void health_info() 
	{ 
		
		float BMI=(weight/(height*height))*100;
		
		System.out.println("========Fitness details of "+name+"=========");
		System.out.println("Height is "+height);
		System.out.println("Weight is "+weight+" KG");
		System.out.println("BMI is "+BMI+ " Which is in range ");
		System.out.println("=============================================");
		
	}

	
}
