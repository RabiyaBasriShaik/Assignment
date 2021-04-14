package applicationPages;

import java.io.IOException;

import org.testng.Assert;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;
import com.aventstack.extentreports.Status;

public class UserRegistrationPage extends SuperTestNG {

	public void WelcomeToRegisterDisplayed() throws IOException {
		
		try {
			Generic.isElementdisplayedInApp("welcome_to_register");
			Generic.hideKeyBoard();
		} catch (Exception e) {
		}
	}

	public void FilePageElementsDisplayed() throws IOException {
		try {
			Generic.hideKeyBoard();
		Generic.isElementdisplayedInApp("register_username");
		Generic.hideKeyBoard();
		Generic.isElementdisplayedInApp("register_email");
		Generic.hideKeyBoard();
		Generic.isElementdisplayedInApp("register_password");
		Generic.hideKeyBoard();
		Generic.isElementdisplayedInApp("input_name_populated");
		Generic.isElementdisplayedInApp("prog_Lang_Selected");
		Generic.isElementdisplayedInApp("Accept_adds");
		Generic.isElementdisplayedInApp("Reg_User_Verify_Btn");
		
	} catch (Exception e) {
		
	}
		
	}

	public void DefLanguage_Name() {
		Generic.hideKeyBoard();
		String name_populated = Generic.findObjectInApp("input_name_populated").getText();
		String lang_ppulated =Generic.findObjectInApp("prog_Lang_Selected").getText();
		Assert.assertEquals(name_populated.toLowerCase(), expected_user_name.toLowerCase());
		Assert.assertEquals(lang_ppulated.toLowerCase(), expected_lang_ppulated.toLowerCase());
		
	}

	public void fillRegForm() throws IOException {
		try {
			Generic.hideKeyBoard();
			
			Generic.findObjectInApp("register_username").clear();
			//Thread.sleep(600);
			Generic.findObjectInApp("register_username").sendKeys(input_user_name);
		//Generic.performActionInApp("register_username",input_user_name);
			
			Generic.findObjectInApp("register_email").clear();
			//Thread.sleep(600);
			Generic.findObjectInApp("register_email").sendKeys(input_email);
			
			Generic.findObjectInApp("register_password").clear();
			//Thread.sleep(600);
			Generic.findObjectInApp("register_password").sendKeys(input_password);
		//Generic.performActionInApp("register_email",input_email);
		//Generic.performActionInApp("register_password",input_password);
			Generic.waitForObject("prog_Lang_Selected", 20);
		Generic.clickInApp("prog_Lang_Selected");
		Generic.waitForObject("php_lang", 20);
		Generic.clickInApp("php_lang");
		
		}catch(Exception ex) {
			
		}
	}

	public void checkIAccept() {
		Generic.toggleCheckBoxInApp("Accept_adds","check");
		
	}

	public void CLickRegister() {
		Generic.clickInApp("Reg_User_Verify_Btn");	
		
	}


}
