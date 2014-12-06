package com.loopbluefly.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoopBluefly 
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://www.bluefly.com");
		LoopCommon com = new LoopCommon(driver);
		
		//Click all product from New Arrival page
		/*driver.findElement(By.xpath("//div[@id='global-nav']/ul/li[1]/a")).click();
		Thread.sleep(5000);
		int newArrivalProductSize = driver.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(newArrivalProductSize);
		for (int a = 1; a <newArrivalProductSize; a++)
		{
			//System.out.println(+ a);
			driver.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]")).click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
		}*/
		//Click all product from Women page
		/*driver.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("women item");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='global-nav']/ul/li[2]/a")).click();
		com.syso();
		driver.findElement(By.xpath("//div[@class='lp-featured-slot']/ul/li[1]/a/div")).click();
		com.syso();
				
		
		int womanProductSize = driver.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(womanProductSize);
		for (int a = 1; a <womanProductSize; a++)
		{
			driver.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]")).click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
		}*/    
		//Click all product from women page
		
		driver.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("women item");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='global-nav']/ul/li[2]/a")).click();
		com.syso();
		driver.findElement(By.xpath("//div[@class='lp-featured-slot']/ul/li[6]/a/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='productGridContainer']/div[1]")).click();
		com.syso();
		driver.findElement(By.xpath("//div[@class='pdpButtonsContainer']/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pdpSizeListContainer']/span[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='lp-featured-slot']/ul/li[4]/a/div")).click();
		com.syso();
		
		int womanProductSize = driver.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(womanProductSize);
		for(int a = 1; a<womanProductSize; a++)
		{
			driver.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]")).click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
		}
		
	}

}
