package com.udemy.method;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCheckbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/mdrayhanuddinsarkar/Downloads/Driver/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://spicejet.com/");
		
//		**********Playing with special dropdown***********************

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		
		
//		**********Playing with dropdown***********************

//		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
//
//		dropdown.selectByIndex(4);
//
//		dropdown.selectByVisibleText("9");
//
//		dropdown.selectByValue("8");
		
//		**********Playing with checkbox**********************

//		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
//		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
//		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
//		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
//		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	}
}
