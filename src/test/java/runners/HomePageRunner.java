package runners;

import org.junit.runner.RunWith;

import com.appium.libraries.SuperTestNG;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@selectelements or @home_page", glue = { "stepdefs" }, plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = {
				"src/test/java/features" })
public class HomePageRunner extends SuperTestNG {
}
