package org.continuum.framework.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.continuum.framework.base.Myutils;

import org.openqa.selenium.JavascriptExecutor;

public class LandingPage extends Myutils {
	
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchItem(String item)
	{
		
		
	//	 JavascriptExecutor js = (JavascriptExecutor)driver;
		// driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		 
          //js.executeScript("document.getElementByxpath('/html//input[@id='twotabsearchtextbox']').click();");
		 
		 //js.executeScript("document.getElementByxpath('/html//input[@id='twotabsearchtextbox']').value=Mobile;");
		 
		//driver.findElement(By.xpath("Searchbox_Xpath")).click();

		
		driver.findElement(By.xpath(rb.getString("Searchbox_Xpath"))).sendKeys(item);
	}

	
	public void searchbuttonclick()
	{

		driver.findElement(By.xpath(rb.getString("Searchbutton_Xpath"))).click();
	}
	
	public void pageTitle()
	{
		String s=driver.getTitle();
		System.out.println(s);
	}
		public void tWSearchBox(String item)
		{
			driver.findElement(By.name(rb.getString("TWSearchbox_Name"))).sendKeys(item);
			
		}
		
		public void tWSearchButton()
		{

			driver.findElement(By.xpath(rb.getString("TWSearchclick_Xpath"))).click();
			
		}
		
		public void tWAddtoCart()
		{

			driver.findElement(By.xpath(rb.getString("TWAddtoCart_Xpath"))).click();
			
		}
}
