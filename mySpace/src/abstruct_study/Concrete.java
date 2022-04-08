package abstruct_study;

public class Concrete extends Sample
{

	public static void main(String[] args) 
	{
		Concrete C=new Concrete();
		C.test1();
		C.test2();
		C.test3();
		
		C.test5();
		
	}


	public void test3() {
		System.out.println("This is test3 method of sample class");
		
	}

	
	public void test5() {
		System.out.println("This is test5 method of sample class");
		
	}


	
}
