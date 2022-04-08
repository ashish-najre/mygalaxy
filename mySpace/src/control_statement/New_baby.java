package control_statement;
import java.util.Scanner;
public class New_baby {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Age of Baby in Month");
		int Age=Sc.nextInt();
		System.out.println("Enter the weight (KG) of Baby");
		float weight=Sc.nextFloat();
		
		if (Age==1 & weight<=2.9 & weight>4.5) 
		{
			System.out.println("One Month baby is  under-weighted");
		}
		else if (Age==1)
		{
			System.out.println("one month baby is healthy");
		}
		else if (Age==12 & weight<7.7  )
		{
			System.out.println("Twelve Month baby is  under-weighted ");	
		}
		else if (Age==12)
		{
			System.out.println("Twelve month baby is healthy");
		}
		else if (Age==72 & weight<15.9)
		{
			System.out.println("Twelve Month baby is under-weighted ");	
		
		}
		else {
			System.out.println("Seventy two month baby is healthy");
		}
	}

}
