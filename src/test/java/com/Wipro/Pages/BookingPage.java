package com.Wipro.Pages;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {

	WebDriver webdriver;

	public BookingPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(xpath = "//h2[text()='Make Appointment']")
	WebElement bookingPageText;

	public String getBookingPageText() {
		return bookingPageText.getText();
	}

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



	@FindBy(id = "radio_program_medicare")
	WebElement medicareProgramBtn;



	@FindBy(id = "radio_program_medicaid")
	WebElement medicaidProgramBtn;



	@FindBy(id = "radio_program_none")
	WebElement noneProgram;

	@FindBy(xpath = "//*[@id=\"summary\"]/div/div/div[7]/p/a")
	WebElement backToHomePageBtn;
@FindBy(xpath = "//*[@id='menu-toggle']")
WebElement MenuToggle;

	@FindBy(id = "txt_visit_date")
	WebElement datePicker;

	@FindBy(css = "div[class='datepicker-days'] th[class='datepicker-switch']")
	WebElement selectYear;

	@FindBy(id = "txt_comment")
	WebElement addComment;
	@FindBy(xpath = "//*[@id=\"btn-book-appointment\"]")
	WebElement SubmitBtn;
	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")
	WebElement HistoryMenu;
	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a")
	WebElement LogoutBtn;

	public void selectAppointmentDay(String visitDate) {
		datePicker.sendKeys(visitDate);
	}

	public void writeComment(String comment) {
		addComment.sendKeys(comment);
	}

	@FindBy(xpath = "//*[@id=\"btn-make-appointment\"]")
	WebElement BookAppointmentBtn;


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
	public void bookAppointmentBtn() {
		BookAppointmentBtn.click();
	}
	public void loginPage() {
		LoginPage login =new LoginPage(webdriver);
		login.ClickOnBookAppointment();
		login.SetUserName("John Doe");
		login.SetPassword("ThisIsNotAPassword");
		login.CickOnLoginBtn();}
	public void ClicksubmitBtn() {
		SubmitBtn.click();
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
}
