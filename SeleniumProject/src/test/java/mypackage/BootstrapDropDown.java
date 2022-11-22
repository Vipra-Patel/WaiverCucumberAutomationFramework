package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BootstrapDropDown {
    public static void main(String[] args)  {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("desktop automation testing tools");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name("btnK")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//span[contains(text(),'Automated Desktop Testing Tool | TestComplete | Sm')]")).click();
        driver.findElement(By.xpath("//a[text()=' Features ']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[text()='Automated UI Testing']")).click();

        driver.findElement(By.xpath("//a[text()=' Enterprise Applications ']")).click();

        driver.findElement(By.xpath("//a[text()=' Integrations ']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[text()='Cucumber for Jira']")).click();





    }
}
