package loop;

import java.util.Scanner;

public class Digit_table_creation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to create table");
				
		int num=sc.nextInt();
		
		for (int i = 1; i <=10; i++)
		{
		System.out.println(num*i);
		}

	}

}
