package qualifier;

public class Heart {
	private String animalName;
	private int number_of_heart;

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getNumber_of_heart() {
		return number_of_heart;
	}

	public void setNumber_of_heart(int number_of_heart) {
		this.number_of_heart = number_of_heart;
	}

	public void heart_method() {
		System.out.println("The heart is pumping well.");
	}
}
