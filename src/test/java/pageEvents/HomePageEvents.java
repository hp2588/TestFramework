package pageEvents;

import corePackage.BaseTest;
import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {

	public void clickOnSignInButton() {
		
		BaseTest.logger.info("Click on Sign In Button");
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
	}
	
}
