package stepdefs;

import java.io.IOException;

import org.testng.Assert;

import com.appium.libraries.SuperTestNG;

import applicationPages.HomePage;
import applicationPages.UserRegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProgressBar_Sc5 extends SuperTestNG {
	private HomePage homePage;

	private UserRegistrationPage userRegPage;

	public ProgressBar_Sc5() {
		this.homePage = new HomePage();
		this.userRegPage = new UserRegistrationPage();
	}

	@Given("^Clicks on Show Progress Bar$")
	public void ClicksonShowProgressBar() {
		this.homePage.clickOnProgressBar();

	}

	@Given("^Waits for Progress bar to disapper$")
	public void waitsForProgressBartoDisappear() {
		this.homePage.waitsForProgressBartoDisappear();

	}

	@Then("^User Registration Page should be displayed with all elements$")
	public void RegistrationPageDisplayed() throws IOException {
		try {
			this.userRegPage.FilePageElementsDisplayed();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
