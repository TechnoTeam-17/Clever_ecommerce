package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

            tags = "@SmokeTest ",
            features = {"src/test/java/featureFiles/US_01_Kullanici Kaydi Olusturma(Register).feature"},
            glue={"StepDefinitions"},
            plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    )
    public class _US_01_Kullanici_Kaydi_Olusturma_Register extends AbstractTestNGCucumberTests{
    }

