package practice_package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("practice.xml");
		Student obj1 = context.getBean("student_bean", Student.class);
		obj1.student_method();
	}

}
