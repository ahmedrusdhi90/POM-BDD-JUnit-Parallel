package stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.VerifyPurchaseOrder;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyPurchaseOrderSteps {	
	VerifyPurchaseOrder purchaseOrder = new VerifyPurchaseOrder(DriverFactory.getDriver()); 
	
	@Given("user is on place order page")
	public void user_is_on_place_order_page() {
		VerifyPurchaseOrder.navigateURL();
	}

	@When("user get the title of the page")
	public void user_get_the_title_of_the_page() {
		purchaseOrder.getpageTitile();
	}

	@Then("place page title should be {string}")
	public void place_page_title_should_be(String expectedTitle) {
		String actualTitle = purchaseOrder.getpageTitile();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@When("user click on place order")
	public void user_click_on_place_order() {
		purchaseOrder.clickPlaceOrder();
	}

	@Then("user enters name {string}")
	public void user_enters_name(String name) {
		purchaseOrder.enterName(name);
	}

	@And("user enters country {string} and city {string}")
	public void user_enters_country_and_city(String country, String city) {
		purchaseOrder.enterCountry(country);
		purchaseOrder.enterCity(city);
	}

	@And("user enters credit card {string}")
	public void user_enters_credit_card(String card) {
		purchaseOrder.enterCardNumber(card);
	}

	@And("user enters month {string} and year {string}")
	public void user_enters_month_and_year(String month, String year) {
		purchaseOrder.enterMonth(month);
		purchaseOrder.enterYear(year);
	}

	@And("user clicks on purchase button")
	public void user_clicks_on_purchase_button() {
		purchaseOrder.clickPurchase();
	}

	@Then("user gets text of the purchase page")
	public void user_gets_the_title_of_the_purchase_page() {
		WebElement idValue = purchaseOrder.verifyText();	
		String[] myTextArray = idValue.getAttribute("innerHTML").split("<br>");
		String myText02 = myTextArray[1];
		System.out.println(myText02);
//		System.out.println(purchaseOrder.display1());
		
	}

}
