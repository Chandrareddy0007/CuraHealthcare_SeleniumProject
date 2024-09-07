/*Name:Agile Bhuvana Chandra Reddy
 * Description:Booking appointmnets for the visit of patients for differents features(3 bookings) using cucumber and i had used tags also to differentiate.
 * */
package com.Wipro.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Wipro.Pages.BookingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;

public class AppointmentBookingTester {
	WebDriver webdriver=Hooks.getWebDriver();
	@Given("User click on Book appointment")
	public void user_click_on_book_appointment() {
		BookingPage booking=new BookingPage(webdriver);
		booking.bookAppointmentBtn();
	}

	@Given("User login with valid credentials")
	public void user_login_with_valid_credentials() {
		BookingPage booking=new BookingPage(webdriver);
		booking.loginPage();
	   
	}

	@When("user enter all data for booking")
	public void user_enter_all_data_for_booking() throws InterruptedException {
		
		BookingPage booking=new BookingPage(webdriver);
		
		booking.SelectHonkongFacility();
		booking.readmission();
		booking.radioButtonCheckMedicaid();
		booking.selectAppointmentDay("15/08/2025");
		booking.writeComment("this is my Firstbooking");
		booking.ClicksubmitBtn();
		Thread.sleep(5000);
		
	}

	@Then("user should seee appointment confirmeation")
	public void user_should_seee_appointment_confirmeation() {
		BookingPage booking=new BookingPage(webdriver);
		Assert.assertTrue(booking.verifyFacilityName().equals("Hongkong CURA Healthcare Center"));
		booking.clickOnHomepageBtn();
	}

	@When("user enter all data for bookings")
	public void user_enter_all_data_for_bookings() {
		BookingPage booking =new BookingPage(webdriver);
		
		booking.SelecttokyoFacility();
		booking.readmission();
		booking.radioButtonCheckMedicare();
		booking.selectAppointmentDay("15/09/2025");
		booking.writeComment("This is My Second Booking");
		booking.ClicksubmitBtn();
		
	}

	@Then("user should seee appointment confirmation")
	public void user_should_seee_appointment_confirmation() {
		BookingPage booking =new BookingPage(webdriver);
		Assert.assertTrue(booking.verifyFacilityName().equals("Tokyo CURA Healthcare Center"));
		booking.clickOnHomepageBtn();
	}

	@When("user enter all the data for booking")
	public void user_enter_all_the_data_for_booking() {
		 BookingPage booking=new BookingPage(webdriver);
		 booking.SelectSeoulFacility();
		 booking.radioButtonnone();
		 booking.selectAppointmentDay("13/08/2024");
		 booking.writeComment("This is Third Booking");
		
	}

	@Then("user should see appointment confirmation")
	public void user_should_see_appointment_confirmation() {
		 BookingPage booking=new BookingPage(webdriver);
		booking.ClicksubmitBtn();
		Assert.assertTrue(booking.verifyFacilityName().equals("Seoul CURA Healthcare Center"));
	}



}
