package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(


        features = {"src/test/java/featureFiles/US_08_MailGonderme.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class _US_08_ extends AbstractTestNGCucumberTests {
}
