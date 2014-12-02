package com.facebook.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookProject 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver fire=new FirefoxDriver();
		fire.get("http://www.facebook.com");
		Common com=new Common(fire);
		com.type(By.xpath("//input[@id='email']"),"cnahida13@gmail.com");
		Thread.sleep(5000);
		com.type(By.xpath("//input[@id='pass']"),"shipon");
		Thread.sleep(5000);
		WebElement LogInLink=fire.findElement(By.xpath("//input[@id='u_0_n']"));
		com.click(LogInLink);
		Thread.sleep(5000);
		fire.close();
	}

}
