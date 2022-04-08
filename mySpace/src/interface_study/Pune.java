package interface_study;

public class Pune implements india,maharashtra
{

	public static void main(String[] args) {
		
		Pune p=new Pune();
		p.Raigad();
		p.Torna();
		p.himalaya();
		p.tajmahal();
		p.RBI();
		india.add();
		maharashtra.add();
		System.out.println("value of a"+a);
		
		
		
	}

	@Override
	public void Raigad() {
		System.out.println("Raigad is in Kokan");
		int a=20;
		int b=10;
		int sum=a+b;		
	}

	@Override
	public void Torna() {
		System.out.println("Torna is near to pune");
		
	}

	@Override
	public void himalaya() {
		System.out.println("Himalaya is in north of india");
		
	}

	@Override
	public void tajmahal() {
		System.out.println("Tajmahal is near delhi");
		
	}

	@Override
	public void RBI() {
		System.out.println("RBI is Main  Controller Bank of India");
		india.super.RBI();
		maharashtra.super.RBI();
		
		
	}

	

}
