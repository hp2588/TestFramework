package pageEvents;

import org.testng.Assert;

import corePackage.BaseTest;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	
	public void verifyLoginPageOpenedOrNot() {
		BaseTest.logger.info("Verify the Sign-In title on page");
		ElementFetch elementfetch = new ElementFetch();
		Assert.assertTrue(elementfetch.getListWebElements("XPATH", LoginPageElements.loginText).size() > 0,"login page did not open");
		
	}
	
	public void enterEmailId() {
		BaseTest.logger.info("Verify User is able to enter username");
		ElementFetch elementfetch = new ElementFetch();
		elementfetch.getWebElement("ID",LoginPageElements.emailAddress).sendKeys("abc@gmail.,com");
		
	}
}
