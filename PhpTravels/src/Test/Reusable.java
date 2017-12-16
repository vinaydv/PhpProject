package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Reusable {
	
	public static void clickElementByXpath(WebDriver driver, By object){
		driver.findElement(object).click();
	}
	
		
	public static void selectDropDownByText(WebDriver driver, By object, String value){
		Select select = new Select(driver.findElement(object));
		select.selectByVisibleText(value);
	}
	
	public static void sendKeysInTextBox(WebDriver driver, By object,String text){
		driver.findElement(object).sendKeys(text);
	}
	
	public static void clearTextBox(WebDriver driver, By object){
		driver.findElement(object).clear();
	}
	
	public static boolean ElementIsDisplayed(WebDriver driver, By object){
		return driver.findElement(object).isDisplayed();
	}
	
	public static boolean ElementIsEnabled(WebDriver driver, By object){
		return driver.findElement(object).isEnabled();
	}
	
	
	
	
	

}
