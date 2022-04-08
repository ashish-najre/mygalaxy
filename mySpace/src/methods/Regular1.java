package methods;

public class Regular1 {

	public static void sample3() 		/*method defination or complete method  */
	{
		System.out.println("This is our sample3 in method..");  // body which will be execute
	}
	public static void main(String[] args)			// main method----> class has compulsory  only one main method and compiler start execution from main method
	{
		
		System.out.println("Hello, I am Ashish Najre preparing for software testing course");
		sample3();				// syntax---->method-name();------> calling static method from same class
		Regular.sample2();		// syntax----> classname.methodname();--->calling static method from another class
		Regular.sample1();
		sample3();
		sample3();
		
		Regular3 r1=new Regular3();		// call non-static method from another class
		r1.sample();
		addition();
		Regular1 g3=new Regular1();
		g3.subtraction();
		Addition(100,500,300);		//parameterized static method 
		Addition(600,500,300);
		g3.Subtraction(1000,500);	// parameterized Non-static method 
		g3.Subtraction(400,500);
		g3.Subtraction(3000, 2000);
		g3.bike_info("Vishal", "Honda Activa ", "125CC", 97000,120);
		g3.bike_info("Ashish Najre","CB Shine","125CC",97000,140);
		g3.bike_info("Nilesh Jadhav","FZ Version 2.0","180CC",123000,160);
		multiplication(30,5);		// Multiplication operation by parameterized static method
		g3.division(50,2);			// Division operation by parameterized  non static method
		g3.division(300,2);
		
	}
	
	public static void addition() 				// Here we define method. this method definition-------> static method 
	{
	  int a=100,b=200;							// this is static method without parameter
	  int sum=a+b;								// parameter is the variable which we declared in round bracket of method 
	  System.out.println("==================");
	  System.out.println("Addition is "+sum);
	  System.out.println("==================");
	}
	
	public void subtraction() 					// Non-static method------here i write subtraction method  
	{
		int a=50;								// this is static method without parameter
		int b=25;								// parameter is the variable which we declared in round bracket of method
		int sub=a-b;
		System.out.println("=======================");
		System.out.println("Subtraction is " +sub);
		System.out.println("=======================");
			
	}
	
	// This is static method with parameter which we declared in round bracket
	
	public static void Addition(int a, int b , int c) 
	{
		int sum=a+b+c;
		System.out.println("==============================");
		System.out.println("Addition is "+sum);
		System.out.println("==============================");
		
	}
	
	//This is Non-static method with parameter which we declared in round bracket
	
	public void Subtraction(int a, int b)
	{
		int sub=a-b;
		System.out.println("=========================");
		System.out.println("Subtraction is "+sub);
		System.out.println("=========================");
	}
	
	public void bike_info(String owner, String name, String Engine, int price, int speed ) 
	{
		System.out.println("===============================================");
		System.out.println("This bike is belong to "+owner);
		System.out.println("Model of the bike is "+name);
		System.out.println("This bike has "+Engine+" Engine");
		System.out.println("On road price of this bike is Rs "+price);
		System.out.println("The speed limit of the bike is "+speed);
		System.out.println("===============================================");
	}
	
	public static void multiplication(int a, int b ) 
	{
		int mul=a*b;
		System.out.println("Multipliacation is "+mul);
	}
	
	public void division(int a, int b) 
	{
		float div=a/b;
		System.out.println("Division is "+div);
	}
	
	
}
