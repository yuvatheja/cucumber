package com.cucumber.mavencucumberprototype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps {
	WebDriver driver;
	@Before
	public void driverSetup(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\yuvas\\Downloads\\selenium jars and exe files\\geckodriver.exe");
		driver = new FirefoxDriver();
	//	System.out.println("before test exec");
	}
	
	@After
	public void driverShutdown(){
	//	System.out.println("after test exec");
		driver.quit();
	}
	
	@Given ("^I am on njit webpage$")
	public void opennjitsite(){
		driver.get("http://www.njit.edu/");
	}
	
	@When ("^I navigate to About$")
	public void clickonabout(){
		driver.findElement(By.xpath(".//li[@id='nav-about']/a")).click();
	}
	
	@Then ("^Check for page title About$")
	public void verifyPageTitleAbout(){
	//	Assert.assertTrue("not on About Page", driver.getTitle().equals("About NJIT|About"));
		assert(driver.getTitle().equals("New Jersey Institute of Technology"));
	//	System.out.println(driver.getTitle());
	}
	
	@When("^I navigate to Admissions$")
	public void clickonAdmissions() throws Throwable {
		driver.findElement(By.xpath(".//li[@id='nav-admissions']/a")).click();
	    
	}

	@Then("^Check for page title Admissions$")
	public void verifyPageTitleAdmissions() throws Throwable {
		assert(driver.getTitle().equals("New Jersey Institute of Technology"));
	   
	}

	@When("^I navigate to Academics$")
	public void clickonAcademics() throws Throwable {
		driver.findElement(By.xpath(".//li[@id='nav-academics']/a")).click();
	}

	@Then("^Check for page title Academics$")
	public void verifyPageTitleAcademics() throws Throwable {
		assert(driver.getTitle().equals("New Jersey Institute of Technology"));
	}
	
	
	
	
}
