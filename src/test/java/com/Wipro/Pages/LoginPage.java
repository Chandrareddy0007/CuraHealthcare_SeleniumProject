package com.Wipro.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class LoginPage {

	WebDriver webdriver;
	
	public LoginPage(WebDriver webdriver)
	{
		PageFactory.initElements( webdriver,this);
		
	}
	@FindBy(xpath = "//*[@id=\"appointment\"]/div/div/div/h2")
    WebElement makeAppointmenttext;  
	@FindBy(css="#btn-make-appointment")
	 WebElement appointmentBtn;
	
	@FindBy(id = "txt-username")
	 WebElement username;
	
	@FindBy(id="txt-password")
	 WebElement userPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	 WebElement loginBtn;
	@FindBy(css=".text-danger")
	 WebElement errorMessage;
	@FindBy(xpath = "//*[@id=\"login\"]/div/div/div[1]/p[2]")
	WebElement ErrorText;

	public void SetUserName(String name) {
		username.sendKeys(name);
	}
	
	public void SetPassword(String pass) {
		userPassword.sendKeys(pass);
		
	}
	public void CickOnLoginBtn() {
		loginBtn.click();
	}
	public void ClickOnBookAppointment() {
		appointmentBtn.click();
	}
	
	
	public boolean InvalidDetails() {
		return webdriver.getCurrentUrl().equals("https://katalon-demo-cura.herokuapp.com/profile.php#login");
	}
	
	public boolean loginFailedMessage() {
		return ErrorText.getText().equals("Login failed! Please ensure the username and password are valid.");
	}
	public boolean validateLoginDetails() {
		return makeAppointmenttext.getText().equals("Make Appointment");
	}
	public void ScrollToBottomPage() {
		JavascriptExecutor js=( JavascriptExecutor)webdriver; 
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}

	
	public  void ScrollToTop() {
		JavascriptExecutor jsDriver = (JavascriptExecutor)webdriver;
		jsDriver.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	}
	public  void scrollToViewAppointment() {
		JavascriptExecutor jsDriver = (JavascriptExecutor)webdriver;
	WebElement	element=appointmentBtn;
		jsDriver.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public boolean ValidateLoginCredentials() {
		if (ErrorText.getText()=="Login failed! Please ensure the username and password are valid.") {
			System.out.println("Login Credentials are Incorrect");
			}
		else if(makeAppointmenttext.getText()=="Make Appointment") {
			System.out.println("login credentials are correct");
		}
		return false ;  
	}
	}



	

