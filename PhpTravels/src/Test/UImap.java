package Test;

import org.openqa.selenium.By;

public class UImap {
	
	public static final By myAccountSection = By.xpath("/html/body/div[3]/div/div/div[2]/ul/ul/li[1]/a");
	
	public static final By loginLink = By.xpath("/html/body/div[3]/div/div/div[2]/ul/ul/li[1]/ul/li[1]/a");
	
	public static final By userNameField = By.name("username");
	
	public static final By passwordField = By.name("password");
	
	public static final By loginButton = By.xpath(".//*[@id='body-section']//button");
	
	public static final By newsLetterSection = By.xpath(".//*[@id='body-section']/div/div[3]/div/div[1]/ul/li[4]/a/span");
	
	public static final By toggleSectionYes = By.xpath(".//*[@id='newsletter']/div/div/label/span/span[2]");
	
	public static final By toggleSectionNo = By.xpath(".//*[@id='newsletter']/div/div/label/span/span[1]");
	
	public static final By currencyToggle = By.xpath("/html/body/div[3]/div/div/div[2]/ul/ul/li[2]/a/strong/i");
	
	public static final By euroCurrency = By.xpath("/html/body/div[3]/div/div/div[2]/ul/ul/li[2]/ul/li[4]/a");
	
	public static final By language = By.id("ir");
	
	public static final By locationBox = By.xpath("/html/body/div[4]/div[5]/div[1]/div/form/div[1]/div/div[2]/input");
	
	public static final By checkIn = By.xpath("/html/body/div[4]/div[5]/div[1]/div/form/div[2]/div[1]/input");
	
	public static final By checkInDate = By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[3]/td[7]");
	
	public static final By checkOutDate = By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[4]/td[1]");
	
	public static final By searchButton = By.xpath("/html/body/div[4]/div[5]/div[1]/div/form/div[2]/div[4]/button");
	
	public static final By searchResultsPage = By.xpath(".//*[@id='body-section']/div[3]/div/div/div[2]/div/span");
	
	

}
