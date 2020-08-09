package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testRunLink {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		// will start chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				// deleting cookies 
				driver.manage().deleteAllCookies();
				
				//maximizing window
				
				driver.manage().window().maximize();
				
			//	driver.get("https://www.facebook.com/signup");
				
				driver.navigate().to("https://www.facebook.com/signup");
				
				Thread.sleep(2000);
				
				WebElement facebooklite = driver.findElement(By.linkText("Facebook Lite"));
				
				String x = facebooklite.getText();
				facebooklite.click();
				
				
				
				
				Thread.sleep(2000);
				
				
				
				WebElement locallink = driver.findElement(By.linkText("Local"));
				locallink.click();
				Thread.sleep(2000);
				
				
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				Thread.sleep(2000);
				
				driver.quit();
		

	}

}
