package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class iCashierDemo {

  public static void main(String[] args) throws MalformedURLException, InterruptedException {



        DesktopOptions option = new DesktopOptions();

        option.setApplicationPath("C:\\Program Files (x86)\\Intercard Inc\\iCashier\\AppStart.exe");

        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);

        Thread.sleep(2000);

        driver.findElement(By.id("label1")).sendKeys("Vipra");

        driver.findElement(By.id("label2")).sendKeys("Vipra1080");

        driver.findElement(By.id("button5")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("Pizza by the Slice")).click();

        driver.findElement(By.name("Tender $4.00")).click();

        driver.findElement(By.name("Cash")).click();

        driver.findElement(By.id("btnCash10")).click();

        driver.findElement(By.id("btnSaleAmount")).click();



    }
}
