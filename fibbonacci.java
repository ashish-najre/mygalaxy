class fibbonacci{

public static void main(String[]args)
{
	int a=2;
	int b=3;
	int fibbo=0;
	
	for(int i=0;i<5;i++)
	{
		fibbo=a+b;
		System.out.print(" "+fibbo);
		a=b;
		b=fibbo;
	}
			
}

}
