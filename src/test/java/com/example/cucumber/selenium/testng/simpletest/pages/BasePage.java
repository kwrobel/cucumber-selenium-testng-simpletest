package com.example.cucumber.selenium.testng.simpletest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver", "/opt/local/bin/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/opt/local/bin/geckodriver");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 2);
	}
	
}
