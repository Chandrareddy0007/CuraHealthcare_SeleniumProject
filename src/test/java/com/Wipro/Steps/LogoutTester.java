/*Name:Agile Bhuvana Chandra Reddy
 * Description:Login and do a booking and logout from the site
 * */

package com.Wipro.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Wipro.Pages.BookingPage;
import com.Wipro.Pages.Logout;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutTester {
	WebDriver webdriver=Hooks.getWebDriver();
	@Given("I am on login page")
	public void i_am_on_login_page() {
	  webdriver.get("https://katalon-demo-cura.herokuapp.com/");
	}

	@When("i click on Bookappointment")
	public void i_click_on_bookappointment() {
	  Logout logout=new Logout(webdriver);
	  logout.ClickOnBookAppointment();
	 
	}

	@Then("i click login after adding valid credentials")
	public void i_click_login_after_adding_valid_credentials() {
		  Logout logout=new Logout(webdriver);
		  logout.loginPage();
	}

	@Then("I  book three different slots with different data")
	public void i_book_three_different_slots_with_different_data() throws Exception {
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
	}

	@Then("i click on menutoggle and history to see History of bookings")
	public void i_click_on_menutoggle_and_history_to_see_history_of_bookings() {
	   Logout logout=new Logout(webdriver);
	   BookingPage booking=new BookingPage(webdriver);
	   logout.clickMenuToggle();
	   booking.clickOnHistory();
	}

	@Then("i click on logout after validating history")
	public void i_click_on_logout_after_validating_history() {
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   Logout logout=new Logout(webdriver);
	   logout.clickMenuToggle();
	   logout.clickLogOut();
	}



}
