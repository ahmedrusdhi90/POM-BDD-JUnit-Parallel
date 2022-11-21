package base;

import java.sql.Connection;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver driver;
	public static Connection con;
	public static Statement st;
	
	public static void navigateURL(String url) {
		driver.get(url);
	}	
	public static boolean isDisplayed(By by) {
		return driver.findElement(by).isDisplayed();
	}	
	public static String getText(By by) {
		return driver.findElement(by).getText();
	}	
	public static boolean isSelect(By by) {
		return driver.findElement(by).isSelected();
	}
	public static boolean eleEnabled(By by) {
		return driver.findElement(by).isEnabled();
	}
	public static void click(By by) {
		driver.findElement(by).click();
	}
	public static void sendKeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}
	public static void enter(By by) {
		driver.findElement(by).sendKeys(Keys.RETURN);
	}

}
