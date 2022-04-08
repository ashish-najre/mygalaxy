package interface_study;

public interface india 		// father interface
{
					// variable is by default static and final
	
	
	void himalaya();				//In interface methods are by default public and abstract
	void tajmahal();
	 default void RBI()
	{
	System.out.println("RBI is Controller for all bank");
	
	}
	static void add() {
		int a=10;
		System.out.println("Addition is "+a);
	}
	
}
