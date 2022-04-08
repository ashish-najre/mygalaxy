package constructor;

public class CS3 {
	static int a=10;	//this is static variable 
	String name="Ashish";	// this is non-static variable
	static float num=10.5f;  // These are also called as global variable becoz these are declared within the class but outside method
	char sec= 'S';
	
	
	public static void main(String[] args) {		/*In First session we define variable in main method but when 
						we declared it outside the main	 then have to follow syntax like to call non-static method */
		CS3 c=new CS3();
		System.out.println("The value of A is " +a);
		System.out.println("My name is "+c.name);
		System.out.println("My favorite float is "+num);
		System.out.println("My lucky Alpabet is ** "+c.sec+"**");
		

	}

}
