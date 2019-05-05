package org.continuum.framework.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TakeSnapshot {
	
	public static void getScreenshot(WebDriver driver, String name) throws IOException
	{
		File f1=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File f2= new File("./Snapshot/"+name+".png");
		FileUtils.copyFile(f1, f2);
	}

}
