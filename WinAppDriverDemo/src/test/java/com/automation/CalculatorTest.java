package com.automation;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;


public class CalculatorTest {

    public static WindowsDriver calculatorSession = null;
    public static WebElement calculatorResult = null;

    @BeforeClass
    public static void setUp() {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("app","Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
            calculatorSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
            calculatorSession.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            calculatorResult = calculatorSession.findElement(By.id("CalculatorResults"));
            Assert.assertNotNull(calculatorResult);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @BeforeClass
    public void Clear(){
        calculatorSession.findElement(By.name("Clear")).click();
        Assert.assertEquals("0",_GetCalculatorResultText());
    }

    @AfterClass
    public static void TearDown() {
        calculatorResult = null;
        if(calculatorSession != null){
            calculatorSession.quit();
        }
        calculatorSession = null;
    }

    @Test
    public void addition(){
        calculatorSession.findElement(By.name("Five")).click();
        calculatorSession.findElement(By.name("Plus")).click();
        calculatorSession.findElement(By.name("Seven")).click();
        calculatorSession.findElement(By.name("Equals")).click();
        Assert.assertEquals("12",_GetCalculatorResultText());
    }

    protected String _GetCalculatorResultText(){
        // trim extra text and whitespace off of the display value
        return calculatorResult.getText().replace("Display is","").trim();
    }

}
