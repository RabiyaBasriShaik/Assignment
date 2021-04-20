package runners;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@selectelements or @home_page or @chrome_page or @register_page or @Elements_test", glue = { "stepdefs" }, plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = {
				"src/test/java/features" })
public class HomePageRunner extends SuperTestNG {

}
