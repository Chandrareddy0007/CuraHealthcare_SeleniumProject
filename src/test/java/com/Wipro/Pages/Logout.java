package com.Wipro.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Logout {
	WebDriver webdriver;
	public Logout(WebDriver webdriver)
	{
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	@FindBy(css="#btn-make-appointment")
	 WebElement appointmentBtn;
	@FindBy(id = "txt-username")
	 WebElement username;
	
	@FindBy(id="txt-password")
	 WebElement userPassword;
	@FindBy(xpath="//button[@type='submit']")
	 WebElement loginBtn;
	
	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a")
	WebElement logoutBtn;
	@FindBy(xpath = "//*[@id='menu-toggle']")
    WebElement MenuToggle;
	public void ClickOnBookAppointment() {
		appointmentBtn.click();
	}
	public void SetUserName(String name) {
		username.sendKeys(name);
	}
	
	public void SetPassword(String pass) {
		userPassword.sendKeys(pass);
		
	}
	public void CickOnLoginBtn() {
		loginBtn.click();
	}
	
	public void clickLogOut()
	{
		logoutBtn.click();
	}
	public void clickMenuToggle() {
		MenuToggle.click();
	}
	public void loginPage() {
		LoginPage login =new LoginPage(webdriver);
		login.ClickOnBookAppointment();
		login.SetUserName("John Doe");
		login.SetPassword("ThisIsNotAPassword");
		login.CickOnLoginBtn();}
}
