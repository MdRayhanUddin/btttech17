package com.advanced;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverMukesh {
	
	WebDriver dr;
	 
	@Test
	public void test() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","/Users/mdrayhanuddinsarkar/Downloads/Driver/chromedriver");
		
		dr= new ChromeDriver();
		dr.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	    
		WebElement ele=dr.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act=new Actions(dr);
		
		act.moveToElement(ele).perform();
		
		List<WebElement> links=dr.findElements(By.xpath("//div[@class='dropdown-content']//a"));
	    int total_count=links.size();
	    for(int i=0; i<total_count; i++) {
	    	
	    	WebElement element =links.get(i);
	    	
	    	String text=element.getAttribute("innerHTML");
	    	
	    	boolean status =element.isEnabled();
	    	
	    	System.out.println("Links name is " + text +" and the status is "+ status);
	    	
	    	if(text.equalsIgnoreCase("appium")) {
	    		element.click();
	    		break;
	    	}
	    }
	}

}
