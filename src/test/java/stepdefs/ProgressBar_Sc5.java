package stepdefs;

import java.io.IOException;

import com.appium.libraries.SuperTestNG;

import applicationPages.HomePage;
import applicationPages.UserRegistrationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class ProgressBar_Sc5 extends SuperTestNG {
	private HomePage homePage;
	
	private UserRegistrationPage userRegPage;

	public ProgressBar_Sc5() {
		this.homePage = new HomePage();
		this.userRegPage = new UserRegistrationPage();
	}

	@Before
	public void beforeStep() throws InterruptedException {
		//test = extent.create//test("Progress Bar", "Verifies the functionality of progres bar");
		
	}
	
	@After
	public void afterStep() {
		// extent.flush();
	}

	@Given("^Clicks on Show Progress Bar$")
	public void ClicksonShowProgressBar() {
		this.homePage.clickOnProgressBar();
		//test.log(Status.PASS, "clicked on progress bar");
	}

	@Given("^Waits for Progress bar to disapper$")
	public void waitsForProgressBartoDisappear() {
		this.homePage.waitsForProgressBartoDisappear();
		
	}

	@Then("^User Registration Page should be displayed with all elements$")
	public void RegistrationPageDisplayed() throws IOException {
		try {
			userRegPage.FilePageElementsDisplayed();
			//test.log(Status.PASS, "Register page elements validated");
		} catch (Exception e) {
			//test.addScreenCaptureFromPath(Generic.takeScreenshot(e.getMessage()));
			//test.log(Status.FAIL, "Failed to locate elemnt"+e.getMessage());
		}
	}

	
}

