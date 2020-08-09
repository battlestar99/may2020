package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		//maximizing window
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(2000);
		
		// entering first name
		
		WebElement firstName = driver.findElement(By.id("u_0_n"));
		firstName.sendKeys("Michael");
		
		Thread.sleep(2000);
		
		WebElement facebooklite = driver.findElement(By.linkText("Facebook Lite"));
		
		String x = facebooklite.getText();
		
		facebooklite.click();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_n")).clear();
		
		driver.findElement(By.id("u_0_n")).sendKeys("jordan");

	}

}
