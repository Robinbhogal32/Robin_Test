package org.continuum.framework.testcases;

import org.continuum.framework.base.Common;
import org.continuum.framework.pages.LandingPage;
import org.testng.annotations.Test;

public class TC0004 extends Common {

	//Search single item //
	
	public void tC0004() throws InterruptedException{
	
		try{
			LandingPage LP = new LandingPage(driver);
			LP.tWSearchBox("Phone");
			Thread.sleep(10000);
			LP.tWSearchButton();
			Thread.sleep(10000);
	
		}
		catch(Exception e)
		{
			System.out.println("Got new exception");
		}
			}
	
	
}
