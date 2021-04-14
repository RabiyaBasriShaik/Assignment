package stepdefs;

import java.io.IOException;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;
import com.aventstack.extentreports.Status;

import applicationPages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;


public class HomePageScenario2 extends SuperTestNG {
	private HomePage homePage;  
	public HomePageScenario2() {
		this.homePage = new HomePage();
	}

	@Before
	public void beforeStep() throws InterruptedException {
		 
		 //test = extent.create//test("Home page ", "Verifies the functionality of buttons on home page");
	}
@After
	public void afterStep() {
		 //extent.flush();
	}

	@Then("^Selects Option NoNo$")
	public void selectsOptionNoNo() throws Exception {
		
		try {
			this.homePage.selectOptionNoNo();
			//test.log(Status.PASS, "clicked on nono");
			
		} catch (Exception e) {
			//test.addScreenCaptureFromPath(Generic.takeScreenshot("option NOno not located"));
			//test.log(Status.FAIL,"Failed");
		}
	}
	
	@Then("^Home Page should be displayed$")
	public void HomePageShouldbeDisplayed() throws IOException {
		try {
		this.homePage.isScreenDisplayed();
		//test.log(Status.PASS, "Home screen is displayed");
	}
		catch(Exception ex) {
			//test.addScreenCaptureFromPath(Generic.takeScreenshot("elemnt_missing"));
			//test.log(Status.FAIL, "Failed to locate elemnt"+ex.getMessage());
		}
	}
	
	
	@Then("^Clicks on ENButton$")
	public void ClicksOnEnButton() throws IOException {
		try {
		this.homePage.clickENBUtton();
		//test.log(Status.PASS, "Clicked on En button");
	}
		catch(Exception ex) {
			//test.addScreenCaptureFromPath(Generic.takeScreenshot("ENButton")+ex.getMessage());
			//test.log(Status.FAIL, "Failed to locate elemnt"+ex.getMessage());
		}
	}
	
}
