package BasePageTestSetup;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import BasePageSetup.Click_Demo;

import BasePageSetup.Driver_Setup;

public class BaseTest {
	Driver_Setup dsp;
	Click_Demo cd;
	WebDriver driver;


	@BeforeTest
	public void DriverSetting() {
		dsp = new Driver_Setup ();
		driver= dsp.driverSetup();
		cd =new Click_Demo(driver);


	}


	@ Test 
	public void click () {

		cd.eMail();
        cd.getClick();

	}

	@Test
	public void teardown() {
		driver.close();
	}
	
	
}
