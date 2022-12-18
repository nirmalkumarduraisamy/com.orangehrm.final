package comoragnehrmstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class pendingtimesheet {


	@Given("the user can on home page")
	public void the_user_can_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("the user can on home page");
	}

	@Given("the user clicks on directory  optiopn ooption from menu")
	public void the_user_clicks_on_directory_optiopn_ooption_from_menu() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the user clicks on directory  optiopn ooption from menu");
	}

	

	@Given("click the search button")
	public void click_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click the search button");
	}

	@Then("the user see the CEO of the company {string}")
	public void the_user_see_the_ceo_of_the_company(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the user see the CEO of the company {string}");
	}
	@Given("the user is select the name is {string}")
	public void the_user_is_select_the_name_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the user is select the name is {string}");
	}

}
