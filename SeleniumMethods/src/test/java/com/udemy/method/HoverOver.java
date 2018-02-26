package com.udemy.method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/mdrayhanuddinsarkar/Downloads/Driver/geckodriver");
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.amazon.com/");
		Actions a=new Actions(dr);
		
//		a.moveToElement(dr.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/div/a[2]"))).build().perform();
		
//		WebElement move=dr.findElement(By.cssSelector("#nav-link-accountList"));
//		a.moveToElement(move).build().perform();
		
		a.moveToElement(dr.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
//		WebElement move=dr.findElement(By.cssSelector("#twotabsearchtextbox"));
//		a.moveToElement(move).contextClick().build().perform();
		
		
	}

}
