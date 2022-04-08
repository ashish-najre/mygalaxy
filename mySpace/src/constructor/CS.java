package constructor;

public class CS {

	//Constructor is special method which load the data member and variable to object
	//there are two type of constructor 1.default constructor	2.User defined constructor
	
	public static void main(String[] args) 
	{
		// Example of default constructor,Here programmer not defined any constructor in code, when object is created at the of 
		// compilation, compiler create default constructor to load address of member function/Variable
		
			CS c=new CS();	// to call non-static method, need to create object---->syntax---->classname objectname=new classname();
			c.test1();		//to call method---->syntax ----->objectname.methodname();
			
		

	}
	
	public void test1() 
	{
		System.out.println("This is Non-static Test1 method of package constructor");
		
	}
	
	
}
