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

    @When("Enter username and password and click Sign in button")
    public void enterUsernameandpasswordandclickSigninButton() {

        dc.mySendKeys(dc.eMail, "hannaesma@gmail.com");
        dc.mySendKeys(dc.password, "hannaesma");
        dc.myClick(dc.SigninButton);
    }


    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
    dc.verifyContainsText(dc.txtCleverLogin,"My account");

    }
}
