package ngScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class yahooSignupV1 {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void beforetest() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
        
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority=1)
	public void validateSignupUrl() {
		
		//String x = "mchael";
		//String expectedUrl = "https://login.yahoo.com/account/create";
		//String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://login.yahoo.com/account/create");
		
		
		
	
		
		
	}
	
	
	@Test(priority=2)
	public void validateTitle() {
		
		
		System.out.println("This is Btest");
		
		String expectedTtitle = "Yahoo signup";
		
		String actualTtitle = driver.getTitle();
		Assert.assertEquals(actualTtitle, expectedTtitle);
		
		
		
		
		//Assert.assertEquals("dfads", "ghjhj");
		
	}
	
	@Test (priority=3)
	public void validateSignup() throws InterruptedException {
		
		
		WebElement firstName = driver.findElement(By.id("usernamereg-day"));
		firstName.sendKeys("Michael");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("usernamereg-freeformGender"));
		gender.sendKeys("dfdaljfdl");
		
		WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]"));
		
		boolean test = continueButton.isEnabled();
		
		Assert.assertTrue(test);
		
		
		
	}
	
	
	@AfterTest
	
	public void aftertest() {
		
		driver.quit();
		
	}
	

}
