package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsFindElements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        // findElement --> Return the single Web Element

      /*  WebElement searchBox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchBox.sendKeys("xyz");

        WebElement ele=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(ele.getText()); */

        // findElements --> Returns multiple Web Elements

        List<WebElement>links=driver.findElements(By.xpath(" //div[@class='footer-upper']//a"));
        System.out.println("Number of elements captured:"+links.size());

        for (WebElement ele:links) {
            System.out.println(ele.getText());
        }






    }
}
