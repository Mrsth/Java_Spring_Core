package constructor_dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Constructor.xml");
		Student obj1 = context.getBean("student_bean",Student.class);
		obj1.Student_method();
	}
}
