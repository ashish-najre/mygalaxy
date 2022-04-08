package loop;

public class For_loop {

	public static void main(String[] args) {
		// i want to print pattern
        int sum=0;

		for (int i = 1; i <=100; i++) 
		{ 
		sum=i%2;
		if(sum==1)
		{
			System.out.println(i);
		}
		}

	}

}
