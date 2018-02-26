package com.alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class MukeshAlert {


    @Test
    public void TestAL() throws InterruptedException{

    	System.setProperty("webdriver.gecko.driver", "/Users/mdrayhanuddinsarkar/Downloads/Driver/geckodriver");
        WebDriver driver=new FirefoxDriver();
        //driver.get("http://www.ksrtc.in/site/");
        driver.get("file:///C:/Users/md/Desktop/myAlert.html");
        
        driver.findElement(By.xpath("//input[@value='login2']")).click();

        System.out.println(driver.switchTo().alert().getText());
        
         String actual=driver.switchTo().alert().getText();
         System.out.println("alert message is "+ actual);
          Thread.sleep(2000);

        driver.switchTo().alert().accept();
        String expected="promptbox";
        Assert.assertEquals(actual, expected);
        driver.quit();
    }

}
