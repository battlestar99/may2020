package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.yahooPage;


public class stepDefinition {
	
	WebDriver driver; 
	yahooPage yp; 
	
	
	@Given("^user is on the yahoo sign up page$")
	public void user_is_on_the_yahoo_sign_up_page() throws Throwable {
	   
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Java Development\\programming libraries\\chromedriver.exe");
	        
	       driver = new ChromeDriver();
	       yp = new yahooPage(driver);
	        
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://login.yahoo.com/account/create");	
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("^user can see the right title of the page$")
	public void user_can_see_the_right_title_of_the_page() throws Throwable {
		
		String actualTitle = driver.getTitle(); 
		String expectedTitle = "Yahoo";
		
	    Assert.assertEquals( expectedTitle,actualTitle);
		
		
		
	   
	}

	@When("^user can be in the right url$")
	public void user_can_be_in_the_right_url() throws Throwable {
		
		String actualUrl = driver.getCurrentUrl();
		
		String expectedUrl = "https://login.yahoo.com/account/create";
		
		Assert.assertEquals( expectedUrl,actualUrl);
	   
	}

	@Then("^user can start creating a new account$")
	public void user_can_start_creating_a_new_account() throws Throwable {
		
		System.out.println("user should be able to create an account");
	  
	}

	@When("^user should be see the firstname box visable and enabled$")
	public void user_should_be_see_the_firstname_box_visable_and_enabled() throws Throwable {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));
		
		Assert.assertTrue(x.isDisplayed());
		Assert.assertTrue(x.isEnabled());
		
		
		
	    
	}
	
	
	@Then("^user should be able to close the browser$")
	public void user_should_be_able_to_close_the_browser() throws Throwable {
	    driver.quit();
	}

	@When("^user should have the lastname box visible and enabled$")
	public void user_should_have_the_lastname_box_visible_and_enabled() throws Throwable {
	   
		Assert.assertTrue(yp.getlastName().isDisplayed());;
		Assert.assertTrue(yp.getlastName().isEnabled());;
		
		
	}

	@When("^user should have the password box visible and enabled$")
	public void user_should_have_the_password_box_visible_and_enabled() throws Throwable {
	   
	}

	@When("^user should have the drop down menu for phone number$")
	public void user_should_have_the_drop_down_menu_for_phone_number() throws Throwable {
	  
	}

	@Then("^user should have all the web elements require for sign up$")
	public void user_should_have_all_the_web_elements_require_for_sign_up() throws Throwable {
	   
	}
	
	@When("^user creates a password$")
	public void user_creates_a_password() throws Throwable {
		System.out.println("I am in when password");
	}
	
	@Then("^user should have a new account$")
	public void user_should_have_a_new_account() throws Throwable {
		System.out.println("I am in then accounts username");
	}
	
	
	@Given("^user is on the registration page$")
	public void go() throws Throwable {
		System.out.println("I am in given");
	}
	
	
	
	@When("^user enters the firstname$")
	public void user_enters_the_firstname() throws Throwable {
	   
		System.out.println("I am in when firstname");
	}

	@When("^user enters the lastname$")
	public void user_enters_the_lastname() throws Throwable {
		
		System.out.println("I am in when lastname");
	    
	}

	@When("^user selects a birthday$")
	public void user_selects_a_birthday() throws Throwable {
		System.out.println("I am in when birthday");
	}

	@When("^user creates an username$")
	public void user_creates_an_username() throws Throwable {
		System.out.println("I am in when username");
	}

	

	@When("^user clicks on the signup button$")
	public void user_clicks_on_the_signup_button() throws Throwable {
		System.out.println("user is clicking on the signup button");
	}
	
	@When("^user should be navigated to a new account$")
	public void user_should_be_navigated_to_a_new_account() throws Throwable {
	    System.out.println("user should be navigated to new account");
	}

	
	@When("^user clicks the login$")
	public void user_clicks_the_login() throws Throwable {
		
		 System.out.println("user clicks the login");
	  
	}

	@Then("^user should see the new dashboard$")
	public void user_should_see_the_new_dashboard() throws Throwable {
		 System.out.println("user should see the new dashboard");
	}
	
	

}
