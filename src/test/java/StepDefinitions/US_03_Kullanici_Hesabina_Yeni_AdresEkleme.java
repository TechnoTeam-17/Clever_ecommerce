package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_03_Kullanici_Hesabina_Yeni_AdresEkleme {
    DialogContent dc = new DialogContent();
    @When("Add a new address")
    public void addANewAddress() {
        dc.myClick(dc.siteMap);
        dc.myClick(dc.addresses);
        dc.myClick(dc.newAddress);
        dc.mySendKeys(dc.address1,"200 North Michigan Avenue");
        dc.myClick(dc.state);
        dc.myClick(dc.illinois);
        dc.mySendKeys(dc.city,"Chicago");
        dc.mySendKeys(dc.postcode,"60611");
        dc.mySendKeys(dc.phone,"3099895555");
        dc.mySendKeys(dc.mobilephone,"3094563348");
        dc.mySendKeys(dc.alias,"Chicago Address");
        dc.myClick(dc.save);



    }

    @Then("My Address should be displayed")
    public void myAddressShouldBeDisplayed() {dc.verifyContainsText(dc.verifyAddress,"ADDRESS");
    }
}
