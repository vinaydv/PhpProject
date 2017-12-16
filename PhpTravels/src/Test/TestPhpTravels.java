package Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPhpTravels {
	
	public WebDriver driver = null ; 
	
	@BeforeTest
	public void setDriver(){
				
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--enable-automation");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://phptravels.net");
		driver.manage().window().maximize();
	}
	
	/*@Test
	public void testLogin() throws IOException{
		
		
		CommonComponents.setEuroCurrencyAndLanguage(driver);
		CommonComponents.login(driver);
		
	}*/
	
		
	@Test
	public void testNewsLetter() throws InterruptedException, IOException{
		
		CommonComponents.setEuroCurrencyAndLanguage(driver);
		CommonComponents.login(driver);
		Assert.assertEquals(CommonComponents.newsletterSectionDefault(driver), "Yes");
		Assert.assertEquals(CommonComponents.newslettertoggle(driver),"No");
		
		
		CommonComponents.newslettertoggle(driver);
		
		
	}
	
	@Test
	public void testSearchHotels() throws IOException
	{
		CommonComponents.setEuroCurrencyAndLanguage(driver);
		CommonComponents.login(driver);
		
		Assert.assertTrue(CommonComponents.searchHotels(driver));
		
	}
	
	
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
}
