package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US_06_Sepete_Eklenen_Urunlerin_Kontrolu {

    DialogContent dc = new DialogContent();
    ArrayList<String> al1 = new ArrayList<String>();
    ArrayList<String> al2 = new ArrayList<String>();
    Actions aksiyonlar = new Actions(GWD.getDriver());
    WebElement a;
    String b = "";

    @Given("Click Dresses category select a random first item")
    public void clickDressesCategorySelectARandomFirstItem() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        //  dc.Anasayfa.click();
        dc.myClick(dc.Dresses);

        List<WebElement> l1 = GWD.getDriver().findElements(By.xpath("//*[@id='product_list']/li[1]/div/div[2]/h5/a"));
        Action aksiyon = aksiyonlar.moveToElement(l1.get(((int) (Math.random() * l1.size())))).build();
        aksiyon.perform();

    }

    @When("Click the Add To Cart")
    public void clickTheAddToCart() {
        WebElement l2 = GWD.getDriver().findElement(By.xpath("//*[@id='product_list']/li[1]/div/div[2]/div[2]/a[1]/span"));
        Action aksiyon2 = aksiyonlar.moveToElement(l2).click().build();
        aksiyon2.perform();
    }


      @Then("Navigate to Continue Shopping")
      public void navigateToContinueShopping() {
          dc.myClick(dc.continueshop);
          dc.myClick(dc.Dresses);
    }
 //   @When("Select different a random second item")
//public void selectDifferentARandomSecondItem() {
// //   dc.myClick(dc.viewCart);
//  //  dc.myClick(dc.Dresses);


}