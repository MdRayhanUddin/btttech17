package com.udemy.method;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/mdrayhanuddinsarkar/Downloads/Driver/geckodriver");
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("https://www.facebook.com/");
		
		System.out.println(dr.getTitle());
		System.out.println("before switching");
		
		dr.findElement(By.cssSelector(".gb_P")).click();
		System.out.println(dr.getTitle());
		System.out.println("after switching");
		
		Set<String> ids=dr.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		String Parentid=it.next();
		String childid=it.next();
		
		dr.switchTo().window(childid);
	
		System.out.println(dr.getTitle());
		
		dr.switchTo().window(Parentid);
		System.out.println("after switching");
		System.out.println(dr.getTitle());
		
		
	}

}
