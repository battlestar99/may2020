package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pages.homePage;

public class dropdownTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		homePage hp=new homePage(driver);
		
		driver.manage().deleteAllCookies();
		
		//maximizing window
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(2000);
		
		
		WebElement x = hp.getmonth();
		Select monthdd = new Select(x);
		Thread.sleep(2000);
		monthdd.selectByVisibleText("Mar");
		
		Select birthdd = new Select(hp.getday());
		Thread.sleep(2000);
		birthdd.selectByVisibleText("12");
		
		
		Select yeardd = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		Thread.sleep(2000);
		yeardd.selectByIndex(10);
		
		

	}

}
