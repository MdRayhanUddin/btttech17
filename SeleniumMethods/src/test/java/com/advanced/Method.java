package com.advanced;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.Select;

//import com.sun.jna.platform.FileUtils;

public class Method {
	FirefoxDriver dr;

	@Test
	public void test() throws InterruptedException, IOException {
		open();
		 //dropDownMenu();
		 // hoverOver();
		 rightMouseClick();
		 //scrollDownBySelenium();
		 //scrollDownByJavascript();
		  //windowHandle();
		  //screenShot();
	}

	public void ghum(int a) throws InterruptedException {
		Thread.sleep(a);
	}

	public void open() {
		System.setProperty("webdriver.gecko.driver", "/Users/mdrayhanuddinsarkar/Downloads/Driver/geckodriver");
		dr = new FirefoxDriver();
		dr.get("https://www.eshopper24.com/");
		//dr.manage().window().maximize();
	}

	public void screenShot() throws IOException {
		File sf = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(sf, new File("/Users/mdrayhanuddinsarkar/Downloads/TakeScreenShort/pic" + Math.random() * 1000 + ".png"),true);
	
	}

	public void dropDownMenu() {
		dr.get("https://facebook.com");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select s = new Select(dr.findElement(By.id("month")));
		s.selectByVisibleText("Apr");
		int size1 = s.getOptions().size();
		System.out.println(size1);

		Select s2 = new Select(dr.findElement(By.id("day")));
		s2.selectByVisibleText("4");
		int size2 = s2.getOptions().size();
		System.out.println(size2);

		Select s3 = new Select(dr.findElement(By.id("year")));
		s3.selectByVisibleText("2007");
		int size3 = s3.getOptions().size();
		System.out.println(size3);

		for (int i = size1 - 1; i > 0; i--) {
			s.selectByIndex(i);
			System.out.println(i);
		}
		for (int j = size2 - 1; j > 0; j--) {
			s2.selectByIndex(j);
		}
	}

	public void hoverOver() throws InterruptedException {
		dr.navigate().refresh();
		Actions ac = new Actions(dr);
		WebElement e = dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a"));
		ac.moveToElement(e).perform();
		ghum(3000);
	}

	public void rightMouseClick() throws InterruptedException {
		WebElement ele = dr.findElement(By.xpath("html/body/div[4]/header/section[1]/div/div/div[1]/p/a[1]"));
		Actions ac = new Actions(dr);
		ac.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		ghum(3000);
	}

	public void scrollDownBySelenium() throws InterruptedException {
		WebElement ele = dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div[5]/div[1]/div/div[1]/a/img"));
		Coordinates co = ((Locatable) ele).getCoordinates();
		co.inViewPort();
		ghum(3000);
	}

	public void scrollDownByJavascript() throws InterruptedException {
		
		//((JavascriptExecutor)dr).executeScript("scroll(0,850)");//mukesh
		
		WebElement element = dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div[5]/div[1]/div/div[1]/a/img"));
		((JavascriptExecutor) dr).executeScript("arguments[0].scrollIntoView(true);", element);
		ghum(3000);         //stock.overview this is best
		
//		JavascriptExecutor js = ((JavascriptExecutor) dr);
//		js.executeScript("window.scrollTo(0, 850)");
	}

	public void windowHandle() throws InterruptedException {
		//http://seleniumpractise.blogspot.com/
		dr.navigate().refresh();
		
		//dr.get("http://www.naukri.com/");
		
		String pwin = dr.getWindowHandle();
		Set<String> cwin = dr.getWindowHandles();
		
		for (String win : cwin) {
			if (!win.equals(cwin)) {
				dr.switchTo().window(pwin);
				ghum(3000);
				 dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a/b")).click();;
				 ghum(3000);
				 System.out.println("clicked");
			}
		}
	}
}
