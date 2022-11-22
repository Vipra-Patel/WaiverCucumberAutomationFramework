package com.automation;


import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class NotepadTest {
    public static WindowsDriver driver = null;

    @BeforeClass
    public void setUp(){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app","C:\\Windows\\System32\\notepad.exe");
            capabilities.setCapability("platformName","Windows");
            capabilities.setCapability("deviceName","WindowsPC");

            try{
                driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities);
            } catch (MalformedURLException e) {
                 e.printStackTrace();
           }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void cleanUp(){

        driver.quit();
    }

    @Test
    public void sendTestText(){
        driver.findElement(By.name("Text Editor")).sendKeys("This is my notepad automation");
        driver.findElement(By.name("Text Editor")).clear();
    }

    @Test
    public void enterTimeAndDateTest(){
        driver.findElement(By.name("Edit")).click();
        driver.findElement(By.name("Time/Date")).click();

    }

}
