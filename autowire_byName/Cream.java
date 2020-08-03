package autowire_byName;

public class Cream {
	private String cream_color;
	
	public void setCream_color(String cream_color) {
		this.cream_color = cream_color;
	}

	public void cream_method() {
		System.out.println("Cream selected");
		System.out.println("Cream color = "+ cream_color);
	}
}
