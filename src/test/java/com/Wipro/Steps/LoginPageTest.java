/*Name:Agile Bhuvana Chandra Reddy
 * Description:Loginpage using postive and negitive test cases.
 * */

package com.Wipro.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;


import com.Wipro.Listeners.ListenersTestNG_Booking;
import com.Wipro.Pages.LoginPage;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Listeners(com.Wipro.Listeners.ListenersTestNG_Booking.class)
public class LoginPageTest {
	LoginPage login;
WebDriver webdriver=Hooks.getWebDriver();
	@Given("user is on login page")
	public void user_is_on_login_page() {
		webdriver.get("https://katalon-demo-cura.herokuapp.com/");
		
	}

	@When("user Clicks on make Appointment")
	public void user_clicks_on_make_appointment() {
	   LoginPage login=new LoginPage(webdriver);
	   login.ClickOnBookAppointment();
	}

	@When("user enters details {string} {string}")
	public void user_enters_details(String string, String string2) {
		LoginPage login=new LoginPage(webdriver);
	   login.SetUserName(string);
	   login.SetPassword(string2);
	   
	}
	

	@Then("click on submit button")
	public void click_on_submit_button() {
		LoginPage login=new LoginPage(webdriver);
		login.CickOnLoginBtn();
	   
	}

	
	

	
	

	@When("User enter Detailss {string}{string}")
	public void user_enter_detailss(String string, String string2) {
	   LoginPage login=new LoginPage(webdriver);
	   login.SetUserName(string);
	   login.SetPassword(string2);
	   
	}
	

	@Then("click On Submit buttonn")
	public void click_on_submit_buttonn() {
		 LoginPage login=new LoginPage(webdriver);
		   login.CickOnLoginBtn();
	   
	}

	@When("User clicks on Make Appointment")
	public void user_clicks_on_make_appointment1() {
	  LoginPage login=new LoginPage(webdriver);
	  login.ClickOnBookAppointment();
	}

	@When("user enter name and password")
	public void user_enter_name_and_password() {
		LoginPage login=new LoginPage(webdriver);
		login.SetUserName("John Doe");
		login.SetPassword("ThisIsNotAPassword");
	
	   
	}

	@Then("click on submit buttonnn")
	public void click_on_submit_buttonnn() throws Exception {
		LoginPage login=new LoginPage(webdriver);
		Thread.sleep(3000);
	   login.CickOnLoginBtn();

	  
	   
	   
	}


}
