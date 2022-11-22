package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class LoginDemoStepDefinitions {

    public WebDriver driver = null;
    @Given("open the browser")
    public void open_the_browser() {

        System.setProperty("webdriver.chrome.driver","C://Users//vpatel//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @And("Enter the url {string}")
    public void enter_the_url(String string) {

        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^User enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username,String password) throws InterruptedException {

        driver.findElement(By.id("name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(3000);
    }

    @And("click on login button")
    public void click_on_login_button() {

        driver.findElement(By.id("login")).click();
    }

    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {

    String capText = driver.findElement(By.xpath("//p[@id='greetings']")).getText();
    Assert.assertEquals(true,capText.contains("Hello Vipra"));
    }

    @And("user selects country from dropdown menu")
    public void user_selects_country_from_dropdown_menu() {

    WebElement country = driver.findElement(By.id("country"));
        Select dropDown = new Select(country);
        dropDown.selectByVisibleText("United States");
    }

    @And("user enter address")
    public void user_enter_address() {

        driver.findElement(By.id("address")).sendKeys("1884 Lackland Hill");
    }

    @And("user enter email")
    public void user_enter_email() {

        driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
    }

    @And("user enter phone number")
    public void user_enter_phone_number() throws InterruptedException {

        driver.findElement(By.id("phone")).sendKeys("314.275.8066");
        Thread.sleep(3000);
    }

    @Then("clicks on logout button")
    public void clicks_on_logout_button() {

        driver.findElement(By.id("logout")).click();
    }


}
