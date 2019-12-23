package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoWorkShop_Login {
	 WebDriver Driver ;
	
	@Given("User is on TDemoWorkShop Login page")
	public void user_is_on_TDemoWorkShop_Login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		  System.setProperty("webdriver.chrome.driver","C:\\Rohit\\chromedriver_win32\\chromedriver.exe");
		  Driver = new ChromeDriver();
		  Driver.get("http://demowebshop.tricentis.com/tricentis");
		
	}

	@When("the user provides {string} and {string}")
	public void the_user_provides_and(String string, String string2) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		  Driver.findElement(By.linkText("Log in")).click();
		  Driver.findElement(By.id("Email")).sendKeys();
		  Driver.findElement(By.id("Password")).sendKeys();
		  Driver.findElement(By.cssSelector("input[value='Log in']")).click();
		  Thread.sleep(1000);

		  

	}

	@Then("the relevant login username is displayed")
	public void the_relevant_login_username_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		  System.out.println("Login Successfull");
		  Driver.findElement(By.linkText("Log out")).click();
	}

}
