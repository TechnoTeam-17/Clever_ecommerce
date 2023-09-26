package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _US_01_Kullanici_Kaydi_Olusturma_Register {
    DialogContent dc = new DialogContent();
    LeftNav In=new LeftNav();

    @Given("Navigate to clever ECommerce register")
    public void navigateToCleverECommerce() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/index.php?controller=authentication&back=my-account");
    }

    @When("Enter click Sign in button")
    public void enterUsernameandpasswordandclickSigninButton() {
        dc.mySendKeys(dc.SigninButton, " ");
        dc.mySendKeys(dc.email,"");
        dc.mySendKeys(dc.password, "");


    }
    @Given("Navigate to Site")
    public void navigateToSite() {
    }

    @When("Click Sign Button")
    public void clickSignButton() {
    }

    @Then("Enter E-mail adress And Password")
    public void enterEMailAdressAndPassword() {
    }

    @And("Click on Sign in")
    public void clickOnSignIn() {
    }
}
