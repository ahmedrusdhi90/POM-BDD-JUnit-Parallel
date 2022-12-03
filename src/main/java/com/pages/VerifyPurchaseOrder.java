package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.factory.DriverFactory;

public class VerifyPurchaseOrder {
	
	private WebDriver driver;
	
	
	private By placeOrderBtn = By.xpath("//div[2]/button");
	private By name = By.id("name");
	private By country = By.id("country");
	private By city = By.id("city");
	private By creditCard = By.id("card");
	private By month = By.id("month");
	private By year = By.id("year");
	private By purchase = By.xpath("(//button[@class='btn btn-primary'])[3]");
	private By idDisplay = By.xpath("/html/body/div[10]/p");
	private By idDisplay1 = By.xpath("//div[10]/p[contains(text()[2],'Amount')]");
	
	public VerifyPurchaseOrder(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void navigateURL() {
		DriverFactory.getDriver().get("https://demoblaze.com/cart.html");
	}
	
	public String getpageTitile() {
		return driver.getTitle();
	}
	
	public void clickPlaceOrder() {
		driver.findElement(placeOrderBtn).click();
	}
	public void enterName(String username) {
		driver.findElement(name).sendKeys(username);
	}
	public void enterCountry(String userCountry) {
		driver.findElement(country).sendKeys(userCountry);
	}
	public void enterCity(String userCity) {
		driver.findElement(city).sendKeys(userCity);
	}
	public void enterCardNumber(String userCard) {
		driver.findElement(creditCard).sendKeys(userCard);
	}
	public void enterMonth(String userMonth) {
		driver.findElement(month).sendKeys(userMonth);
	}
	public void enterYear(String userYear) {
		driver.findElement(year).sendKeys(userYear);
	}
	public void clickPurchase() {
		driver.findElement(purchase).click();
	}
	public WebElement verifyText() {
		return driver.findElement(idDisplay);
	}
	
	public String display1() {
		return driver.findElement(idDisplay1).getText();
	}
	
}
