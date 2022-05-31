class prime1{

public static void main(String[]args){

	int num=17;
	int count=0;

for(int i=0;i<=num;i++)
	{
	if(num%i==0)
	count++;
	}
	if(count==2)
	{System.out.println(num+" is prime number");}
	else
	{System.out.println(num+" i snot prime number");}
}
}