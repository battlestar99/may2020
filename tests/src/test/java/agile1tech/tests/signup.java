package agile1tech.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class signup {
	
	WebDriver driver; 
	
	@BeforeTest
	public void beforetest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Java Development\\programming libraries\\chromedriver.exe");
        
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	@AfterTest
	
	public void afterTest() {
		
		driver.quit();
		
	}
	
	@Test(priority=1)
	public void validatemessangerLink() {
		
		
		
		Assert.assertEquals("Messenger", "dkjfdj");
		
		Reporter.log("Validating the messanger page link");
		
	}

}
