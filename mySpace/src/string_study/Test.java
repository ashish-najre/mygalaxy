package string_study;

public class Test   {
	
	public static void main(String[] args) 
	{
			String a="Ashish";
			String b="ashish";
			String e="Ashish Ashok Najre";
			
			System.out.println(a.equalsIgnoreCase(b));//"equalsIgnoreCase()" is method of string class which ignore the case sensitiveness  
			
			String c=new String("Ashish");
			String d=new String("Aashish");
			String f=new String("I am Conquar");
			
			System.out.println(a==b);			// "==" this operator check memory location for string if same return boolean value as true 
			System.out.println(a==c);			// "==" it gives boolean value as false 
			System.out.println(a.equals(c));	// "equals" this operator check content of string if same then return boolean value as true 
			System.out.println(a.equals(d));	// "equals" it gives boolean value as false
			
			System.out.println(e.length());		// length() is the method of string class and it specifies the number of character in string & return integer value 
			
			
			int sizeofe=e.length();				// "sizeofe" is reference variable used to store value for temporary purpose to used somewhere in code
			System.out.println("length of String is "+sizeofe);
			
			System.out.println(e.toUpperCase());//"toUpperCase()" method of string class to convert sequence of character in its upper-case format
			
			String Capital = f.toUpperCase();//"Capital is reference variable
			System.out.println(Capital);
			
			String Small=Capital.toLowerCase();//"toLowerCase()" is method of string class to covert sequence of character in its lower-case format 
			System.out.println(Small);			// Small is Reference variable
			
			
	
			
			
			
			
	}

	
	
}
