package com.runner.in;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



import com.Cucumber2.BaseClassCucumbers4;
import com.properties.in.FileReaderManger;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SRBTHAMIZH\\eclipse-workspace\\Cucumber2\\src\\test\\java\\com\\feature\\in\\scriptfile.feature",
                  glue = "com\\stepdef\\in",
                  monochrome = true,
                  publish=true,
                  
plugin = {
		"pretty", "html:target/cucumber -report",
				
				
		"json:target/cucumber-report"})
		 
                  
                  
                  
                  
                  
               
                  
public class Runner{
public static WebDriver driver;
   @BeforeClass
	public static void setup() throws Throwable {
	  String browser = FileReaderManger.getInstanceFR().getInstanceCR().GetBrowser();
    driver=BaseClassCucumbers4.browserLaunch(browser);
	}
	
	@AfterClass
    public static void teardown() {
    driver.close();
	}            	
	
	
	                  
	
	
}
