package qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("human_bean")
	private Heart heart;
	
	public void human_method() {
		if(heart == null) {
			System.out.println("The heart is not pumping.");
		}else {
			heart.heart_method();
			System.out.println("Animal type = "+ heart.getAnimalName());
			System.out.println("Number of heart = "+ heart.getNumber_of_heart());
		}
	}
}
