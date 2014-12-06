package com.bluefly.org;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueFly 
{
	public static void main(String[] args) 
	{
		FirefoxDriver browser =  new FirefoxDriver();
		browser.get("http://www.bluefly.com");
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li/a")).click();
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[2]/a")).click();
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[3]/a")).click();
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[4]/a")).click();
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[5]/a")).click();
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[6]/a")).click();
		browser.findElement(By.xpath("//div[@id='site-header']/div/ul/li[7]/a")).click();
		browser.findElement(By.xpath("//div[@class='dept-nav-section']/ul/li/a")).click();
		browser.findElement(By.xpath("//div[@id='site-header']/div/ul/li[8]/a")).click();
		browser.findElement(By.xpath("//div[@id='site-header']/div/ul/li[9]/a")).click();
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[10]/a")).click();
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[11]/a")).click();
		browser.findElement(By.xpath("//div[@id='site-header']/div/ul/li[12]/a")).click();
	}
}
