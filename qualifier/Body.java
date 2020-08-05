package qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Qualifier.xml");
		Human obj1 = context.getBean("human",Human.class);
		obj1.human_method();
	}
}
