package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"US_05_Listenen Urunlerin Sayisinin Kontrolu.feature"},
        glue={"StepDefinitions"},
//        dryRun = false,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunnerALL extends AbstractTestNGCucumberTests {
    @AfterClass
    public  static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name", "Sokol Rrustemi ");
        ExtentService.getInstance().setSystemInfo("Application Name", "");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo(" ", "");
        ExtentService.getInstance().setSystemInfo(" ", "");
        ExtentService.getInstance().setSystemInfo(" ", "");
        ExtentService.getInstance().setSystemInfo(" ", "");
    }

}