package amazonPackage;

import org.springframework.beans.factory.annotation.Value;

public class Amazon {
	@Value("${amazon.itemid}")
	private int itemid;
	private Dress dress;

	public Amazon(Dress dress) {
		this.dress = dress;
	}

	public void test() {

		System.out.println("Welcome to Amazon");
		System.out.println("The item id is : " + itemid);
		dress.displayBrandInfo();
	}

}
