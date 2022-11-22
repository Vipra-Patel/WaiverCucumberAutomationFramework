package com.automation;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class PosTest {
     static WindowsDriver driver;

    @BeforeClass
    public void setUp() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app", "C:\\Program Files (x86)\\Intercard Inc\\iCashier\\AppStart.exe");
        cap.setCapability("platformName", "Windows");
        cap.setCapability("deviceName", "WindowsPC");

        try {
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

   /* @AfterMethod
    public void cleanUp()  {
        driver.quit();
    }*/

    @Test
    public void userCanLoginTest() {
        driver.findElement(By.name("User Name")).sendKeys("Vipra");
        driver.findElement(By.name("Password")).sendKeys("Vipra1080");
        driver.findElement(By.name("Log In")).click();

    }

    @Test
    public void myFirstTestcase(){
        driver.findElement(By.name("Kids Cheese Pizza")).click();
        driver.findElement(By.name("Extra cheese")).click();
        driver.findElement(By.id("ctl3dPushButton3")).click();
        driver.findElement(By.name("Cash")).click();
        driver.findElement(By.id("btnCash10")).click();
        driver.findElement(By.name("Sale Amount")).click();


    }




}