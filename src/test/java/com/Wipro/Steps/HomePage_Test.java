package com.Wipro.Steps;

import org.openqa.selenium.WebDriver;

import com.Wipro.Pages.HistoryPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_Test {
WebDriver webdriver=Hooks.getWebDriver();
	@When("I am on the login page")
	public void i_am_on_the_login_page() {
		webdriver.get("https://katalon-demo-cura.herokuapp.com/");
	    HistoryPage history=new HistoryPage(webdriver);
	    history.loginPage();
	}

	@When("i click on history then i navigate to home")
	public void i_click_on_history_then_i_navigate_to_home() {
	    HistoryPage history=new HistoryPage(webdriver);
	    history.clickMenuToggle();
	    history.clickOnHistory();
	    history.clickMenuToggle();
	    history.clickonProfileMenu();
	}

	@Then("Home page will be displayed")
	public void home_page_will_be_displayed() {
	   System.out.println("Displayed succesfully");
	}



}
