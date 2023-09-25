package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.When;

public class US_03_Kullanici_Hesabina_Yeni_Adres {
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
        dc.mySendKeys(dc.alias,"Chicago Address");


    }
}
