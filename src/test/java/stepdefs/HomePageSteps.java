package stepdefs;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.appium.libraries.SuperTestNG;

import applicationPages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePageSteps extends SuperTestNG {
	private HomePage homePage;  
	public HomePageSteps() {
		this.homePage = new HomePage();
	}

	@Before
	public void beforeStep() throws InterruptedException {
		 
		
	}
	
	@After
	public void afterStep() {
		
	}

	@Given("^User Launches the application$")
	public void userLaunchesTheApp() throws InvalidFormatException, IOException, ClassNotFoundException {
		
		try {
		this.homePage.goToHomePage();
		
			
		} catch ( Exception e) {
			
			
		}
	}

	@Then("^Verify for Title$")
	public void TitleDisplayed() throws Exception {
		
		try {
			this.homePage.verifyTitle();
			
			
		} catch ( Exception e) {
			
			
		}
	}
	
	@Then("Verify for elements")
	public void elementsAreDisplayed() throws IOException {
		try {
		this.homePage.verifyElements();
		
	}
		catch(Exception ex) {
			
			
		}
	}
}
