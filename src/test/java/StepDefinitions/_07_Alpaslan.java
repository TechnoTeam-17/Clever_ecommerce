package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_Alpaslan {

    DialogContent dc=new DialogContent();

    @io.cucumber.java.en.Then("Click to Cart")
    public void clickToCart() {
        dc.myClick(dc.viewCart);

    }

    @io.cucumber.java.en.Then("Click to checkout")
    public void clickToCheckout() {
        dc.myClick(dc.proceedCheckOut);
    }

    @io.cucumber.java.en.Then("Choose the delivery address")
    public void chooseTheDeliveryAddress() {
        dc.myClick(dc.address);
        dc.myClick(dc.address);
    }


    @io.cucumber.java.en.Then("Choose the agree terms")
    public void chooseTheAgreeTerms() {
       // dc.myClick(dc.useDeliverAddressAsBillingAddress);
       // dc.myClick(dc.useDeliverAddressAsBillingAddress);
        dc.myClick(dc.termsCheckBox);

    }

    @io.cucumber.java.en.Then("Click to Paypal method")
    public void clickToPaypalMethod() {
        dc.myClick(dc.selectPaypal);
    }

    @io.cucumber.java.en.Then("Assert to error status")
    public void assertToErrorStatus() {
        dc.verifyContainsText(dc.messageBoxForPaypal,"daha sonra tekrar deneyin");

    }

    @io.cucumber.java.en.Then("Navigate to back")
    public void navigateToBack() {
        GWD.getDriver().navigate().back();
    }

    @io.cucumber.java.en.Then("Click to credit card paying method")
    public void clickToCreditCardPayingMethod() {
        dc.myClick(dc.creditCardPaymentMethod);
    }

    @io.cucumber.java.en.Then("Assert to invalid request")
    public void assertToInvalidRequest() {
        dc.verifyContainsText(dc.messageBoxForCreditCard, "Invalid");

    }

    @io.cucumber.java.en.Then("Assert to assure price of product plus delivery")
    public void assertToAssurePriceOfProductPlusDelivery() {

    }

    @io.cucumber.java.en.Then("Click to I confirm the my order")
    public void clickToIConfirmTheMyOrder() {
        dc.myClick(dc.iComfirmMyOrder);
    }

    @io.cucumber.java.en.Then("Assert to the text of _Your order on Xu Clothing is complete_")
    public void assertToTheTextOf_YourOrderOnXuClothingIsComplete_() {
        dc.verifyContainsText(dc.yourOrderSuccessMessage, "Your order on Xu Clothing is complete.");
    }

    @io.cucumber.java.en.Then("Save the order number on the page like VKXXEJRFY")
    public void saveTheOrderNumberOnThePageLikeVKXXEJRFY() {
        System.out.println(dc.orderNumberToSave.getText());
    }

    @Then("Add product to Cart")
    public void addProductToCart() {

        dc.Anasayfa.click();
        dc.myClick(dc.Dresses);
        dc.myClick(dc.productNameArea);
        dc.myClick(dc.addToCartButtonInProductPage);
        GWD.getDriver().navigate().back();
       // Actions aksiyonlar = new Actions(GWD.getDriver());
       // Action aksiyon2 = aksiyonlar.moveToElement(dc.productContainerAreaForEach).build();
       // aksiyon2.perform();// element in üzerine gel
       // dc.myClick(dc.productAddToCartButton);
    }

    @Then("Click to checkout{int}")
    public void clickToCheckout(int arg0) {


    }

    @Then("Click to checkout_LinkTextDegil_")
    public void clickToCheckout_LinkTextDegil_() {
        Actions aksiyonlar = new Actions(GWD.getDriver());
        Action aksiyon2 = aksiyonlar.moveToElement(dc.proceedCheckOut_LinkTextDeil).build();
        aksiyon2.perform();

        dc.myClick(dc.proceedCheckOut_LinkTextDeil);
    }

    @Then("Click to Wire payment method")
    public void clickToWirePaymentMethod() {
        dc.myClick(dc.bankWireMethod);
    }
}
