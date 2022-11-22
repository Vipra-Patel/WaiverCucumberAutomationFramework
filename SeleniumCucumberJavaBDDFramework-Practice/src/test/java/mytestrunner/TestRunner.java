package mytestrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src//test//resources//features//LoginDemo.feature",
        glue="stepdefs",
        monochrome=true,
        plugin = {"pretty","html:test-output","json:json_output/cucumber.json"}
)

public class TestRunner {

}
