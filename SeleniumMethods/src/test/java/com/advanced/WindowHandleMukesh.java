package com.advanced;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleMukesh {

	@Test
	public void TestPopUp() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.naukri.com/");

		String parent = driver.getWindowHandle();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}
		}
		driver.switchTo().window(parent);
	}
}