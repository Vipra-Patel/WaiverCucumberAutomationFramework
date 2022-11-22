package automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class DriverUtils {

    static WebDriver driver;

    public static void createDriver() {

        System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.manage().window().maximize();

    }
    public static WebDriver getDriver() {

        return driver;
    }
}
