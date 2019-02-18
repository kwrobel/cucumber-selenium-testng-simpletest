/**
 * 
 */
package com.example.cucumber.selenium.testng.simpletest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * @author Kay Wrobel
 *
 */
@CucumberOptions(
		plugin = {"pretty"},
		features = {"classpath:features"}, 
		glue= {"com.example.cucumber.selenium.testng.simpletest.stepdefinitions"}
)
public class CucumberTest extends AbstractTestNGCucumberTests {
}
