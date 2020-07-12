package ngScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.homePage;
import pages.messangerPage;

public class messengerTest {
	
	WebDriver driver; 
	messangerPage mp; 
	homePage hp; 
	
	
	
	
	@BeforeTest
	public void beforetest() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
        
		driver = new ChromeDriver();
		mp= new messangerPage(driver);
		hp = new homePage(driver);
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
		
		String actualText = hp.getMessangerLink().getText();
		
		Assert.assertEquals("Messenger", actualText);
		
		Reporter.log("Validating the messanger page link");
		
	}
	
	
	@Test(priority=2)
	public void validateUrl() throws InterruptedException {
		
		hp.getMessangerLink().click();
		Thread.sleep(2000);
		String actualurl = driver.getCurrentUrl();
		
		System.out.println(actualurl);
		String expectedUrl = "https://www.messenger.com/";
		Assert.assertEquals(actualurl, expectedUrl);
		
		Reporter.log("Validating the messanger page URL");
		
		
		
	}
	
	
	@Test(priority=3, dependsOnMethods= {"validateUrl"})
	public void validateTtitle() {
		// we don't need this link
	//	hp.getMessangerLink().click();
		
		String actualTtitle = driver.getTitle();
		String expectedTitle = "Messenger";
		Assert.assertEquals(actualTtitle, expectedTitle);
		
		Reporter.log("Validating the messanger page title");
		
	}
	
	
	@Test(priority=4)
	public void validatefeaturemenuAvailable() {
		
		 boolean x = mp.getFeaturesMenu().isDisplayed();
		Assert.assertTrue(x);	
		
		Reporter.log("Validating if the feature menu is available");
		
	}
	
	@Test(priority=5, enabled=true)
	public void validateprivacymenuAvailable() {
		
		boolean y = mp.getPrivacyMenu().isDisplayed();
		Assert.assertTrue(y);
			
		
	}
	
	@Test(priority=6)
	public void validateRoomsmenuAvailable() {
	
		 boolean z = mp.getroomsmenua().isDisplayed();
		 Assert.assertTrue(z);
			
		
	}
	
	
	
	
	
	
	

}
