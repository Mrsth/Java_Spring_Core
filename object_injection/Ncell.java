package object_injection;

public class Ncell implements Service{

	public void call_service() {
		System.out.println("Calling using Ncell sim card.");
	}

	public void data_service() {
		System.out.println("Using data via Ncell sim card.");
	}

}
