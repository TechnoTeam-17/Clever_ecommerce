package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        tags = "@SmokeTest ,@Regression",
        features = {"src/test/java/featureFiles/US_06_Sepete_Eklenen_Urunlerin_Kontrolu.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _US_06_TestRunner extends AbstractTestNGCucumberTests {
}
