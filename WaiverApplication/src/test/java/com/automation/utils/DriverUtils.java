package com.automation.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverUtils {

    static WebDriver driver;

    public static void createDriver() {

        System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
        driver = new ChromeDriver();

     /* System.setProperty("webdriver.gecko.driver", "src//test//resources//driver//geckodriver.exe");
        driver = new FirefoxDriver();

        System.setProperty("webdriver.edge.driver", "src//test//resources//driver//msedgedriver.exe"); //working fine
        driver = new EdgeDriver();*/

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get(PropertyReader.getProperty("app.url"));
        driver.manage().window().maximize();

    }
    public static WebDriver getDriver() {

        return driver;
    }
}
