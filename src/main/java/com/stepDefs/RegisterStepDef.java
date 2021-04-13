package com.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;
import com.pages.RegisterPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RegisterStepDef {
	WebDriver driver;
	LoginPage lp=null;
	RegisterPage rp =null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver89.exe");
		driver= new ChromeDriver();
	}
	@After
	public void tearDown() {
		driver.close();
	}
	@Given("^user should be on login page for register$")
	public void user_should_be_on_login_page_for_register() throws Throwable {
		 
		 driver.get("file:///F:/Offline%20Website/Offline%20Website/index.html");
		 lp= new LoginPage(driver);		 
	}
	@When("^user clicks on register link$")
	public void user_clicks_on_register_link() throws Throwable {
	    rp= lp.clickLink(); 
	}

	@When("^user fills all details$")
	public void user_fills_all_details() throws Throwable {
	     rp.enterName("mangesh");
	     rp.entermobile("7894561230");
	     rp.enterEmail("mangesh@gmail.com");
	     rp.enterPass("123456"); 
	}

	@When("^click submit button$")
	public void click_submit_button() throws Throwable {   
		rp.clickBtn();
	}

	@Then("^user should see alert$")
	public void user_should_see_alert() throws Throwable {
		Alert al = driver.switchTo().alert();
		String msg=al.getText();
		al.accept();
		Assert.assertEquals("User registered successfully.", msg);   
	}
}
