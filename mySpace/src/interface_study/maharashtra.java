package interface_study;

public interface maharashtra
{
	int a=100;
	void Raigad();
	void Torna();
	   default void RBI()
	{
		System.out.println("RBI decide the monetary policy");
	}
	   static void add() {
			int a=104;
			System.out.println("Addition is "+a);
		}
//	void RBI();
}