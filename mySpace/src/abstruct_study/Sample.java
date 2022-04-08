package abstruct_study;

public abstract class Sample 
{
  public void test1() 
  {
	System.out.println("this is the test1 non-static method in sample class");  
  }
  public void test2() 
  {
	  System.out.println("this is the test1 non-static method in sample class");

  }
  
  public abstract void test3();
  
  public static void test4() {
	  System.out.println("This is static method in sample class");
  }
  public abstract void test5();

	
}
