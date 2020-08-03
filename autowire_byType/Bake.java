package autowire_byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bake {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("byType.xml");
		Cake obj1 = context.getBean("cake_bean",Cake.class);
		obj1.cake_method();
	}
}
