package org.browserstack.test;

import org.browserstack.driver.DriverSetup;
import org.browserstack.pompages.DemoQAPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DemoQAStepDef extends DriverSetup{
	public DemoQAPage demopage = new DemoQAPage();
	
    @Test
    public void validateApplicationDetails() throws InterruptedException {
		demopage.clickSignin();
	}

}
