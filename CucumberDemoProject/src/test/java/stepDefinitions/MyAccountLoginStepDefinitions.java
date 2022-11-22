package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class MyAccountLoginStepDefinitions {

    public WebDriver driver = null;

    @Given("^Open the browser$")
    public void open_the_browser() throws Throwable {

        System.setProperty("webdriver.chrome.driver","C://Users//vpatel//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @When("^Enter the url \"([^\"]*)\"$")
    public void enter_the_url(String url) throws Throwable {

        driver.get(url);

    }

    @And("^click on My Account Menu$")
    public void click_on_My_Account_Menu() throws Throwable {

        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();

    }

  /*  @And("^Enter registered username and password$")
    public void enter_registered_username_and_password() throws Throwable {
        driver.findElement(By.id("username")).sendKeys("pavanoltraining");
        driver.findElement(By.id("password")).sendKeys("Test@selenium123");
    }*/


  /*  @And("^Enter registered username \"([^\"]*)\" and password \"([^\"]*)\"$")
     public void enter_registered_username_and_password(String user, String pwd) throws Throwable {
       driver.findElement(By.id("username")).sendKeys(user);
       driver.findElement(By.id("password")).sendKeys(pwd);

    }*/

  /*  @When("^Enter registered username and password$")
    public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
        List <List <String>> data=credentials.raw();
        driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));

    }*/

    @When("^Enter registered username and password$")
    public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
        List<Map<String,String>> data=credentials.asMaps(String.class,String.class);
        driver.findElement(By.id("username")).sendKeys(data.get(0).get("user"));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));

    }

    @And("^click on Login button$")
    public void click_on_Login_button() throws Throwable {
        driver.findElement(By.name("login")).click();

    }

    @Then("^User must successfully login to the web page$")
    public void user_must_successfully_login_to_the_web_page() throws Throwable {
       String capText = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong")).getText();
       Assert.assertEquals(true,capText.contains("pavanoltaining"));
       driver.close();

    }

    @Then("^verify login$")
    public void verify_login() throws Throwable {
        String capText = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/ul/li/strong")).getText();
        if(capText.contains("Error"))    //Test for invalid inputs
        {
            Assert.assertTrue("Invalid input - Error Page", true);
        }
        else
        {
            Assert.assertTrue(false);
        }

    }

}


