package org.continuum.framework.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.continuum.framework.base.Myutils;

public class LandingPage extends Myutils {
	
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchItem(String item)
	{
		driver.findElement(By.xpath("Searchbox_Xpath")).click();
		driver.findElement(By.xpath("Searchbox_Xpath")).sendKeys(item);
	}

	
	public void searchbuttonclick()
	{
		driver.findElement(By.xpath("Searchbutton_Xpath")).click();
	}
	
	public void pageTitle()
	{
		String s=driver.getTitle();
		System.out.println(s);
		
}}
