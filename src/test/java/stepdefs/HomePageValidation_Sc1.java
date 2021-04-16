package stepdefs;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.appium.libraries.SuperTestNG;

import applicationPages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageValidation_Sc1 extends SuperTestNG {
	private HomePage homePage;

	public HomePageValidation_Sc1() {
		this.homePage = new HomePage();
	}

	@Given("^User Launches the application$")
	public void userLaunchesTheApp() throws InvalidFormatException, IOException, ClassNotFoundException {

		try {
			this.homePage.goToHomePage();

		} catch (Exception e) {
			Assert.fail(e.getMessage());

		}
	}

	@Then("^Verify for Title$")
	public void TitleDisplayed() throws Exception {

		try {
			this.homePage.verifyTitle();

		} catch (Exception e) {

			Assert.fail(e.getMessage());
		}
	}

	@Then("Verify for elements")
	public void elementsAreDisplayed() throws IOException {
		try {
			this.homePage.verifyElements();
		} catch (Exception ex) {
			Assert.fail(ex.getMessage());

		}
	}

}
