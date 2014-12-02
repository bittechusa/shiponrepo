package com.blue.fly.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility 
{
	FirefoxDriver fox;
	public Utility(FirefoxDriver uty)
	{
		fox=uty;
	}
	public void verifyTitle(String vr, String fy)
	{
		if(vr.contains(fy))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	public void type(By id, String name)
	{
		fox.findElement(id).sendKeys(name);
	}
	public void click(WebElement clk)
	{
		clk.click();
	}
	public void click(By ck)
	{
		fox.findElement(ck).click();
	}
	public void verifyText(String vfy)
	{
		if(fox.getPageSource().contains(vfy))
		{
			System.out.println("text found");
		}
		else
		{
			System.out.println("notfound");
		}
	}
	public void syso()
	{
		System.out.println("next");
	}

}
