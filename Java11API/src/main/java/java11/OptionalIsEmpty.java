package java11;

import java.util.Optional;
import java.util.Random;

/**
 * @author rishiraj
 * to demonstrate Optional.isEmpty() 
 */
public class OptionalIsEmpty {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Optional o = Optional.of(" ");
		o = Optional.empty();

		if(0 == new Random().nextInt(3)%2) {
			o = Optional.of(" ");
			System.out.println("Optional set to hold a String value.");
		}
		//JDK 11
		System.out.println("is empty?: "+o.isEmpty());
		
	}
}
