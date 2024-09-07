package com.Wipro.Pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class HistoryPage {
	WebDriver webdriver;

	public HistoryPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(xpath = "//h2[text()='Make Appointment']")
	WebElement bookingPageText;

	@FindBy(xpath = "//form/div/div/select")
	WebElement facilitydropDown;

	@FindBy(css = "option[value ='Tokyo CURA Healthcare Center']")
	WebElement tokyoFacility;

	@FindBy(css = "option[value = 'Hongkong CURA Healthcare Center']")
	WebElement hongkongFacility;

	@FindBy(css = "option[value = 'Seoul CURA Healthcare Center']")
	WebElement seoulFacility;

	@FindBy(id = "chk_hospotal_readmission")
	WebElement checkReadmission;

	@FindBy(id = "facility")
	WebElement facility;
    @FindBy(xpath = "//*[@id='menu-toggle']")
    WebElement MenuToggle;
    @FindBy(xpath = "//*[@id=\"history\"]/div/div[1]/div/h2")
    WebElement HistoryText;

	@FindBy(id = "radio_program_medicare")
	WebElement medicareProgramBtn;
	
	@FindBy(id = "radio_program_medicaid")
	WebElement medicaidProgramBtn;

	@FindBy(id = "radio_program_none")
	WebElement noneProgram;

	@FindBy(xpath = "//*[@id=\"summary\"]/div/div/div[7]/p/a")
	WebElement backToHomePageBtn;
     @FindBy(xpath = "btn-make-appointment")
     WebElement makeAppointmentBtn;
    
	@FindBy(id = "txt_visit_date")
	WebElement datePicker;

	@FindBy(css = "div[class='datepicker-days'] th[class='datepicker-switch']")
	WebElement selectYear;

	@FindBy(id = "txt_comment")
	WebElement addComment;
	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")
	WebElement HistoryMenu;
	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a")
	WebElement LogoutBtn;
	@FindBy(id = "btn-book-appointment")
	WebElement submitBtn;
	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[4]/a")
	WebElement ProfileBtn;
	@FindBy(xpath="//*[@id=\"sidebar-wrapper\"]/ul/li[2]/a")
	WebElement HomePageMenuToggle;
	

	public void selectAppointmentDay(String visitDate) {
		datePicker.sendKeys(visitDate);
	}

	public void writeComment(String comment) {
		addComment.sendKeys(comment);
	}


	public void  SelectHonkongFacility() {
		facilitydropDown.click();
		Select select =new Select(facilitydropDown);
		select.selectByIndex(1);


	}
	public void  SelecttokyoFacility() {
		facilitydropDown.click();
		Select select =new Select(facilitydropDown);
		select.selectByIndex(0);
	}
	public void  SelectSeoulFacility() {
		facilitydropDown.click();
		Select select =new Select(facilitydropDown);
		select.selectByIndex(2);


	}
	public void radioButtonCheckMedicare() {
		medicareProgramBtn.click();

	}
	public void radioButtonCheckMedicaid() {
		medicaidProgramBtn.click();

	}
	public void radioButtonnone() {
		noneProgram.click();

	}
	public void makeAppointmentBtn() {
		makeAppointmentBtn.click();
	}
	public void loginPage() {
		LoginPage login =new LoginPage(webdriver);
		login.ClickOnBookAppointment();
		login.SetUserName("John Doe");
		login.SetPassword("ThisIsNotAPassword");
		login.CickOnLoginBtn();}
	public void ClicksubmitBtn() {
		submitBtn.click();
	}

	public void clickOnHomepageBtn() {
		backToHomePageBtn.click();
	}
	public String verifyFacilityName() {

		String facilityText =facility.getText();
		return facilityText;

	}

	public void readmission() {
		checkReadmission.click();
	}
	public void clickMenuToggle() {
		MenuToggle.click();
	}

	public void clickOnHistory() {
		HistoryMenu.click();
	}
	public void clickonLogout() {
		LogoutBtn.click();
	}
	public boolean History() {
		return HistoryText.getText().equals("History");
	}
	public void ScrolltoElement() {
		Actions action=new Actions(webdriver);
		action.scrollToElement(submitBtn);
	}
	public void ClickOnProfile() {
		ProfileBtn.click();
	}
	public void clickonProfileMenu() {
	 HomePageMenuToggle.click();
	}
}




	
	



