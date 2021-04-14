package stepdefs;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;
import com.aventstack.extentreports.Status;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import applicationPages.*;


public class Scenario3 extends SuperTestNG {
	private HomePage homePage;
	private SelectCarPage userpage;
	private SelectedCarDetailsPage userCarDisplayPage;

	public Scenario3() {
		this.homePage = new HomePage();
		this.userpage = new SelectCarPage();
		this.userCarDisplayPage = new SelectedCarDetailsPage();
	}

	@Before
	public void beforeStep() throws InterruptedException {
		//test = extent.create//test("User registration ", "Verifies the functionality of user registration page");
		
	}
	
	@After
	public void afterStep() {
		 //extent.flush();
	}
	@Given("^Clicks on ChromeLogo$")
	public void ClicksonChromeLogo() {
		this.homePage.clickOnChromeLogo();
	}

	@Then("^Title WebViewInteraction is displayed$")
	public void verifyTitleInSelectCarPage() {
		userpage.verifyTitle();
		//test.log(Status.PASS, "Validated ttitle of page");
	}

	@Then("^Text Hello,Can.. is displayed$")
	public void verifyTextCanyouPleaseTellMeYourName() throws IOException {
		try {
			userpage.verifyTextCanyouPleaseTellMeYourName();
			//test.log(Status.PASS, "verified for text elemnt");
		} catch (Exception e) {
			//test.addScreenCaptureFromPath(Generic.takeScreenshot(e.getMessage()));
			//test.log(Status.FAIL, "Failed to locate elemnt"+e.getMessage());
		}
	}

	@When("^user enters name in textbox$")
	public void userEntersName() {
		try {
			this.userpage.userEntersName();
			//test.log(Status.INFO, "User has entered name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^selects a car$")
	public void userSelectsCar() throws IOException {
		try {
			userpage.userSelectsMercedes();
			//test.log(Status.INFO, "User has selected car");
		} catch (Exception e) {
			//test.addScreenCaptureFromPath(Generic.takeScreenshot(e.getMessage()));
			//test.log(Status.FAIL, "Failed to locate elemnt"+e.getMessage());
		}
	}

@When("^Tap on send me your name$")
public void userTapsOnSendMeyourName() throws IOException {
	try {
		userpage.ClickOnSendMeyourName();
		//test.log(Status.INFO, "clicked on send me your name");
	} catch (Exception e) {
		//test.addScreenCaptureFromPath(Generic.takeScreenshot(e.getMessage()));
		//test.log(Status.FAIL, "Failed to locate elemnt"+e.getMessage());
	}

}

@Then("^Text This is My... is displayed$")

public void VerifyThisIsMyWayTextisDisplayed() throws IOException {
	try {
		userCarDisplayPage.verifyTextThisIsMyWay();
		//test.log(Status.INFO, "Verified text this is my way..");
	} catch (Exception e) {
		//test.addScreenCaptureFromPath(Generic.takeScreenshot(e.getMessage()));
		//test.log(Status.FAIL, "Failed to locate elemnt"+e.getMessage());
	}	
}

@Then("^Selected Name and Car are displayed$")
public void VerifySelectednameAndCarAreDsiplayed() throws IOException {
	try {
		userCarDisplayPage.verifySelectedCarAndNameDsiplayed();
		//test.log(Status.INFO, "Selceted car and name are displayed");
	} catch (Exception e) {
		//test.addScreenCaptureFromPath(Generic.takeScreenshot(e.getMessage()));
		//test.log(Status.FAIL, "Failed to locate elemnt"+e.getMessage());
	}	
}
	
	@When("^Click on Link here$")
	public void clickONlinkhere() {
		userCarDisplayPage.clickOnLinkHere();
		//test.log(Status.INFO, "Clicked on link");
	}
	
	@Then("^Default Preferred car is displayed$")
	public void defaultPreferredCarDisplayed() {
		userpage.VerifyDefaultSelectedCar();
		//test.log(Status.PASS, "Verified for default selected car");
		
	}
}

