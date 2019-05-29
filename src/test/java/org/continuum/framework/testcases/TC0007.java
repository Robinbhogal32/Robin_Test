package org.continuum.framework.testcases;

import java.io.IOException;

import org.continuum.framework.base.Common;
import org.continuum.framework.pages.LandingPage;
import org.continuum.framework.utilities.TakeSnapshot;
import org.testng.annotations.Test;

public class TC0007 extends Common {
	
	@Test(groups = { "All", "P2" })
	public void TC007() throws InterruptedException, IOException
	{
		LandingPage LP = new LandingPage(driver);
		LP.tWSearchBox("Iphone");
		Thread.sleep(10000);
		LP.tWSearchButton();
		Thread.sleep(10000);
		LP.tWSearchCriteria();
		Thread.sleep(10000);
		LP.tWAddtoCart();
		Thread.sleep(5000);
		LP.tWItemCart();
		//TakeSnapshot.getScreenshot(driver, "abc");
	}

}
