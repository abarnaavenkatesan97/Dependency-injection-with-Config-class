package amazonPackage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Myntra implements Dress {

	public void displayBrandInfo() {
		System.out.println("The dress is from Myntra brand");

	}

}
