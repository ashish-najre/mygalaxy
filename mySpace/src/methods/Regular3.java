package methods;

public class Regular3 {
	
	// method definition of non-static regular method 
		
	public void sample() {
		System.out.println("This is non-static regular method running in main method ");
	}

	public static void main(String[] args)
	{
		// to call non-static method in main method. need to create object in the class
		
		// Here we have taken r3 as object-name
		Regular3 r3= new Regular3();	// this is syntax to create object--->classname objectname= new classname();	
		
		r3.sample();					// Syntax to call non-static method--->objectname.methodname();
		Regular.sample1();			
		Regular.sample2();				// calling static regular method from another class 
		Regular1.sample3();
		Regular.sample2();
		r3.sample();
	}

}
