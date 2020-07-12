package ngScripts;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.homePage;
import pages.yahooPage;

public class yahooSignupData {

	WebDriver driver; 
	yahooPage yp;
	
	
	@BeforeTest
	public void beforetest() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
        
       driver = new ChromeDriver();
        yp = new yahooPage(driver);
	
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void validateSignupData() {
		
		yp.getfirstName().sendKeys("Michael");
		yp.getlastName().sendKeys("Scott");
		yp.getEmailaddress().sendKeys("mscott");
		yp.getPassword().sendKeys("djfdjfla+");
		
		Select phoneDd= new Select(yp.getPhoneDD());
		phoneDd.selectByVisibleText("Anguilla ‪(+1)‬");
		
		Select monthdd=new Select(yp.getBirthMonthDD());
		monthdd.selectByVisibleText("April");
		
		boolean test = yp.getcontinueButton().isEnabled();
		
		 Assert.assertTrue(test);
		
		
		
		
		
	}
	
	
	
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
}
