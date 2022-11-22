package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
    public static void main(String[] args) {

     /*   System.setProperty("webdriver.chrome.driver","C:\\Users\\vpatel\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(); */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.nopcommerce.com");

     /*   WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();*/

      /*  WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();*/



    }
}
