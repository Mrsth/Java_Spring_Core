package object_injection;


public class Mobile {
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void mobile_service() {
		System.out.println("Welcome to mobile service");
		service.call_service();
		service.data_service();
	}
}
