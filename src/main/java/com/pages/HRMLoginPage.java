package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HRMLoginPage {
	
	private WebDriver driver;
	
	//1.By Locators
	private By userId = By.name("username");
	private By password = By.name("password");
	private By submit = By.tagName("button");
	private By forgotPwdLink = By.linkText("Forgot your password?");
	private By homePageHeading = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5");
	private By ErrorMessage = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
	private By PIM = By.xpath("//a[.='PIM']");		
	
	//2.Constructor of the page class
	public HRMLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//3. page actions: feature of the page the form of methods
	
	
	public String getLoginTitile() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(userId).sendKeys(username);
	}
	
	public void enterPassword(String userPassword) {
		driver.findElement(password).sendKeys(userPassword);
	}
	
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
	
	public String verifyHeading() {
		return driver.findElement(homePageHeading).getText();
	}
	
	public String actualErrorMsg() {
		return driver.findElement(ErrorMessage).getText();
	}
	
	public void clickPIM() {
		driver.findElement(PIM).click();
	}
}
