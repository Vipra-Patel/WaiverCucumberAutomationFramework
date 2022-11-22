package com.automation;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestMaps {
     public WindowsDriver driver = null;

     @BeforeMethod
     public void setUp(){
          DesiredCapabilities cap = new DesiredCapabilities();
          cap.setCapability("app"," Microsoft.WindowsMaps_8wekyb3d8bbwe!App");
          cap.setCapability("platformName","Windows");
          cap.setCapability("deviceName","WindowsPC");

          try {
               //create web driver instance
               driver = new WindowsDriver(new URL("http://127.0.0.1:4724/wd/hub"), cap);
          } catch (MalformedURLException e) {
               e.printStackTrace();
          }
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }
     @AfterMethod
     public void teardown() {
          System.out.println("test run successful");
     }
     @Test
     public void findOfficeRoute() {
          driver.findElement(By.name("Search")).sendKeys("BrowserStack Mumbai");
          driver.findElement(By.name("Search")).sendKeys(Keys.ENTER);
          driver.findElement(By.name("Directions")).click();
          driver.findElement(By.name(", My location, ")).click();
          driver.findElement(By.name("Get directions")).click();

     }
}
