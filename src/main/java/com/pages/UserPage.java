package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserPage {

	WebDriver driver;
	      
	
	
	@FindBy(id = "uname")
	private WebElement uname;

	@FindBy(id = "mobile")
	private WebElement mobile;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "courses")
	private WebElement courses;

	@FindBy(id = "gender")
	private WebElement gender;

	@FindBy(id = "state")
	private WebElement state;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath="//button")
	private WebElement button;
	
	@FindBy(xpath = "//span[text()='Users']")
	public WebElement ulink;

	
	@FindBy(xpath = "//button[text()='Add User']")
	public WebElement adduser;
	
	
	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	public void clickUsers() {
		ulink.click();
		
	}
	
	public void clickAddUsers() {
		adduser.click();
		
	}
	public void enterUname(String text){
		uname.sendKeys(text);
	}
	
	public void enterMoblie(String text){
		mobile.sendKeys(text);
	}
	
	public void enterEmail(String text){
		email.sendKeys(text);
	}
	
	
	public void enetrCourses(String text){
		courses.sendKeys(text);
	}
	
	public void enterGender(String text){
		
		Select sl = new Select(gender);
		sl.selectByVisibleText(text);
		gender.click();
	
	}
	
	public void enterState(String text){
		state.sendKeys(text);
	}
	
	public void enterPassword(String text){
		password.sendKeys(text);
	}
	public void clickButton(){
		button.click();
	}
	
	
	
	
	

}
