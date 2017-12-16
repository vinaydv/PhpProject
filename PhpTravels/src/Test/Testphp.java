package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testphp {
	
	WebDriver driver ; 
	
	@BeforeTest
	public void setDriver(){
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Hackathon/Downloads/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--enable-automation");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	
		
		
	}
	
	@Test
	public void Test1(){
		
	}
	
	@Test
	public void Test2(){
		
	}
	
	
	@Test
	public void Test3(){
		
	}
	
	
	@Test
	public void Test4(){
		
	}
	
	
	
	
	

}
