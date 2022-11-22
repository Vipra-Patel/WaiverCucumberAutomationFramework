package com.automation;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class CalcTest {

    static WindowsDriver calSession;

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app","Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");

        calSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
        System.out.println(calSession.getSessionId());
        calSession.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));;

        String calName = calSession.findElement(By.id("Header")).getText();
        System.out.println(calName);

        calSession.findElement(By.name("One")).click();
        calSession.findElement(By.name("Plus")).click();
        calSession.findElement(By.name("Nine")).click();
        calSession.findElement(By.name("Equals")).click();


        String result = calSession.findElement(By.id("CalculatorResults")).getText();
        System.out.println(result);
    }
}
