package com.Wipro.Steps;

import org.openqa.selenium.WebDriver;

import com.Wipro.Pages.HistoryPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePage_Tester {
	
	WebDriver webdriver=Hooks.getWebDriver();

@When("I am on the HomePage")
public void i_am_on_the_home_page() {
	 webdriver.get("https://katalon-demo-cura.herokuapp.com/");
}

@When("I click on the menu toggle")
public void i_click_on_the_menu_toggle() {
   HistoryPage history=new HistoryPage(webdriver);
   history.loginPage();
   history.clickMenuToggle();
   
}

@When("I click on Profile option")
public void i_click_on_profile_option() {
    HistoryPage history=new HistoryPage(webdriver);
    history.ClickOnProfile();
}

@Then("Profile page should be Displayed")
public void profile_page_should_be_displayed() {
    System.out.println("profile details displayed");
}



}
