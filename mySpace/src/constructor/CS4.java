package constructor;

public class CS4
{
	int a;	// 1. Variable declaration
	int b;	// 1. Variable declaration			Also called global variable
	int c;	// 1. Variable declaration
	
	
	public CS4()		// Constructor with zero parameter
	{
		a=5;	// 2. Variable initialization
		b=8;	// 2. Variable initialization
		c=10;	// 2. Variable initialization
		System.out.println("The constructor is running without parameter");
	}
	public CS4(int num1)	// Constructor with zero parameter
	{
		a=num1;
		b=num1;
		c=num1+5;
		System.out.println("The constructor is running with one parameter");
	}
	public CS4(int num1,int num2) 
	{
		a=num1;
		b=num2;
		System.out.println("The constructor is running with two parameter");
			
	}
	public CS4(int num1,int num2,int num3)
	{
		a=num1;
		b=num2;
		c=num3;
		System.out.println("The constructor is running with Three parameter");
	}
	
	public static void main(String[] args) 
	{
		CS4 c4=new CS4();		// when we create object. same constructor get executed
		c4.addition();
		CS4 c5=new CS4(5);
		c5.addition();
		CS4 c6=new CS4(29,2);
		c6.addition();
		CS4 c7=new CS4(25,5);
		c7.addition();
		CS3 b3=new CS3();		// The object created to call non-static variable(global variable)from class-CS3
		System.out.println("The name is "+b3.name);		// Usage of that non-static variable..
		System.out.println("==========================");
		System.out.println("The Charactor is **" +b3.sec+"**");
		
		
	}
	
	// Here I created one Non-static method 
	public void addition()  
	{ 	
			int sum=a+b+c;
			System.out.println("======================");
			System.out.println("The Addition is "+sum);
			System.out.println("======================");
	}

}
