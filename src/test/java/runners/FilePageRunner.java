package runners;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.appium.libraries.SuperTestNG;
import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions( tags = "@chrome_page", glue = {"stepdefs"}, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = {"src/test/java/features"})
public class FilePageRunner extends SuperTestNG{
	
	@BeforeClass
	public static void before() {
	}
	
	@AfterClass
	public static void writeExtentReport() {
		
		 	
		
	        
	     
	}

}

