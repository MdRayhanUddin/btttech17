package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertUdemy {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/mdrayhanuddinsarkar/Downloads/Driver/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input"))
				.click();

		System.out.println(driver.switchTo().alert().getText());

		// driver.switchTo().alert().sendKeys("fesfe");

		driver.switchTo().alert().accept(); // Accept = ok done yes

		// driver.switchTo().alert().dismiss();

	}

}
