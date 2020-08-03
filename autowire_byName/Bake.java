package autowire_byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bake {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("byName.xml");
		Cake obj1 = context.getBean("cake",Cake.class);
		obj1.cake_method();
	}

}
