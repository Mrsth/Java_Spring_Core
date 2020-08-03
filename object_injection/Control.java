package object_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Control {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("MobileConfig.xml");
		Mobile obj1 = context.getBean("mobile",Mobile.class);
		obj1.mobile_service();
	}
}
