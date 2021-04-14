package applicationPages;



import java.io.IOException;

import org.testng.Assert;

import com.appium.commonFunctions.Login;
import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;
import com.aventstack.extentreports.Status;


public class HomePage extends SuperTestNG {
	  public void goToHomePage() {
	    	Login.login(environment);
	        
	    }

	public void verifyTitle() throws IOException {
		Generic.waitForObject("Title_Home",5);
	String expected = Generic.findObjectInApp("Title_Home").getText();
		Assert.assertEquals(driver.getTitle(),expected);
		 
		 
		
}
	public void verifyElements() throws Exception {
		
			Generic.isElementdisplayedInApp("EN_Button");
			Generic.isElementdisplayedInApp("Chrome_Button");
			Generic.isElementdisplayedInApp("User_Reg_Button");
			Generic.isElementdisplayedInApp("User_InputText");
			Generic.isElementdisplayedInApp("ShowProgressBar_For_A_While");
			Generic.isElementdisplayedInApp("Accept_Ads_Button");
			Generic.isElementdisplayedInApp("DisplayToast_Button");
			Generic.isElementdisplayedInApp("DisplayPopUp_Btn");
			Generic.isElementdisplayedInApp("Exception_Btn");
			Generic.isElementdisplayedInApp("TypeToThrowException");
			Generic.isElementdisplayedInApp("Display_Focus_On_Layout");
		
	}
	
	public void isScreenDisplayed() throws Exception {
		Generic.isElementdisplayedInApp("EN_Button");
		Generic.isElementdisplayedInApp("Chrome_Button");
		Generic.isElementdisplayedInApp("User_Reg_Button");
		}

	public void clickENBUtton() {
		Generic.clickInApp("EN_Button");
		
		
	}
	
	public void selectOptionNoNo() {
		
		Generic.waitForObject("NoNoButton", 60);
		Generic.clickInApp("NoNoButton");
		System.out.println("Clicked on NO");
		
	}

	public void clickOnChromeLogo() {
		Generic.clickInApp("Chrome_Button");
		
	}

	public void clickOnFileLogo() {
		Generic.clickInApp("User_Reg_Button");
		
	}

	public void waitsForProgressBartoDisappear() {
		Generic.waitProgressBar(20, 5);
		
	}

	public void clickOnProgressBar() {
		Generic.clickInApp("ShowProgressBar_For_A_While");
		
		
	}

	public void VerifyToastText() throws IOException {
		try {
		String toastText = Generic.findToastElement().getText();
		System.out.println("Toast Text"+ toastText);
		}catch(Exception ex) {
			
		}
	}

	public void clickOnDisplayToast() {
		Generic.clickInApp("DisplayToast_Button");
		
		
	}

	public void clickOnDisplayPopUP() {
		Generic.clickInApp("DisplayPopUp_Btn");
		
		
	}

	public void tapOnDismiss() {
		Generic.clickInApp("Dismiss_Button");
		
		
	}

	public void TapUnandledException() {
		Generic.clickInApp("Exception_Btn");

		
		
	}

	public void appshouldNotBeActive() throws IOException {
		try {
			Generic.waitForObject("Title_Home",5);
		String expected = Generic.findObjectInApp("Title_Home").getText();
		Assert.assertNotEquals(driver.getTitle(),expected);
		System.out.println(driver.getTitle() + " "+ expected);
		}catch(Exception ex) {
			
		}
		
	}

	public void enterTextToThrowException() throws IOException {
		try {
			Generic.performActionInApp("TypeToThrowException","Exception");
		} catch (Exception e) {
			
			
			
		}
		
	}
}