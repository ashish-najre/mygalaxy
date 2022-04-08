
package control_statement;
import java.util.Scanner;
public class Acadamic {

	public static void main(String[] args) {
	// here we are taking marks of various subject
		
		Scanner Mt=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=Mt.nextLine();
		System.out.println("Enter marks in Math :");
		int math=Mt.nextInt();
		System.out.println("Enter marks in Physics :");
		int Phy=Mt.nextInt();
		System.out.println("Enter marks in Chemistry :");
		int Chem=Mt.nextInt();
		
		float percent=((math+Chem+Phy)/3);	
		
		if (math>=35 & Phy>=35 & Chem>=35)
		{
			System.out.println("Your percentage is "+percent);
			System.out.println("You are eligible for Admission Procedure..");
		}
		else if(percent>=90) 
		{
			System.out.println(" There will be hope to get admission in Government Engg.college..");
		}
		else if (percent>=80 &percent<=90) 
		{
		System.out.println("You will get admission in Top 5 Private Engg. Clg in Maharashtra....");	
		}
		else if (percent>=50 & percent<80) 
		{
		System.out.println("You will get admission in average private engg. college.....");	
		}
		else 

		 {
			System.out.println("Your percentage is "+percent);
			System.out.println("You are fail and not eligible to take admission. please try next year....");
		 }
		 		
		
		}
	}
