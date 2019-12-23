package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoWorkshopLogin {
	 WebDriver Driver ;
		
	@Given("User is on DemoWorkShop Login page")
	public void user_is_on_DemoWorkShop_Login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  //  throw new cucumber.api.PendingException();
		
		  System.setProperty("webdriver.chrome.driver","C:\\Rohit\\chromedriver_win32\\chromedriver.exe");
		  Driver = new ChromeDriver();
		  Driver.get("http://demowebshop.tricentis.com/tricentis");

	}

	@When("I provide {string} and {string}")
	public void i_provide_and(String login, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		  
		  Driver.findElement(By.linkText("Log in")).click();
		  Driver.findElement(By.id("Email")).sendKeys(login);
		  Driver.findElement(By.id("Password")).sendKeys(password);
		  Driver.findElement(By.cssSelector("input[value='Log in']")).click();
		  Thread.sleep(1000);
	}

	@Then("the login username is properly displayed")
	public void the_login_username_is_properly_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		  System.out.println("Login Successfull");
		  Driver.findElement(By.linkText("Log out")).click();
	}


}
