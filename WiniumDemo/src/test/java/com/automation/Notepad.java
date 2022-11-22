package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Notepad {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesktopOptions option = new DesktopOptions();

        option.setApplicationPath("C:\\Windows\\System32\\notepad.exe");

        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);

        Thread.sleep(3000);

        driver.findElement(By.name("Edit")).sendKeys("Hello world!");


        driver.findElement(By.name("File")).click();

        driver.findElement(By.id("TextBlock")).click();


        driver.findElement(By.name("Don't save")).click();






    }
}
