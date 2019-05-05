package org.continuum.framework.testcases;

import org.continuum.framework.base.Common;
import org.continuum.framework.pages.LandingPage;
import org.continuum.framework.utilities.TakeSnapshot;
import org.testng.annotations.Test;

public class TC0006 extends Common {

	//Add to Cart Item //
	@Test
	public void tC0006(){
	
		try{
			LandingPage LP = new LandingPage(driver);
			LP.tWSearchBox("Phone");
			Thread.sleep(10000);
			LP.tWSearchButton();
			Thread.sleep(10000);
			LP.tWAddtoCart();
			Thread.sleep(5000);
			TakeSnapshot.getScreenshot(driver, "abc");
		}
		catch(Exception e)
		{
			System.out.println("Got new exception");
		}
			}}
