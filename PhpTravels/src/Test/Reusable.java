package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Reusable {
	
	public static void clickElementByXpath(WebDriver driver, String object){
		driver.findElement(By.xpath(object)).click();
		
	}
	
	public static void clickElementByID(WebDriver driver, String object){
		driver.findElement(By.id(object)).click();
	}
	
	public static void selectDropDownByText(WebDriver driver, String object, String value){
		Select select = new Select(driver.findElement(By.xpath(object)));
		select.selectByVisibleText(value);
	}
	
	public static void sendKeysInTextBox(WebDriver driver, String object,String text){
		driver.findElement(By.xpath(object)).sendKeys(text);
	}
	
	public static void clearTextBox(WebDriver driver, String locator){
		driver.findElement(By.xpath(locator)).clear();
	}
	
	public static boolean ElementIsDisplayed(WebDriver driver, String object){
		return driver.findElement(By.xpath(object)).isDisplayed();
	}
	
	public static boolean ElementIsEnabled(WebDriver driver, String object){
		return driver.findElement(By.xpath(object)).isEnabled();
	}
	
	
	
	
	

}
