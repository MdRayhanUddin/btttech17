package com.alert;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BtcAlart {

	FirefoxDriver dr;

	@Test
	public void m1() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver/geckodriver.exe");
		dr = new FirefoxDriver();
		dr.get("file:///C:/Users/md/Desktop/myAlert.html");
		
		dr.findElement(By.xpath("//input[@value='login']")).click();
		Thread.sleep(2000);
		Alert a = dr.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@value='login1']")).click();
		Thread.sleep(2000);
		a.dismiss();
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@value='login2']")).click();
		System.out.println(a.getText());
		Assert.assertTrue(a.getText().equals("hello"));
		Thread.sleep(2000);
		a.sendKeys("hi");
		Thread.sleep(2000);
		a.accept();
		
		
		
		Thread.sleep(2000);
		dr.quit();

	}

}
