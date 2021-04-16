package stepdefs;

import java.io.IOException;

import org.testng.Assert;

import com.appium.libraries.SuperTestNG;

import applicationPages.HomePage;
import io.cucumber.java.en.Then;

public class Tap_On_ENButton extends SuperTestNG {
	private HomePage homePage;

	public Tap_On_ENButton() {
		this.homePage = new HomePage();
	}

	@Then("^Selects Option NoNo$")
	public void selectsOptionNoNo() throws Exception {

		try {
			this.homePage.selectOptionNoNo();

		} catch (Exception e) {
			Assert.fail(e.getMessage());

		}
	}

	@Then("^Home Page should be displayed$")
	public void HomePageShouldbeDisplayed() throws IOException {
		try {
			this.homePage.isScreenDisplayed();

		} catch (Exception ex) {
			Assert.fail(ex.getMessage());
		}
	}

	@Then("^Clicks on ENButton$")
	public void ClicksOnEnButton() throws IOException {
		try {
			this.homePage.clickENBUtton();

		} catch (Exception ex) {
			Assert.fail(ex.getMessage());
		}
	}

}
