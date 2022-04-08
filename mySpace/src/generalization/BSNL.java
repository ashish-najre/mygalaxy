package generalization;

public class BSNL  implements TRAI{
	@Override
	public void call() {
		System.out.println("BSNL call rate- 10p/min");
		
	}

	@Override
	public void sms() {
		System.out.println("BSNL SMS- 200 sms/day");
		
	}

	@Override
	public void data() {
		System.out.println("BSNL data-2.5GB/day");
		
	}
	
	public void Broadband() {
		System.out.println("Broadband for 2 month");
	}

}
