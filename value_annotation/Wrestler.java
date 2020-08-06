package value_annotation;

public class Wrestler {
	private String name;
	private String finisher;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFinisher() {
		return finisher;
	}

	public void setFinisher(String finisher) {
		this.finisher = finisher;
	}
	
	public void wrestler_method() {
		System.out.println("Wrestler called.");
		System.out.println("Name = "+ name);
		System.out.println("Finisher = "+finisher);
	}
}
