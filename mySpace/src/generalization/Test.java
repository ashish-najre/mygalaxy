package generalization;

public class Test {

	public static void main(String[] args) {
		
		Jio j=new Jio();
		System.out.println("=====================================");
		j.call();
		j.sms();
		j.data();
		Jio.Jiotv();
		System.out.println("Price Of Jio SIM is "+TRAI.SIM);
		System.out.println("======================================");
		Airtel a=new Airtel();
		System.out.println("======================================");
		a.call();
		a.sms();
		a.data();
		a.airtelprime();
		System.out.println("Price Of Airtel SIM is "+TRAI.SIM);
		System.out.println("======================================");
		
		BSNL b=new BSNL();
		System.out.println("======================================");
		b.call();
		b.sms();
		b.data();
		b.Broadband();
		System.out.println("Price Of BSNL SIM is "+TRAI.SIM);
		System.out.println("======================================");
		

	}

}
