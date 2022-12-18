package comoragnehrmstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class verify_CEO_name_step_def {

	@Given("the user can loged successfully")
	public void the_user_can_loged_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("the user can loged successfully");
	}

	@When("the user clicks on directory  optiopn on home page")
	public void the_user_clicks_on_directory_optiopn_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the user clicks on directory  optiopn on home page");
	}

	

	@Then("the user see the CEO of the companys")
	public void the_user_see_the_ceo_of_the_companys() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("\"the user see the CEO of the companys\"");
	}
}
