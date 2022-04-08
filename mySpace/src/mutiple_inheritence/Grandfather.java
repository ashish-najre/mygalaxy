package mutiple_inheritence;

public class Grandfather {

	public void test1()
	{
		System.out.println("This is the test 1 of grandfather");
	}
	
	public static void test2() 
	{
		System.out.println("This is the test 2 of grandfather");
	}
	
	public static void main(String[] args) 
	{
		Grandfather G=new Grandfather();
		G.test1();
		test2();
	
	}

}
