package control_statement;

public class Driving_section {

	public static void main(String[] args) {
		// below 18  year & above 60--> they r not drive  
		// 18-60
		
		int age=63;
		
		if (age>=18 & age<=40 ) 
		{
		System.out.println(" You are  eligible to drive");	
		
		}
		else if (age<=60) {
			System.out.println(" You are the person eligible to drive");
		
		}
		
		else {
			System.out.println("you are not eligible to drive");
		}
		
		
	}

}
