package tiger;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrganizationTest {

	@Test(groups = "Regression Testing")
	public void camp() {
		Reporter.log("created campaign",true);
	}
}
