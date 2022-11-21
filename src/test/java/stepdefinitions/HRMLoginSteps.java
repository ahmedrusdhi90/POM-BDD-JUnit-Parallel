package stepdefinitions;


import org.testng.Assert;

import com.pages.HRMLoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMLoginSteps {
	
	private HRMLoginPage loginPage = new HRMLoginPage(DriverFactory.getDriver());
	
	@Given("User is on HRMLogin page {string}")
	public void loginTest(String url) {
				
		DriverFactory.getDriver().get(url);
	}

	@When("User enters username as {string} and password as {string}")
	public void goToHomePage(String userName, String passWord) throws InterruptedException {

		// login to application
		
		loginPage.enterUserName(userName);
		
		loginPage.enterPassword(passWord);
		
		Thread.sleep(3000);
		loginPage.clickSubmit();
	}

	@Then("User should be able to login sucessfully and new page open")
	public void verifyLogin() {
		loginPage.clickPIM();
		String homePageHeading = loginPage.verifyHeading();	
		Assert.assertEquals(homePageHeading, "Employee Information");
	}

	@Then("User should be able to see error message {string}")
	public void verifyErrorMessage(String expectedErrorMessage) {

		String actualErrorMessage = loginPage.actualErrorMsg(); 
		// Verify Error Message
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

}
