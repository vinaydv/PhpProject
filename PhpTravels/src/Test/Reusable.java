package Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	
	public static String getText(WebDriver driver, By object){

		String text = driver.findElement(object).getAttribute("innerHTML");
		return text;
	}
	
	
	
	
	
	
	

}
