package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US_08_Alpaslan {

    DialogContent dc = new DialogContent();

    @When("Click to Contact Us")
    public void clickToContactUs() {
        dc.myClick(dc.contactUs);
    }

    @io.cucumber.java.en.Then("User can fill the information boxes")
    public void userCanFillTheInformationBoxes() {

    }

    @Then("User can select Customer service")
    public void userCanSelectCustomerService() {
        dc.selectEngine("id_contact", 1);
    }

    @Then("Use can put an email address")
    public void useCanPutAnEmailAddress() {
        dc.mySendKeys(dc.Email, "team17@gmail.com");
    }

    @Then("Use can put an order reference number")
    public void useCanPutAnOrderReferenceNumber() {
        dc.selectEngine("id_order", 1);

    }

    @Then("Use can upload a document jpeg")
    public void useCanUploadADocumentJpeg() {
    }

    @Then("Use can write a message")
    public void useCanWriteAMessage() {
        dc.mySendKeys(dc.messageBox, "Banka havalesi henüz yapıldı, ödeme dekontu ektedir. İsim Soyisim\" yazmalıdır.");
    }

    @Then("Use can click submit")
    public void useCanClickSubmit() {
        dc.myClick(dc.submitMessage);
    }

    @Then("Use verify of successfully sent message")
    public void useVerifyOfSuccessfullySentMessage() {
        dc.verifyContainsText(dc.yourOrderSuccessMessage, "successfully");
    }

    @Then("Use can select the product to issue")
    public void useCanSelectTheProductToIssue() throws AWTException {
        //  Robot rbt=new Robot();
        //  for (int i = 0; i < 26; i++) {
        //      rbt.keyPress(KeyEvent.VK_TAB);
        //      rbt.keyRelease(KeyEvent.VK_TAB);
        //  }

        //  rbt.keyPress(KeyEvent.VK_DOWN);
        //  rbt.keyRelease(KeyEvent.VK_DOWN);


       // dc.myClick(dc.selectProduct2);
        dc.selectEngine("id_product", 1);
    }
}
