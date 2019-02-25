package com.example.cucumber.selenium.testng.simpletest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleHomepage extends BasePage {
	
	private static final By SEARCH_FIELD_NAME = By.name("q");
	private static final By SEARCH_BUTTON_NAME = By.name("btnK");
	private static final By IM_FEELING_LUCKY_BUTTON_NAME = By.name("btnI");
	private static final String GOOGLE_URL = "https://www.google.com"; 
	
	public void openGoogleURL() {
		driver.get(GOOGLE_URL);
	}
	
	public boolean isQueryFieldDisplayed() {
		WebElement element = getWebElement(SEARCH_FIELD_NAME);
		return element.isDisplayed();
	}
	
	public boolean isSearchButtonDisplayed() {
		WebElement element = getWebElement(SEARCH_BUTTON_NAME);
		return element.isDisplayed();
	}
	
	public boolean isImFeelingLuckyButtonDisplayed() {
		WebElement element = getWebElement(IM_FEELING_LUCKY_BUTTON_NAME);
		return element.isDisplayed();
	}
			
	private WebElement getWebElement(By name) {
		wait.until(ExpectedConditions.presenceOfElementLocated(name));
		return driver.findElement(name);
	}
}
