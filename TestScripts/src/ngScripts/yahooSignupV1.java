package ngScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
	@Test
	public void validateSignup() throws InterruptedException {
		
		
		WebElement firstName = driver.findElement(By.id("usernamereg-day"));
		firstName.sendKeys("13");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("usernamereg-freeformGender"));
		gender.sendKeys("dfdaljfdl");
		
		WebElement signInLink= driver.findElement(By.linkText("Sign in"));
		
		Thread.sleep(2000);
		
		
	}
	
	
	@AfterTest
	
	public void aftertest() {
		
		driver.quit();
		
	}
	

}
