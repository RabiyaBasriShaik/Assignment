package applicationPages;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;
import com.appium.utilities.ReadXL;


public class UserRegistrationPage extends SuperTestNG {

	public void WelcomeToRegisterDisplayed() throws IOException {
		
		try {
			Generic.isElementdisplayedInApp("welcome_to_register");
			Generic.hideKeyBoard();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
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
		Assert.fail(e.getMessage());
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
			//passing 1 as row number since there is only one row in the excel ; else need to iterate through all rows
			ArrayList<String> rowValues=ReadXL.xlToArrayList(Admin,"UserRegistrationPage", 1);
			String input_user_name =rowValues.get(UserName);
			String input_email =rowValues.get(Email);
			String input_password = rowValues.get(Password);
			Generic.hideKeyBoard();
			Generic.findObjectInApp("register_username").clear();
			Generic.findObjectInApp("register_username").sendKeys(input_user_name);
			
			Generic.findObjectInApp("register_email").clear();
			Generic.findObjectInApp("register_email").sendKeys(input_email);
			
			Generic.findObjectInApp("register_password").clear();
			Generic.findObjectInApp("register_password").sendKeys(input_password);
			Generic.waitForObject("prog_Lang_Selected", 20);
		Generic.clickInApp("prog_Lang_Selected");
		Generic.waitForObject("php_lang", 20);
		Generic.clickInApp("php_lang");
		
		}catch(Exception ex) {
			Assert.fail(ex.getMessage());
		}
	}

	public void checkIAccept() {
		try {
			Generic.toggleCheckBoxInApp("Accept_adds","check");
		} catch (Exception e) {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}

	public void CLickRegister() {
		Generic.clickInApp("Reg_User_Verify_Btn");	
		
	}


}
