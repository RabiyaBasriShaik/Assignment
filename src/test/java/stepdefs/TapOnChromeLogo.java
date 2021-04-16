package stepdefs;

import java.io.IOException;

import org.testng.Assert;

import com.appium.libraries.SuperTestNG;

import applicationPages.HomePage;
import applicationPages.SelectCarPage;
import applicationPages.SelectedCarDetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TapOnChromeLogo extends SuperTestNG {
	private HomePage homePage;
	private SelectCarPage userpage;
	private SelectedCarDetailsPage userCarDisplayPage;

	public TapOnChromeLogo() {
		this.homePage = new HomePage();
		this.userpage = new SelectCarPage();
		this.userCarDisplayPage = new SelectedCarDetailsPage();
	}

	@Given("^Clicks on ChromeLogo$")
	public void ClicksonChromeLogo() {
		this.homePage.clickOnChromeLogo();
	}

	@Then("^Title WebViewInteraction is displayed$")
	public void verifyTitleInSelectCarPage() {
		userpage.verifyTitle();
	}

	@Then("^Text Hello,Can.. is displayed$")
	public void verifyTextCanyouPleaseTellMeYourName() throws IOException {
		try {
			userpage.verifyTextCanyouPleaseTellMeYourName();

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@When("^user enters name in textbox$")
	public void userEntersName() {
		try {
			this.userpage.userEntersName();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@When("^selects a car$")
	public void userSelectsCar() throws IOException {
		try {
			userpage.userSelectsMercedes();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@When("^Tap on send me your name$")
	public void userTapsOnSendMeyourName() throws IOException {
		try {
			userpage.ClickOnSendMeyourName();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Text This is My... is displayed$")
	public void VerifyThisIsMyWayTextisDisplayed() throws IOException {
		try {
			userCarDisplayPage.verifyTextThisIsMyWay();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Then("^Selected Name and Car are displayed$")
	public void VerifySelectednameAndCarAreDsiplayed() throws IOException {
		try {
			userCarDisplayPage.verifySelectedCarAndNameDsiplayed();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@When("^Click on Link here$")
	public void clickONlinkhere() {
		userCarDisplayPage.clickOnLinkHere();
	}

	@Then("^Default Preferred car is displayed$")
	public void defaultPreferredCarDisplayed() {
		userpage.VerifyDefaultSelectedCar();

	}

}
