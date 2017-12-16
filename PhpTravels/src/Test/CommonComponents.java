package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonComponents {
	
	
	public static void gotoLoginPage(WebDriver driver){
		Reusable.clickElementByXpath(driver, UImap.myAccountSection);
		Reusable.clickElementByXpath(driver, UImap.loginLink);
	}
	
	public static void login(WebDriver driver) throws IOException{
		gotoLoginPage(driver);
		String userDetails = GetUserDetails.getdata();
		String[] userName = userDetails.split(",");
		Reusable.sendKeysInTextBox(driver, UImap.userNameField,userName[0]);
		Reusable.sendKeysInTextBox(driver, UImap.passwordField, userName[1]);
		Reusable.clickElementByXpath(driver, UImap.loginButton);
	}

	public static String newsletterSectionDefault(WebDriver driver) throws InterruptedException{
		
		Reusable.clickElementByXpath(driver, UImap.newsLetterSection);
		Thread.sleep(2000);
		return Reusable.getText(driver, UImap.toggleSectionYes);
	}

	public static String newslettertoggle(WebDriver driver) throws InterruptedException {
		Reusable.clickElementByXpath(driver, UImap.toggleSectionYes);
		Thread.sleep(5000);
		return Reusable.getText(driver, UImap.toggleSectionNo);
		
	}
	
	public static void setEuroCurrencyAndLanguage(WebDriver driver) {
       
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(UImap.currencyToggle)).click();
        action.moveToElement(driver.findElement(UImap.euroCurrency)).click();
        action.moveToElement(driver.findElement(UImap.language)).click();
        action.perform();
	}
	
	public static boolean searchHotels(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5000);

		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[3]/div/div[1]/ul/li[1]/a/span")));
		 WebElement hotel = driver.findElement(By.xpath("/html/body/nav[1]/div/div/div/ul/li[7]/a"));
		 hotel.click();
		 
		 WebElement elem4 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[6]/div/a/i"));
		 elem4.click();
		
		Reusable.sendKeysInTextBox(driver, UImap.locationBox,"Bangalore");
		Reusable.clickElementByXpath(driver, UImap.checkIn);
		Reusable.clickElementByXpath(driver, UImap.checkInDate);
		Reusable.clickElementByXpath(driver, UImap.checkOutDate);
		Reusable.clickElementByXpath(driver, UImap.searchButton);
		return Reusable.ElementIsDisplayed(driver, UImap.searchResultsPage);
		
	}
}
