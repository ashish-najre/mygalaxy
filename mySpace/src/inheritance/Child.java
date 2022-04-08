package inheritance;

public class Child extends mother 				// here we extends mother class with help of single-level  
{												// inheritance

	public static void main(String[] args) 
	{
	  Child c=new Child();		// creating object of child class
	  c.Nature();				// called member mother
	  calculation();			// called static member of mother 
	  c.Active();
	  
		
		
	}
	public void Active() 		// this is non-static regular method 
	{
		System.out.println("Child is active like his father ");
	}
	
}
