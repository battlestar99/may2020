package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yahooSignupVersion2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		pageYahooSignUp ps = new pageYahooSignUp(driver);
		
		
		driver.get("https://login.yahoo.com/account/create");
		
		
		
		Select month = new Select(ps.getMonth());
		
		month.selectByVisibleText("March");
		
		
		
		//driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		WebElement firstName = ps.getfirstName();
		firstName.sendKeys("13");
		Thread.sleep(2000);
		WebElement gender = ps.getGender();
		gender.sendKeys("dfdaljfdl");
		
		WebElement signInLink= ps.getSignInlink();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
