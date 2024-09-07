package com.Wipro.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	WebDriver webdriver;
	public ProfilePage(WebDriver webdriver)
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
	
	  @FindBy(xpath = "//*[@id='menu-toggle']")
	    WebElement MenuToggle;
	  @FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[4]/a")
	  WebElement ProfilePageBtn;
	  @FindBy(xpath = "//*[@id=\"profile\"]/div/div/div/h2")
	  WebElement ProfileText;
	  @FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a")
		WebElement logoutBtn;
	
	public void loginPage() {
		LoginPage login =new LoginPage(webdriver);
		login.ClickOnBookAppointment();
		login.SetUserName("John Doe");
		login.SetPassword("ThisIsNotAPassword");
		login.CickOnLoginBtn();}
	public void ClickOnMenuToggle() {
		MenuToggle.click();
	}
	public void ClickOnProfileBTn() {
		ProfilePageBtn.click();
	}
	public boolean ProfileValidator() {
		return ProfileText.getText().equals("Profile");
	}
	public void clickLogOut()
	{
		logoutBtn.click();
	}
}


