package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class OrangeHRM {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][1]")).click();

        WebElement uName = driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
        uName.sendKeys("David.Morris");

     /*   driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//span[1]")).click();  //search
        WebElement userName1 = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
        userName1.sendKeys("Micky");*/


        WebElement userRole = driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
        userRole.click();

        Select dropDown = new Select(userRole);
        dropDown.selectByVisibleText("ESS");

        WebElement eName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        eName.sendKeys("David Morris");

        WebElement status = driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"));
        status.click();

        Select s = new Select(status);
        s.selectByVisibleText("Enabled");

        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();





    }
}
