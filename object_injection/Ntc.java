package object_injection;

public class Ntc implements Service{

	public void call_service() {
		System.out.println("Calling using NTC sim card.");
		
	}

	public void data_service() {
		System.out.println("Using data via NTC sim card.");		
	}

}
