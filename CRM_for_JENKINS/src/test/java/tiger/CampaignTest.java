package tiger;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CampaignTest {

	@Test(groups = "Smoke Testing")
	public void camp() {
		Reporter.log("created campaign",true);
	}
}
