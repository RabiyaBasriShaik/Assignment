package com.appium.commonFunctions;



import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;
import com.appium.utilities.Config;
import com.appium.utilities.ReadXL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
/*
 * Application Log In
 */
public class Login extends SuperTestNG{
	

	
	//Login @param: Environment
	public static void login(String environment)
	{
		
		try
		{		
			
			//Close Existing Instances of appium
//			try {
//				/*Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
//				Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");*/
//				Runtime.getRuntime().exec("TASKKILL /IM chrome.exe");
//				
//			} catch (IOException e) {
//
//				e.printStackTrace();
//			}

		if(ReadXL.XLCellValue(Admin, "Login", environment, "Browser").equals("Chrome")){
				System.setProperty("webdriver.chrome.driver", Config.chromedriver);//webdriver.chrome.driver
		/*		ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
                options.addArguments("window-size=1920x1080");*/
                 
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to(url);

			}
			if(ReadXL.XLCellValue(Admin, "Login", environment, "Browser").equals("Firefox")){
				driver=new FirefoxDriver();				
			}
			
			if(ReadXL.XLCellValue(Admin, "Login", environment, "Browser").equals("Mobile")){
				
				DesiredCapabilities capability = new DesiredCapabilities();
					  capability.setCapability(MobileCapabilityType.APPLICATION_NAME,APPLICATION_NAME);
					  capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
					  capability.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
					  capability.setCapability(MobileCapabilityType.APP, appiumdriver);
					  System.out.println("Appium path"+ appiumdriver);
					  capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME);
					  capability.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
					  capability.setCapability("autoGrantPermissions", true);
					  capability.setCapability("appPackage","io.selendroid.testapp");
					   URL appiumurl = new URL("http://127.0.0.1:4723/wd/hub");
					  driver = new AndroidDriver<MobileElement>(appiumurl,capability);
					 
					  System.out.println("Launched Android App");
					  Generic.waitForObject("Continue",100);
					  if(Generic.isElementdisplayedInApp("Continue")) {
						  System.out.println("Continue element displayed");
						  //Generic.click("Continue");
						 MobileElement me = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
						 me.click();
						 
					  }
					  Thread.sleep(1000);
					 	if(Generic.isElementdisplayedInApp("OK_Check_For_Updates")) {
						MobileElement el1 = (MobileElement) Generic.findObject("OK_Check_For_Updates");
						el1.click();
						
						System.out.println("clicked on alert ok");
					 
					  }
					  
					}
				
			
			
			
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
			driver.close();
		}
	}


}

