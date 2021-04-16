package applicationPages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.appium.commonFunctions.Login;
import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;


public class JqueryPage extends SuperTestNG {
	 

	public void getHomepage() {
		
		Login.login(webenvironment);
	}

	public void ClickONDroppable() {
	Generic.click("Droppable_Link");
	
	}

	public void dragAndDrop() {
		try {
		Generic.dragAndDrop("Draggable","Droppable");
		}catch(Exception ex) {
			Assert.fail(ex.getMessage());
		}
	}

	public void clickONSelectable() {
		Generic.findObject("SelectableLink").click();
		
	}

	public void ListDisplayed() throws Exception {
		Generic.isElementdisplayed("SelectableList");
		
	}

	public void selectItems() {
		Generic.SelectMultipleItems("Item_7","Item_1","Item_3");
		
	}

	public void clickONCOntrolGroup() {
		Generic.click("Control_group_link");
		
	}

	public void selectControlGroupItems() {
		Generic.findObjectsAndPerformAction("AutomaticElements",0);
		Generic.findObjectsAndPerformAction("Insurance_Elements",0);
		List<WebElement> list_insurance = Generic.findObjectsInFrame("Insurance_Elements");
		Generic.toggleCheckBoxInFrame(list_insurance.get(0),"check");
		Generic.click("Standard_RadioButton");
		Generic.toggleCheckBoxInFrame(list_insurance.get(1),"check");
	}
}