/*Name:Agile Bhuvana Chandra Reddy
 * Description:Checking the history of the bookings done by the users and after that logout by using cucumber.
 * */

package com.Wipro.Steps;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.Wipro.Listeners.ListenersTestNG_Booking;
import com.Wipro.Pages.BookingPage;
import com.Wipro.Pages.HistoryPage;
import com.Wipro.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Listeners(ListenersTestNG_Booking.class)
public class History_Test {

	WebDriverWait wait;
	WebDriver webdriver=Hooks.getWebDriver();
@Given("I am on the home page")
public void i_am_on_the_home_page() {

	webdriver.get("https://katalon-demo-cura.herokuapp.com/");
}

@When("I click on Make Appointment")
public void i_click_on_make_appointment() {
	 LoginPage login=new LoginPage(webdriver);
	   login.ClickOnBookAppointment();
}

@When("I log in with username John Doe and password ThisIsNotAPassword")
public void i_log_in_with_username_john_doe_and_password_this_is_not_a_password() {
  BookingPage booking=new BookingPage(webdriver);
  booking.loginPage();
  
 
}

@When("I make an appointment with different facility  and program")
public void i_make_an_appointment_with_different_facility_and_program() throws Exception {
	webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	BookingPage booking=new BookingPage(webdriver);
	
	booking.SelectHonkongFacility();
	
	booking.readmission();
	booking.radioButtonCheckMedicaid();
	booking.selectAppointmentDay("15/08/2025");
	booking.writeComment("this is my Firstbooking");
	booking.ClicksubmitBtn();
	Thread.sleep(5000);
	Assert.assertTrue(booking.verifyFacilityName().equals("Hongkong CURA Healthcare Center"));
	booking.clickOnHomepageBtn();
	
	HistoryPage history=new HistoryPage(webdriver);
			booking.SelecttokyoFacility();
			booking.readmission();
			booking.radioButtonCheckMedicare();
			booking.selectAppointmentDay("15/09/2025");
			booking.writeComment("This is My Second Booking");
			history.ScrolltoElement();
			booking.ClicksubmitBtn();
			Assert.assertTrue(booking.verifyFacilityName().equals("Tokyo CURA Healthcare Center"));
			booking.clickOnHomepageBtn();
			Thread.sleep(3000);
			booking.SelectSeoulFacility();
			booking.radioButtonnone();
			booking.selectAppointmentDay("13/08/2024");
			booking.writeComment("This is Third Booking");
			history.ScrolltoElement();
			booking.ClicksubmitBtn();
			Assert.assertTrue(booking.verifyFacilityName().equals("Seoul CURA Healthcare Center"));
			
	
	
}

@When("I view appointment history")
public void i_view_appointment_history() {
	HistoryPage history=new HistoryPage(webdriver);
	BookingPage booking=new BookingPage(webdriver);
	booking.clickMenuToggle();

   booking.clickOnHistory();
   Assert.assertTrue(history.History());
}

@Then("I should see the appointment details in history")
public void i_should_see_the_appointment_details_in_history() {
	System.out.println("i see details");
}

@Then("I log out")
public void i_log_out() {
   BookingPage booking =new BookingPage(webdriver);
   booking.clickMenuToggle();
   webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   booking.clickonLogout();
  
}

}

