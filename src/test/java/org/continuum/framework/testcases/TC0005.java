package org.continuum.framework.testcases;

import org.continuum.framework.base.Common;
import org.continuum.framework.pages.LandingPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC0005 extends Common {

	//Search multiple item //
	
	@Test(dataProvider="Dp1")
	public void tC0005(String a) 
	{
		LandingPage LP = new LandingPage(driver);
		LP.tWSearchBox(a);
		//Thread.sleep(10000);
		LP.tWSearchButton(); 
		//Thread.sleep(10000);
	}
	
	@DataProvider(name="Dp1")
	public Object [][]testData()
	{
		Object[][] arr={{"Iphone"}, {"Dell"}, {"Samsung"}};
		return arr;
	}
}
