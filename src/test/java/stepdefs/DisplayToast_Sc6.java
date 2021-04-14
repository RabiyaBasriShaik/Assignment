package stepdefs;

import java.io.IOException;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;
import com.aventstack.extentreports.Status;

import applicationPages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisplayToast_Sc6 extends SuperTestNG {
	private HomePage homePage;
	
	
	public DisplayToast_Sc6() {
		this.homePage = new HomePage();
		}

	@Before
	public void beforeStep() throws InterruptedException {
		 
		 
	}
	@After()
	public void afterStep() {
		
	}

	@When("^Clicks on Dsiplay Toast$")
	public void ClicksonDisplayToastr() {
		this.homePage.clickOnDisplayToast();
	
	
	}


	

	@Then("^Toast Message should appear$")
	public void toastMesageappears() throws IOException {
		try {
			this.homePage.VerifyToastText();
			//test.log(Status.PASS, "Verified toast text");
		} catch (Exception e) {
			//test.addScreenCaptureFromPath(Generic.takeScreenshot("ToastText_Ex"));
			//test.log(Status.FAIL, "Failed to verify toast text");
		}
	}
	
	
	@When("^Clicks on Dsiplay Popup$")
	public void ClickONDisplayPopup() {
		this.homePage.clickOnDisplayPopUP();
		////test.log(Status.PASS, "Clicked on display pop up");
		
		
	}

@Then("^Tap On Dismiss$")
public void TapOnDismiss() {
	this.homePage.tapOnDismiss();
	////test.log(Status.INFO, "Clicked on Dismiss");
	
}

@When("^Clicks on Press to throw exception$")
public void TapUnhandledException() {
	this.homePage.TapUnandledException();
	//test.log(Status.INFO, "Clicked on Button for exception");
	
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

	


