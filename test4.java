class test5{

public static void main(String[] args){

	int num=528;
	int armstrong=0;
	int temp=num;
	int count=0;

	while(temp>0)
	{
		int d=temp%10;
		count++;
		temp=temp/10;	
	}
	
	System.out.println(count);
	
}

}