package control_statement;

public class Else_if {

	public static void main(String[] args)
	{
		// depending on mark we categories the candidate
		// 40-50----> second class
		//50-60------>Higher second class 
		//60-75------> First class 
		//>=75-------> Distinction
		
		int marks=75;
		
		if (marks>=40 & marks<=50) 
		{
			System.out.println("you are pass with second class");
		}
		else if (marks>50 & marks<60) 
		{
			System.out.println("You are pass with higher second class");
		}
		else if (marks>=60 & marks<75)
		{
		System.out.println("You are pass with first class");
		}
		else if (marks>=75)
		{
			System.out.println("You are pass with distinction");
		}
		else
		{
		 System.out.println("You are faied. you have to do more practice");	
		}
		
		

	}

}
