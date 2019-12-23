package skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoWorkShop {
	@Given("john launched chrome browser")
	public void john_launched_chrome_browser() {

	}

	@Given("provided demowebshop site url")
	public void provided_demowebshop_site_url() {

	}

	@When("he clicks on login")
	public void he_clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("he shall be able to provide credentials id={string} password={string}")
	public void he_shall_be_able_to_provide_credentials_id_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("he clicks on register link")
	public void he_clicks_on_register_link() {

	}

	@Then("he shall be able to provide registration details")
	public void he_shall_be_able_to_provide_registration_details() {

	}

	@When("he clicks on wishlist")
	public void he_clicks_on_wishlist() {

	}

	@Then("he shall be able to view his wishlist")
	public void he_shall_be_able_to_view_his_wishlist() {

	}

}
