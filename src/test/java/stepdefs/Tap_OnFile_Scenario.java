package stepdefs;

import java.io.IOException;

import com.appium.libraries.SuperTestNG;

import applicationPages.HomePage;
import applicationPages.RegisterSuccessPage;
import applicationPages.UserRegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tap_OnFile_Scenario extends SuperTestNG {
	private HomePage homePage;
	private UserRegistrationPage userRegPage;
	private RegisterSuccessPage regSuccessPage;

	public Tap_OnFile_Scenario() {
		this.homePage = new HomePage();
		this.userRegPage = new UserRegistrationPage();
		this.regSuccessPage = new RegisterSuccessPage();
	}

	@Given("^Clicks on FileLogo$")
	public void click_OnFileLogo() {
		this.homePage.clickOnFileLogo();
	}

	@Then("^Text Welcome to register is displayed$")
	public void welcometoregDisplayed() throws IOException {
		this.userRegPage.WelcomeToRegisterDisplayed();
	}

	@Then("^File Page elements are displayed$")
	public void FilePageElementsDispyaed() throws IOException {

		this.userRegPage.FilePageElementsDisplayed();
	}

	@Then("^Default Name and launguage are Prepopulated$")
	public void DefNameLang() {
		this.userRegPage.DefLanguage_Name();
	}

	@Then("^user enters values in Fields$")
	public void userRegisters() throws IOException {
		this.userRegPage.fillRegForm();
	}

	@Then("^Check I Accept Ads$")
	public void checIAccept() {
		this.userRegPage.checkIAccept();

	}

	@Then("^Tap on Register User$")
	public void tapOnRegister() {
		this.userRegPage.CLickRegister();

	}

	@Then("^user details should be displayed on RegistrationScreen$")
	public void userDetailsDisplayed() {
		this.regSuccessPage.DisplayUserdetails();

	}

	@When("^Tap on Register User to Navigate to HomePage$")
	public void TapOnRegister() {
		this.regSuccessPage.TapOnRegister();

	}

	@Then("^Home Screen is displayed$")
	public void homeScreenDisplayed() throws Exception {
		this.homePage.isScreenDisplayed();

	}

}
