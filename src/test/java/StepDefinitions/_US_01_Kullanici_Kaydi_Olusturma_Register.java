package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _US_01_Kullanici_Kaydi_Olusturma_Register {
    DialogContent dc = new DialogContent();

    @Given("Navigate to clever ECommerce register")
    public void navigateToCleverECommerce() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/index.php?controller=authentication&back=my-account");
    }

    @When("Enter click Sign in button")
    public void enterUsernameandpasswordandclickSigninButton() {
        dc.myClick(dc.SigninButton);
        dc.mySendKeys(dc.email,"miriam@gmail.com");
        dc.myClick(dc.CreateAccount);
        dc.mySendKeys(dc.password, "miriam");
        dc.myClick(dc.title);
        dc.mySendKeys(dc.firstName,"Techno");
        dc.mySendKeys(dc.lastName, "Team");
        dc.mySendKeys(dc.Email,"miriam@gmail.com");
        dc.mySendKeys(dc.password,"miriam");
        dc.mySendKeys(dc.day,"1");
        dc.mySendKeys(dc.month,"March");
        dc.mySendKeys(dc.years,"2000");
        dc.myClick(dc.create);




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
