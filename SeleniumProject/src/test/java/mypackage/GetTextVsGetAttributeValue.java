package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class GetTextVsGetAttributeValue {
    public static void main(String[] args) {

      //   System.setProperty("webdriver.chrome.driver","src//test//resources//driver//chromedriver.exe");

         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();

         driver.get("https://admin-demo.nopcommerce.com/login");

         driver.manage().window().maximize();

         WebElement emailInputBox=driver.findElement(By.id("Email"));
         emailInputBox.clear();
         emailInputBox.sendKeys("admin123@gmail.com");



    }
}
