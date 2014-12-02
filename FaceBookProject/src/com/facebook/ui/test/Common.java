package com.facebook.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common 
{
	FirefoxDriver fd;
	public Common(FirefoxDriver cm)
	{
		fd=cm;
	}
	public void type(By tp, String st)
	{
		fd.findElement(tp).sendKeys(st);
	}
	public void click(WebElement ck)
	{
		ck.click();
	}

}
