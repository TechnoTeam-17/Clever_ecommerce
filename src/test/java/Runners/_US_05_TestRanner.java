package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest ",
        features = {"src/test/java/featureFiles/US_05_Listenen Urunlerin Sayisinin Kontrolu.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _US_05_TestRanner extends AbstractTestNGCucumberTests {
}
