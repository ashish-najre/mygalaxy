package constructor;

public class CS1 {
	// Here we define constructor, here this constructor load the address of variable in object
	public CS1()	// Constructor with zero parameter
	{
		
		System.out.println("This is user defined constructor in this class!!");		
	}

	public static void main(String[] args)
	{
		CS1 cs=new CS1();		// when we create object, then constructor automatically get executed 
		cs.test1();
		

	}

	public void test1()
	{
		System.out.println("this is non-static method running in class CS1!! ");
		
	}
	
}
