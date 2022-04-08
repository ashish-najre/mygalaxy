package practice;

public class From_first {

	public static void main(String[] args)
	
	// Practice programming from first class upto date 25 december 2021
	
	//Chapter 1. Variable------> What is variable, declaration and initialization of variable.
	
	{	// Primitive datatype 
		byte sam;											// Variable declaration
		short num;											// Variable declaration
		int number;											// Variable declaration
		long sample;										// Variable declaration
		float val;
		double value;
		char alpha;
		boolean VC;
		
		//Non-primitive datatype
		
		String name="Ashish";
		
		
		sam=111;											// Variable initialization
		num=3000;											// Variable initialization
		number=8796277;										// Variable initialization
		sample=879627796;									// Variable initialization
		val=106.44f;										// Variable initialization
		value=10221.456321456;								// Variable initialization
		alpha= 'A';											// Variable initialization
		VC=true;											// Variable initialization
		
		System.out.println("======================");		// Usage
		System.out.println("The Value is "+sam);			// Usage
		System.out.println("The Value is "+num);			// Usage
		System.out.println("The Value is "+number);			// Usage
		System.out.println("The Value is "+sample);			// Usage
		System.out.println("The Value is "+val);			// Usage 
		System.out.println("The Value is "+value);			// Usage
		System.out.println("The Value is "+alpha);			// Usage
		System.out.println("The Value is "+VC);				// Usage
		System.out.println("My Name is "+name);				// Usage
		System.out.println("======================");		// Usage
		
		// 2.chapter methods 
		multiplication();	// calling static method in same class.. syntax ----->methodname();
		
		
	}
	
	// Chapter 2 Methods 
	
	public static void multiplication() 
	{
		int a ,b ,mul;
		a=7; 
		b=8;
		mul=a*b;
		System.out.println("The multipliaction is "+mul);
		
	}

}
