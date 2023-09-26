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
    DialogContent dc=new DialogContent();
    ArrayList<String> al1=new ArrayList<String>();
    ArrayList<String> al2=new ArrayList<String>();
    Actions aksiyonlar=new Actions(GWD.getDriver());
    String a="";
    String b="";

    @Given("Click Dresses category select a random first item")
    public void clickDressesCategorySelectARandomFirstItem() {
        //   GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        dc.Anasayfa.click();
        dc.myClick(dc.Dresses);


        //  [id="product_list"]>li
        List<WebElement> l1 = GWD.getDriver().findElements(By.cssSelector("[id='product_list']>li"));
        System.out.println("l1 = " + l1.get(((int) (Math.random() * l1.size()))).getText());
        Action aksiyon = aksiyonlar.moveToElement(l1.get(((int) (Math.random() * l1.size())))).build(); // element in üzerine gel
        Action aksiyon2 = aksiyonlar.moveToElement(dc.submit).click().build(); // element in üzerine gel
        aksiyon.perform();
        aksiyon2.perform();


        // List<WebElement> l1 = dc.dressler;
        //   System.out.println("l1 = " + l1.get(((int) (Math.random() * l1.size()))).getText());
        //    a=l1.get(((int) (Math.random() * l1.size()))).getTagName();
        //    l1.get(((int) (Math.random() * l1.size()))).click();


        //   dc.myClick(dc.continueshop);
        //   dc.myClick(dc.viewCart);
        //     List<WebElement> l2 = dc.demoview;
        //     for (WebElement a:l2
        //          ) {
        //         System.out.println("l2 = " + a.getText());
        //      }
        //  }
    }
       @When("Click the Add To Cart")
       public void clickTheAddToCart() {
       //    Action aksiyon = aksiyonlar.moveToElement(dc.submit).click().build(); // element in üzerine gel
        //   aksiyon.perform();

      }


        ///   @Then("Navigate to Continue Shopping")
        //   public void navigateToContinueShopping() {
        //       dc.myClick(dc.continueshop);
        // dc.myClick(dc.Dresses);
        // }
//@When("Select different a random second item")
//public void selectDifferentARandomSecondItem() {
// //   dc.myClick(dc.viewCart);
//  //  dc.myClick(dc.Dresses);

//    List<WebElement> l2 = dc.dressler;
//    System.out.println("l1 = " + l2.get(((int) (Math.random() * l2.size()))).getText());
//    b=l2.get(((int) (Math.random() * l2.size()))).getText();
//    l2.get(((int) (Math.random() * l2.size()))).click();

//        if (a.equals(b)) {
//            l2.get(((int) (Math.random() * l2.size()))); }

//    System.out.println("l2 = "
//            + l2.get(((int) (Math.random() * l2.size()))).getText());
//        }
    }