package setter_dependency_injection;

public class Student {
	private String name;
	private int roll;
	private Subject subject;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public void student_method() {
		System.out.println("Name = "+name+" Roll = "+roll);
		subject.subject_method();
	}
}
