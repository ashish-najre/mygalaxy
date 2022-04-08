package variable_study;

public class Hr_portal {

	public static void main(String[] args) 
	{
		Employee AN=new Employee();
		
		AN.name="Ashish Najre";						//Variable initialization
		AN.emp_id="XOR0802";						//Variable initialization
		AN.grade='A';								//Variable initialization
		AN.emp_post="Software Test Engineer";		//Variable initialization
		AN.salary=55656.251f;						//Variable initialization
		AN.height=17.8f;
		AN.weight=70;
		AN.status();								// calling Non-static method from employee class
		AN.health_info();
		Employee VP=new Employee();
		
		VP.name="Vaibhav Pardeshi";
		VP.emp_id="XOR1111";
		VP.grade='A';
		VP.emp_post="Software Test Engineer";		//Variable initialization
		VP.salary=55656.251f;						//Variable initialization
		VP.height=18.2f;
		VP.weight=70;
		VP.status();
		VP.health_info();
		
	
		
	}

}
