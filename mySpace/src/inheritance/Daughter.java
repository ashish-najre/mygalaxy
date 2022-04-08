package inheritance;

public class Daughter extends Child				// this is the example of multilevel inheritence means that 
{												//child class extends properties of its super class(mother class) 
												// and daughter class extends properties of its super class (child class)
	public static void beautiful() 
	{
	System.out.println("Daughter is as beatiful as her mother");	
		
	}
	public static void main(String[] args) 
	{
		beautiful();
		Daughter d=new Daughter();
		d.Nature();	
		d.Active();
		calculation();

	}

}
