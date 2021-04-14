package applicationPages;

import org.testng.Assert;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;

public class RegisterSuccessPage extends SuperTestNG {

	public void DisplayUserdetails() {
		Generic.waitForObject("User_Name_Data",20);
		String user_name =Generic.findObjectInApp("User_Name_Data").getText();
		Generic.waitForObject("Password_data",20);
		String password = Generic.findObjectInApp("Password_data").getText();
		Generic.waitForObject("email_Data",20);
		String email =Generic.findObjectInApp("email_Data").getText();
		Generic.waitForObject("prog_Lang_Data",20);
		String prog =Generic.findObjectInApp("prog_Lang_Data").getText();
		Generic.waitForObject("accept_ads_Data",20);
		String accept =Generic.findObjectInApp("accept_ads_Data").getText();
		Assert.assertEquals(user_name.toLowerCase(), input_user_name.toLowerCase());
		Assert.assertEquals(password.toLowerCase(), input_password.toLowerCase());
		Assert.assertEquals(email.toLowerCase(), input_email.toLowerCase());
		Assert.assertEquals(prog.toLowerCase(), expected_reg_prog.toLowerCase());
		Assert.assertEquals(accept.toLowerCase(), expected_reg_accept.toLowerCase());
		
	}

	public void TapOnRegister() {
		Generic.waitForObject("Reg_User_Verify", 5);
		Generic.findObjectInApp("Reg_User_Verify").click();
		
	}

}
