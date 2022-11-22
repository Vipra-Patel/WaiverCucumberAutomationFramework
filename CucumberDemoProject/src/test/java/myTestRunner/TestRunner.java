package myTestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features="src//test//resources//features",
        features="C:/Users/vpatel/IdeaProjects/CucumberDemoProject/src/test/resources/features/Hooks.feature",
        glue="stepDefinitions",
        format={"pretty","html:test-output","json:json_output/cucumber.json"},
        dryRun=false,
        monochrome=true,
        strict=false,
       // tags={"@SanityTest"}  //execute only Sanity Tests
       // tags={"@SanityTest, @RegressionTest"} //execute only scenarios which are comes under sanity or regression
       // tags={"@RegressionTest", "@End2End"}  //execute scenarios comes under both Regressions and End2End
       // tags={"@SanityTest","@End2End"}  //execute scenarios comes under both sanity and End2End
          tags={"~@End2End"}  // This will ignore End2End scenarios
       )

public class TestRunner {

}
