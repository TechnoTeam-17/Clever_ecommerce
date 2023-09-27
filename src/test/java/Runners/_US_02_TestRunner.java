package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest ",
        features = {"src/test/java/featureFiles/US_02_Kullanici Grisi Yapabilme.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _US_02_TestRunner extends AbstractTestNGCucumberTests{
}
