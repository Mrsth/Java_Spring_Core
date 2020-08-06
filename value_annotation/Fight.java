package value_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Fight {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("wrestler.xml");
		Wrestler obj1 = context.getBean("wrestler",Wrestler.class);
		
		if(context==null) {
			System.out.println("Empty context.");
		}else {
		obj1.wrestler_method();
		}
	}
}
