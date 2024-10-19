package tiger;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups = "Smoke Testing")
	public void camp() {
		Reporter.log("created contact",true);
	}

}
