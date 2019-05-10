package org.continuum.framework.testcases;

import java.io.IOException;

import org.continuum.framework.base.Common;
import org.continuum.framework.pages.LandingPage;
import org.continuum.framework.utilities.TakeSnapshot;
import org.testng.annotations.Test;

public class TC0009 extends Common{
	
	
	public void TC009() throws InterruptedException, IOException
	{
		LandingPage LP = new LandingPage(driver);
		LP.tWSearchBox("Iphone");
		Thread.sleep(5000);
		LP.tWSearchButton();
		Thread.sleep(5000);
		LP.tWSearchCriteria();
		Thread.sleep(5000);
		LP.tWAddtoCart();
		Thread.sleep(5000);
		
		LP.tWcheckout();
		LP.tWGuestAccount();
		LP.tWContinueButton();
		TakeSnapshot.getScreenshot(driver, "TC0009");
	}

}
