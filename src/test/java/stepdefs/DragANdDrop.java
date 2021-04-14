package stepdefs;

import java.io.IOException;

import com.appium.libraries.SuperTestNG;

import applicationPages.HomePage;
import applicationPages.JqueryPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragANdDrop extends SuperTestNG {
	private JqueryPage homePage;
	
	
	public DragANdDrop() {
		this.homePage = new JqueryPage();
		}

	@Before
	public void beforeStep() throws InterruptedException {
		 
	}
	@After()
	public void afterStep() {
		driver.quit();
	}

	@Given("^User Navigates to URL$")
	public void NaviagtesToURL() {
		this.homePage.getHomepage();
		
		////test.log(Status.INFO, "Clicked on Display Toast");
	
	}
	
	@When("^Cicks on Droppable$")
	public void clicksonDroppable() {
	this.homePage.ClickONDroppable();
	}

	@When("^Drags and Drops The target element$")
	public void DragAndDropElement() {
		this.homePage.dragAndDrop();
	}
	
	@When("^Cicks on Selectable$")
	public void clicksonSelectable() {
		this.homePage.clickONSelectable();
	}

	
	@Then("^Selects Items$")
	public void SelectItems() {
this.homePage.selectItems();
	}
	
	@When("^Cicks on ControlGroup$")
	public void clicksOnCOntrolGroup() {
		this.homePage.clickONCOntrolGroup();
	}
	
	@Then("^Selects Items from ControlGroup$")
	public void selectItemsFromControlGroup() {
		this.homePage.selectControlGroupItems();
	}

}

	


