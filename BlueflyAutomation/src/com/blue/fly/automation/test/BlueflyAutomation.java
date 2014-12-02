package com.blue.fly.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueflyAutomation 
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver drive = new FirefoxDriver();
		drive.get("http://www.bluefly.com");
		drive.manage().window().maximize();
		System.out.println(drive.getTitle());
		if(drive.getTitle().equals("Bluefly - Designer Clothing, Handbags, Shoes & Accessories (Prada, Fendi, Gucci & more) at Discount Prices"))
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("don't matched");
		}
		Utility com=new Utility(drive);
		com.verifyText("Bluefly");
		//com.verifyTitle("", "new, woman, shoes, handbags & accessories, jewelry, beauty, men, kids, home, gifts, designers, sale");
		WebElement newLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li/a"));
		newLink.click();
		Thread.sleep(5000);
		WebElement womanLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[2]/a"));
		womanLink.click();
		Thread.sleep(5000);
		WebElement shoesLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[3]/a"));
		shoesLink.click();
		Thread.sleep(5000);
		WebElement handbagsLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[4]/a"));
		handbagsLink.click();
		Thread.sleep(5000);
		WebElement jewelryLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[5]/a"));
		jewelryLink.click();
		Thread.sleep(5000);
		WebElement beautyLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[6]/a"));
		beautyLink.click();
		Thread.sleep(5000);
		WebElement menLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[7]/a"));
		menLink.click();
		Thread.sleep(5000);
		WebElement kidsLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[8]/a"));
		kidsLink.click();
		Thread.sleep(5000);
		WebElement homeLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[9]/a"));
		homeLink.click();
		Thread.sleep(5000);
		WebElement giftsLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[10]/a"));
		giftsLink.click();
		Thread.sleep(5000);
		WebElement designersLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[11]/a"));
		designersLink.click();
		Thread.sleep(5000);
		WebElement saleLink=drive.findElement(By.xpath("//div[@id='global-nav']/ul/li[12]/a"));
		saleLink.click();
		Thread.sleep(5000);
		drive.close();
		
		
	}

}
