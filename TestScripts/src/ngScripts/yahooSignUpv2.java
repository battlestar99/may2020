package ngScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.homePage;
import pages.yahooPage;

public class yahooSignUpv2 {
	
	
WebDriver driver; 
yahooPage yp;
homePage hp; 

	
	
	@BeforeTest
	public void beforetest() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
        
       driver = new ChromeDriver();
        yp = new yahooPage(driver);
		 hp=new homePage(driver);
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void validateSignup() throws InterruptedException {
		
		
		//WebElement firstName = driver.findElement(By.name("firstName"));
		// firstName.sendKeys("Michael");
		
		
		driver.getCurrentUrl();
		
		yp.getfirstName().sendKeys("Michael");
		
		Thread.sleep(2000);
		
		//WebElement dd = driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select"));
		
		Select phonedd= new Select(yp.getPhoneDD());
		
		phonedd.selectByVisibleText("Andorra ‪(+376)‬");
		
		//phonedd.selectByIndex(15);
		Thread.sleep(2000);
		
		
	}
	
	
	@AfterTest
	
	public void aftertest() {
		
		driver.quit();
		
	}
	


}
