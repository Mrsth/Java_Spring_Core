package autowire_byName;

public class Cake {
	private Flour flour;
	private Cream cream;
	private Knife knife;
	
	public void setFlour(Flour flour) {
		this.flour = flour;
	}
	public void setCream(Cream cream) {
		this.cream = cream;
	}	
	public void setKnife(Knife knife) {
		this.knife = knife;
	}
	public void cake_method() {
		flour.flour_method();
		cream.cream_method();
		knife.knife_method();
	}
}
