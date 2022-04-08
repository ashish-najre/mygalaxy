package generalization;

public class Airtel implements TRAI {
	@Override
	public void call() {
		System.out.println("Airtel call rate- 40p/min");
		
	}

	@Override
	public void sms() {
		System.out.println("Airtel SMS- 150 sms/day");
		
	}

	@Override
	public void data() {
		System.out.println("Airtel data-1GB/day");
		
	}
	
	public void airtelprime() {
		System.out.println("Airtel prime for one month");
	}

}
