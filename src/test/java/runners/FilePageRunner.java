package runners;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.appium.libraries.Generic;
import com.appium.libraries.SuperTestNG;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( tags = "@chrome_page", glue = {"stepdefs"}, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = {"src/test/java/features"})
public class FilePageRunner extends SuperTestNG{
	

}

