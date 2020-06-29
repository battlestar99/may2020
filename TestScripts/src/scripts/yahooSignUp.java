package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class yahooSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver1 = new InternetExplorerDriver();
		
		driver.get("https://login.yahoo.com/account/create");
		
		
		
		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]")));
		
		month.selectByVisibleText("March");
		
		
		
		//driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.id("usernamereg-day"));
		firstName.sendKeys("13");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("usernamereg-freeformGender"));
		gender.sendKeys("dfdaljfdl");
		
		WebElement signInLink= driver.findElement(By.linkText("Sign in"));
		
		Thread.sleep(2000);

	}

}
