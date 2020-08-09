package ngScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.yahooPage;

public class yahooSignupDataDriven {
	
	
	
	WebDriver driver; 
	yahooPage yp;
	
	
	@BeforeTest
	public void beforetest() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
        
       driver = new ChromeDriver();
        yp = new yahooPage(driver);
	
		
		
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Parameters({"firstName","lastName","email","password","expectedTtitle","month"})
	@Test
	public void validateSignupData(String firstName, String lastName, String email, String password, String expectedTtitle,String month) throws InterruptedException {
		
		yp.getfirstName().sendKeys(firstName);
		yp.getlastName().sendKeys(lastName);
		
		Thread.sleep(2000);
		yp.getEmailaddress().sendKeys(email);
		
		// look into this line of code 
		//yp.getPassword().sendKeys(password);
		
		// this is how it started 
		
		driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]")).sendKeys(password);
		
		
		Select phoneDd= new Select(yp.getPhoneDD());
		phoneDd.selectByVisibleText("Anguilla ‪(+1)‬");
		
		Select monthdd=new Select(yp.getBirthMonthDD());
		monthdd.selectByVisibleText(month);
		
		boolean test = yp.getcontinueButton().isEnabled();
		
		String actualTtitle = driver.getTitle();
		
		// Assert.assertTrue(test);
		 
		 Assert.assertEquals(actualTtitle, expectedTtitle);
		
		
		
	}
	
	
	
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	

}
