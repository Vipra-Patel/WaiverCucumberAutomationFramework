package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleSearchStepDefinitions {

     public WebDriver driver = null;
    @Given("Open the browser")
    public void open_the_browser() {
        System.setProperty("webdriver.chrome.driver","C://Users//vpatel//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @When("Enter the URL {string}")
    public void enter_the_url(String string) {
        driver.navigate().to("https://google.com");

    }
    @And("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        driver.findElement(By.name("q")).sendKeys("Automation step by step");

    }
    @When("hits enter")
    public void hits_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        driver.getPageSource().contains("Automation Step by Step: NEVER STOP LEARNING");
        driver.close();
        driver.quit();

    }

}
