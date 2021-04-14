package com.appium.utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



public class Config 
{
	public static final String objectpath =".\\ObjectProperty\\MAP.properties";
	public static String browser="IEB";
	public static String iedriver=".\\ExeFiles\\IEDriverServer.exe";
	public static String chromedriver=".\\ExeFiles\\chromedriver.exe";
	public static String customer="SmartFactory";
	public static String environment="Dev";
	public static String defaultSelectedCar="Car";
	public static String enterusername ="Google";
	public static String SelectedCar = "SelectedCar";
	public static String expectedCarName="Mercedes";
	public static String expected_lang_ppulated = "Ruby";
	public static String expected_user_name = "Mr. Burns";
	
	public static String input_password = "pass123";
	public static String input_email ="testUser@gmail.com";
	public static String input_user_name = "APpiumUser";
	
	public static String appiumdriver=System.getProperty("user.dir")+ File.separator+ "ExeFiles"+File.separator+ "selendroid-test-app.apk";
	public static String expected_reg_prog ="PHP";
	public static String expected_reg_accept = "true";
	public static String extent_config_path = ".\\ExtentConfig\\extent-config.xml";
	
	public static String Admin=".\\TestData\\"+customer+"\\Admin.xlsx";

	
    public static String APPLICATION_NAME="Android";
    public static String PLATFORM_VERSION ="11.0";
    public static String DEVICE_NAME = "Pixel 2_New";
    
    public static String AUTOMATION_NAME = "UiAutomator2";
public static String webenvironment = "Web";
public static String url = "https://jqueryui.com/";


}

