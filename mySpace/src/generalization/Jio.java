package generalization;

public class Jio implements TRAI {

	@Override
	public void call() {
		System.out.println("Jio call rate- 20p/min");
		
	}

	@Override
	public void sms() {
		System.out.println("Jio SMS- 100 sms/day");
		
	}

	@Override
	public void data() {
		System.out.println("Jio data-1.5GB/day");
		
	}
	
	public static void Jiotv() {
		System.out.println(" Jiotv free for one Month");
	}

}
