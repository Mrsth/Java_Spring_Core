package autowire_byName;

public class Flour {
	private String flour_color;
	
	public void setFlour_color(String flour_color) {
		this.flour_color = flour_color;
	}

	public void flour_method() {
		System.out.println("Flour selected.");
		System.out.println("Flour color = "+ flour_color);
	}
}
