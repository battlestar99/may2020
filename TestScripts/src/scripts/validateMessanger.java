package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.homePage;
import pages.messangerPage;

public class validateMessanger {

	public static void main(String[] args) throws InterruptedException {
		
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		homePage hp = new homePage(driver);
		messangerPage mp = new messangerPage(driver);
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		// java core library
		//Thread.sleep(10000);
		
		// selenium library 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		
		WebElement x = wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.xpath("//*[@id=\"u_0_z\"]/select"))));
	
		
		
		hp.getMessangerLink().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
		boolean roomoption = mp.getroomsmenua().isDisplayed();
		
		boolean featureoption = mp.getFeaturesMenu().isDisplayed();
		
		
		System.out.println(roomoption);
		
		System.out.println(featureoption);
		

	}

}
