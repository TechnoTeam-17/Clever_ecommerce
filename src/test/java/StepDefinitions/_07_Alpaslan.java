package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;

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
    }


    @io.cucumber.java.en.Then("Choose the agree terms")
    public void chooseTheAgreeTerms() {
       // dc.myClick(dc.useDeliverAddressAsBillingAddress);
       // dc.myClick(dc.useDeliverAddressAsBillingAddress);
        dc.termsCheckBox.isSelected();

    }

    @io.cucumber.java.en.Then("Click to Paypal method")
    public void clickToPaypalMethod() {
        dc.myClick(dc.selectPaypal);
    }

    @io.cucumber.java.en.Then("Assert to error status")
    public void assertToErrorStatus() {
    }

    @io.cucumber.java.en.Then("Navigate to back")
    public void navigateToBack() {
    }

    @io.cucumber.java.en.Then("Click to credit card paying method")
    public void clickToCreditCardPayingMethod() {
    }

    @io.cucumber.java.en.Then("Assert to invalid request")
    public void assertToInvalidRequest() {
    }

    @io.cucumber.java.en.Then("Assert to assure price of product plus delivery")
    public void assertToAssurePriceOfProductPlusDelivery() {
    }

    @io.cucumber.java.en.Then("Click to I confirm the my order")
    public void clickToIConfirmTheMyOrder() {
    }

    @io.cucumber.java.en.Then("Assert to the text of _Your order on Xu Clothing is complete_")
    public void assertToTheTextOf_YourOrderOnXuClothingIsComplete_() {
    }

    @io.cucumber.java.en.Then("Save the order number on the page like VKXXEJRFY")
    public void saveTheOrderNumberOnThePageLikeVKXXEJRFY() {
    }
}
