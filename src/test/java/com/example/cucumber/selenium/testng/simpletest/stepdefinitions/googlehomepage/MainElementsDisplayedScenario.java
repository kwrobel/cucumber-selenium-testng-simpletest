package com.example.cucumber.selenium.testng.simpletest.stepdefinitions.googlehomepage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.cucumber.selenium.testng.simpletest.pages.ElementNotDisplayedException;
import com.example.cucumber.selenium.testng.simpletest.pages.GoogleHomepage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainElementsDisplayedScenario {

	private static final Logger logger = LogManager.getLogger(MainElementsDisplayedScenario.class.getSimpleName());	
	private final GoogleHomepage page = new GoogleHomepage();
	
	@Given("I launch Chrome browser")
	public void i_launch_Chrome_browser() {
		page.launchBrowser();
	}

	@When("I open Google Homepage")
	public void i_open_Google_Homepage() {
		page.openGoogleURL();
	}

	@Then("I verify that the page displays search text box")
	public void i_verify_that_the_page_displays_search_text_box() throws ElementNotDisplayedException {
		if (page.isQueryFieldDisplayed()) {
			logger.info("Search field is being displayed");
		} else {
			logger.error("Search field is NOT being displayed");
			throw new ElementNotDisplayedException();
		}
	}

	@And("the page displays Google Search button")
	public void the_page_displays_Google_Search_button() throws ElementNotDisplayedException {
		if (page.isSearchButtonDisplayed()) {
			logger.info("Search button is being displayed");
		} else {
			logger.error("Search button is NOT being displayed");
			throw new ElementNotDisplayedException();
		}
	}

	@And("the page displays Im Feeling Lucky button")
	public void the_page_displays_Im_Feeling_Lucky_button() throws ElementNotDisplayedException {
		if (page.isImFeelingLuckyButtonDisplayed()) {
			logger.info("I'm Feeling Lucky button is being displayed");
		} else {
			logger.error("I'm Feeling Lucky button is NOT being displayed");
			throw new ElementNotDisplayedException();
		}
	}
}
