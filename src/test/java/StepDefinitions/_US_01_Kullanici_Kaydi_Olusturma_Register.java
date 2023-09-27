package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class _US_01_Kullanici_Kaydi_Olusturma_Register {
    DialogContent dc = new DialogContent();

    @Given("Navigate to clever ECommerce register")
    public void navigateToCleverECommerce() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/index.php?controller=authentication&back=my-account");
    }

    @When("Enter click Sign in button")
    public void enterUsernameandpasswordandclickSigninButton() {
        dc.myClick(dc.SigninButton);
        dc.mySendKeys(dc.email,"miriam1@gmail.com");
        dc.myClick(dc.CreateAccount);

    }

    @Then("Enter E-mail adress And Password")
    public void enterEMailAdressAndPassword() {
        dc.mySendKeys(dc.password, "miriam1");
        dc.myClick(dc.title);
        dc.mySendKeys(dc.firstName,"Techno");
        dc.mySendKeys(dc.lastName, "Team");
        dc.mySendKeys(dc.Email,"miriam1@gmail.com");
        dc.mySendKeys(dc.password,"miriam1");
        Select SelectDays = new Select(dc.day);
        SelectDays.selectByValue("22");

        Select SelectMonths = new Select(dc.month);
        SelectMonths.selectByValue("4");


        Select SelectYears = new Select(dc.years);
        SelectYears.selectByValue("2000");





    //    dc.mySendKeys(dc.day,"1");
     //   dc.mySendKeys(dc.month,"March");
      //  dc.mySendKeys(dc.years,"2000");
      dc.myClick(dc.create);



    }

    @And("Click on Sign in")
    public void clickOnSignIn() {
    }
}
