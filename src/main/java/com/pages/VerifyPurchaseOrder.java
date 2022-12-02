package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	public String verifyHeading() {
		return driver.findElement(idDisplay).getText();
	}
	
	
}
