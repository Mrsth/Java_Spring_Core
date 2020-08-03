package constructor_dependency_injection;

public class Student {
	private String name;
	private int roll;
	private Subject subject;
	
	public Student (String name, int roll, Subject subject) {
		this.name = name;
		this.roll = roll;
		this.subject = subject; 
	}
	
	public void Student_method() {
		System.out.println("Name = "+name+" Roll = "+roll);
		subject.subject_method();
	}
}
