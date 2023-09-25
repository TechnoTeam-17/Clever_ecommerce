package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _US_02_LoginStep {
    DialogContent dc = new DialogContent();

    @Given("Navigate to clever ECommerce login")
    public void navigateToCleverECommerce() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/index.php?controller=authentication&back=my-account");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.mySendKeys(dc.eMail, "TechnoTeam17@gmail.com");
        dc.mySendKeys(dc.password, "Techno17");
    }


    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
    }
}
