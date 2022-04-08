package methods;

public class Regular
{

	public static void main(String[] args)
	{
		
		int Num;
		Num=1994;
		
		System.out.println("The number is "+Num);
		sample1();
		sample2();		// method calling--->syntax---->methodname();
		sample1();		//Static regular method call from same class 
		sample2();	
		
	}
	public static void sample1() // method defination or complete method 
	{
	 System.out.println("This is our sample1 in  method and it show how to call method in another class");		// body of the method which is going to execute when we call method in main
	}
	public static void sample2() 
	{
	 System.out.println("This is our sample2 in  method");
	}
	
	
}
