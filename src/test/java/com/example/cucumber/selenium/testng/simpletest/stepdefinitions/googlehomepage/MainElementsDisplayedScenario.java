package com.example.cucumber.selenium.testng.simpletest.stepdefinitions.googlehomepage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainElementsDisplayedScenario {
	
	private static final Logger logger = LogManager.getLogger(MainElementsDisplayedScenario.class.getSimpleName());
	
	@Given("I launch Chrome browser")
	public void i_launch_Chrome_browser() {
		logger.info("Browser launched");
	}

	@When("I open Google Homepage")
	public void i_open_Google_Homepage() {
		logger.info("Google Homepage opened");
	}

	@Then("I verify that the page displays search text box")
	public void i_verify_that_the_page_displays_search_text_box() {
		logger.info("Found the search text box");
	}

	@And("the page displays Google Search button")
	public void the_page_displays_Google_Search_button() {
		logger.info("Found the Search button");
	}

	@And("the page displays Im Feeling Lucky button")
	public void the_page_displays_Im_Feeling_Lucky_button() {
		logger.info("Found the Lucky button");
	}
}
