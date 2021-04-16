package applicationPages;

import org.testng.Assert;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;
import com.appium.utilities.ReadXL;

import io.appium.java_client.MobileElement;

public class SelectCarPage extends SuperTestNG {
	  

	public void verifyTitle() {
		Generic.waitForObject("Title_Home",10);
	String expected = Generic.findObjectInApp("Title_Home").getText();
		Assert.assertEquals(title,expected);
		System.out.println("Title from app"+ expected);
		
}
	
	public void isScreenDisplayed() throws Exception {
		Generic.waitForObject("Tap_OnSendMe_Your_name",5);
		Generic.isElementdisplayedInApp("Tap_OnSendMe_Your_name");
		System.out.println("Tap on send me your name displayed");
		}

	
	public void verifyTextCanyouPleaseTellMeYourName() throws Exception {
		Generic.isElementdisplayedInApp("HelloTellMeyourName_Text");
		Assert.assertEquals(Generic.findObjectInApp("HelloTellMeyourName_Text").getText(),"Hello, can you please tell me your name?");
		System.out.println("Helo Tell me your name text verified");
	}

	public void VerifyDefaultSelectedCar() {
		Generic.waitForObject("Select_Car_DropDown",5);
		String defaultselectedCar =((MobileElement)Generic.findObjectInApp("Select_Car_DropDown")).getText();
		String expectedCarName = ReadXL.XLCellValue(Admin, "SelectCarPage", defaultSelectedCar,"Name");
		Assert.assertEquals(defaultselectedCar,expectedCarName);
		System.out.println("default car from app" + defaultselectedCar);
		System.out.println("default car from excel" +expectedCarName);
		
	}

	public void userEntersName() throws Exception {
		//Generic.performActionInApp("Enter_Your_Name_Input",enterusername);
		Generic.waitForObject("Enter_Your_Name_Input", 5);
		Generic.findObjectInApp("Enter_Your_Name_Input").clear();
		Thread.sleep(600);
		Generic.findObjectInApp("Enter_Your_Name_Input").sendKeys(enterusername);
		System.out.println(enterusername + "enterusername");
		
		System.out.println("Entered name in innput"+ " "+ enterusername);
	}

	public void userSelectsMercedes() {
		Generic.waitForObject("Select_Car_DropDown",5);
		Generic.clickInApp("Select_Car_DropDown");
		Generic.waitForObject("Select_Mercedes", 10);
		Generic.clickInApp("Select_Mercedes");
		System.out.println("Selected mercedes");
	}

	public void ClickOnSendMeyourName() {
		Generic.waitForObject("Tap_OnSendMe_Your_name",5);
		Generic.clickInApp("Tap_OnSendMe_Your_name");
		System.out.println("Selected mercedes option");
	}

	
}