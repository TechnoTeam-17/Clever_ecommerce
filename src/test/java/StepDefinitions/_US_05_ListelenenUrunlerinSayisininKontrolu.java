package StepDefinitions;
import Pages.DialogContent;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _US_05_ListelenenUrunlerinSayisininKontrolu {

    DialogContent dc=new DialogContent();

    @Given("Navigate to dresses")
    public void navigateToDresses() {

        dc.myClick(dc.dressesButton);
    }

    @When("The User is at the dresses page")
    public void userIsAtTheDressesPage() {

        dc.verifyContainsText(dc.dressesText, "Dresses");
    }

    @Then("The User should see there are five products")
    public void userShouldSeeThereAreFiveProducts() {

        dc.verifyContainsText(dc.headingCounter, "5");
    }

    @And("The User counts the number of products listed on the page")
    public void userCountsTheNumberOfProductsListedOnThePage() {

        dc.verifyContainsText(dc.productCount, "5");
    }

    @Then("The user verifies that the count matches the numbers in step three and step four")
    public void userVerifiesThatTheCountMatchesTheNumbersInStepThreeAndStepFour() {

        System.out.println("There are " + dc.allProducts.size()+ " products in total");
    }
}

