package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(


        features = {"src/test/java/featureFiles/US_03_Kullanici_Hesabina_Yeni_Adres_Ekleme.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _US_03_TestRunner extends AbstractTestNGCucumberTests {


}
