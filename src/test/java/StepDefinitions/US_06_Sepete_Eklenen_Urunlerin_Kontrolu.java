
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
    Actions aksiyonlar = new Actions(GWD.getDriver());
    int d=0;
    @Given("Click Dresses category select a random item")
    public void clickDressesCategorySelectARandomItem() {

        dc.myClick(dc.Dresses);

        for (int i = 1; i <4 ; i++) {
            List<WebElement> l1 = GWD.getDriver().findElements(By.xpath("//*[@id='product_list']/li/div/div[2]/h5/a"));
            List<WebElement> l2 = GWD.getDriver().findElements(By.xpath("//*[@id='product_list']/li/div/div[2]/div[2]/a[1]/span"));

            int rndSayi1 = ((int) (Math.random() * (4))+1);
          //  System.out.println("rndSayi = " + rndSayi1);
          //  System.out.println(d);
            while (rndSayi1==d) {
                rndSayi1 = ((int) (Math.random() * (4)) + 1);
          //      System.out.println("-----------------");
            }
            Action aksiyon = aksiyonlar.moveToElement(l1.get(rndSayi1)).build();
            aksiyon.perform();

            Action aksiyon2 = aksiyonlar.moveToElement(l2.get(rndSayi1)).click().build();
            aksiyon2.perform();

            al1.add(l1.get(rndSayi1).getText());
            l1.remove(l1.get(((int) (Math.random() * l1.size())))); // l1 den dustuk o urunu

            dc.myClick(dc.continueshop);
            dc.myClick(dc.Dresses);
            d=rndSayi1;
        }
    //    for (String df:al1) {
    //        System.out.println("df = " + df);
    //    }

    }


    @When("Verify all products in the shopping cart")
    public void verifyAllProductsInTheShoppingCart() {
        WebElement cart = GWD.getDriver().findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a/b"));
        cart.click();

        List<WebElement> wl1 = GWD.getDriver().findElements(By.xpath("//tr[contains(@id,'product')]/td[2]/p/a"));
    //    for (WebElement wq:wl1) {
    //        System.out.println("wq = " + wq.getText());
    //    }

        for (int i = 0; i < wl1.size(); i++) {
            if (al1.get(i).equals(wl1.get(i).getText())) {
                System.out.println(i+1 + ". ci" + " urun ayni");
            }
        }
    }
}
