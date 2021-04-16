package stepdefs;

import java.io.IOException;

import org.testng.Assert;

import com.appium.libraries.SuperTestNG;

import applicationPages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisplayToast_Sc6 extends SuperTestNG {
	private HomePage homePage;

	public DisplayToast_Sc6() {
		this.homePage = new HomePage();
	}

	@When("^Clicks on Dsiplay Toast$")
	public void ClicksonDisplayToastr() {
		this.homePage.clickOnDisplayToast();

	}

	@Then("^Toast Message should appear$")
	public void toastMesageappears() throws IOException {
		try {
			this.homePage.VerifyToastText();

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@When("^Clicks on Dsiplay Popup$")
	public void ClickONDisplayPopup() {
		this.homePage.clickOnDisplayPopUP();

	}

	@Then("^Tap On Dismiss$")
	public void TapOnDismiss() {
		this.homePage.tapOnDismiss();

	}

	@When("^Clicks on Press to throw exception$")
	public void TapUnhandledException() {
		this.homePage.TapUnandledException();

	}

	@Then("^Application should be crashed$")
	public void appShouldBeCrashed() throws IOException {
		this.homePage.appshouldNotBeActive();
	}

	@When("^Enters Text to throw exception$")
	public void entersTextThrowException() throws IOException {
		this.homePage.enterTextToThrowException();
	}

}
