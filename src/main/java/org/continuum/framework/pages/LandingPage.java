package org.continuum.framework.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
			JavascriptExecutor jse = (JavascriptExecutor)driver; // Scroll down //
			jse.executeScript("window.scrollBy(0,250)", "");  // scroll bar //
			
		}
		
		public void tWAddtoCart()
		{

			driver.findElement(By.xpath(rb.getString("TWAddtoCart_Xpath"))).click();
			
		}
		
		public void tWItemCart()
		{

			driver.findElement(By.xpath(rb.getString("TWItemCart_Xpath"))).click();
			
		}
		
		public void tWSearchCriteria()
		{
			
			//Select S= new Select(driver.findElement(By.xpath("TWSearchCriteria")));
			Select S = new Select (driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[2]/select")));
		    S.selectByValue("27");
			
			
		}
		
		public void tWcheckout()
		{

			driver.findElement(By.xpath(rb.getString("TWCheckout_Xpath"))).click();
			
		}
		
		public void tWGuestAccount()
		{

		WebDriverWait wait = new WebDriverWait(driver, 50); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label")));
			
			driver.findElement(By.xpath(rb.getString("TWGuestAccount_Xpath"))).click();
			
			
		}
		
		public void tWContinueButton()
		{

			
			driver.findElement(By.xpath(rb.getString("TWContinueButton_Xpath"))).click();
			
			
		}
}
