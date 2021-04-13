package com.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;
import com.pages.RegisterPage;
import com.pages.UserPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStepDef {

	WebDriver driver;
	LoginPage lp = null;
	RegisterPage rp = null;
	UserPage up;

	@Before
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver89.exe");
		driver = new ChromeDriver();
	
	}
	@After
	public void teardown() {
		driver.close();
	}

	@Given("^user should be on user page$")
	public void user_should_be_on_user_page() throws Throwable {
		 
		 driver.get("file:///F:/Offline%20Website/Offline%20Website/index.html");
		 lp= new LoginPage(driver);		
	}

	@When("^user clicks on user linkText$")
	public void user_clicks_on_user_linkText() throws Throwable {
	up.clickUsers();
	}

	@When("^user clickson AddUser button$")
	public void user_clickson_AddUser_button() throws Throwable {
	   up.clickAddUsers();
	   
	}

	@When("^users fills all details$")
	public void users_fills_all_details() throws Throwable {
	    up.enterUname("paritosh");
	    up.enterMoblie("7020350492");
	    up.enterEmail("paritosh2b@gmail.com");
	    up.enetrCourses("java");
	    up.enterGender("male");
	    up.enterState("maharashtra");
	    up.enterPassword("123456");
	}

	@Then("^user should see success massage$")
	public void user_should_see_success_massage() throws Throwable {
		Alert al = driver.switchTo().alert();
		String msg=al.getText();
		al.accept();
		Assert.assertEquals("User Added Successfully. You can not see added user.", msg);   
	}}