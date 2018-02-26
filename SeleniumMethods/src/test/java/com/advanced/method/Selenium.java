package com.advanced.method;

import java.io.File;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium {
	SafariDriver dr;

	@Test
	public void test() throws Throwable {
		open();
		key();
		//controlKeyboard();
		//drugable();
	}

	public void open() {
//		System.setProperty("webdriver.gecko.driver", "C:\\Driver/geckodriver.exe");
//		dr = new FirefoxDriver();
		dr=new SafariDriver();
	}

	public void controlKeyboard() {
		dr.get("http://www.eshopper24.com");
		Keyboard kb = ((HasInputDevices) dr).getKeyboard();
		kb.sendKeys(Keys.chord(Keys.CONTROL, Keys.ALT, "p"));
		kb.sendKeys(Keys.F5);
	}
	public  void key() {


	dr.get("http://www.google.com");

	Actions act=new Actions(dr);

	act.contextClick(dr.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div[1]/a[2]"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	}

	
	public void drugable() throws Throwable
    {
        dr.get("http://www.jqueryui.com/droppable/");
        dr.switchTo().frame(0);
        WebElement dropable=dr.findElement(By.id("draggable"));//source file
        WebElement moga2=dr.findElement(By.id("droppable"));//target file
        new Actions(dr).dragAndDropBy(dropable, 200, 10).build().perform();//this for anywhere based on pixel
        new Actions(dr).dragAndDrop(dropable, moga2).build().perform();//this for specific place
        Thread.sleep(4000);
    }
}