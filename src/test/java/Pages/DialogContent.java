package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
        // Sevgili PageFactory sen bu sayfanın
        // sahibisin, senden ricam aşağıdaki locatorları
        // ben kullanacağım zaman driver üzerinden
        // bulup başlatıp, bana hazır et.
        // ben artık find element le uğraşmak
        // istemiyorum.
    }
    @FindBy(xpath = "//a[@class='login']")
    public WebElement SigninButton;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement email;

    @FindBy(id = "SubmitCreate")
    public WebElement CreateAccount;

    @FindBy(name = "id_gender")
    public WebElement title;

    @FindBy(id = "customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement Email;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "uniform-days")
    public WebElement day;

    @FindBy(id = "months")
    public WebElement month;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(name = "submitAccount")
    public WebElement create;

    @FindBy(xpath="//input[@id='email']")
    public WebElement eMail;

    @FindBy(xpath="//input[@id='passwd']")
    public WebElement Password;

    @FindBy(id="SubmitLogin")
    public WebElement signinButton;

    @FindBy(css="[class='info-account']")
    public WebElement txtCleverLogin;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement codeInput;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;


    @FindBy(linkText="Sitemap")
    public WebElement siteMap;

    @FindBy(xpath="//a[@href='https://cleverppc.com/prestashop4/index.php?controller=addresses']")
    public WebElement addresses;

    @FindBy(xpath="(//span[text()='Add a new address'])")
    public WebElement newAddress;

    @FindBy(id="address1")
    public WebElement address1;

    @FindBy(id="city")
    public WebElement city;

    @FindBy(id="uniform-id_state")
    public WebElement state;

    @FindBy(xpath="*//option[text()='Illinois']")
    public WebElement illinois;

    @FindBy(id="postcode")
    public WebElement postcode;

    @FindBy(id="phone")
    public WebElement phone;

    @FindBy(id="phone_mobile")
    public WebElement mobilephone;

    @FindBy(id="alias")
    public WebElement alias;


    @FindBy(css="[title='Xu Clothing']")
    public WebElement Anasayfa;
    @FindBy(xpath="(//*[@title='Dresses'])[2]")
    public WebElement Dresses;

    @FindBy(css="[class='right-block']>h5>a")
    public List<WebElement> dressler;

    @FindBy(xpath="//*[span='Add to cart']")
    public WebElement submit;

    @FindBy(css="[class='button-container']>span>span")
    public WebElement continueshop;
    @FindBy(css="[class='shopping_cart']>a")
    public WebElement viewCart;

    @FindBy(css="[class='cart_ref']")
    public List<WebElement> demoview;


    @FindBy(id="submitAddress")
    public WebElement save;

    @FindBy(xpath="//h3[@class='page-subheading']")
    public WebElement verifyAddress;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "addButton": return this.addButton;
            case "saveButton": return this.saveButton;
            case "nameInput": return this.nameInput;
            case "codeInput": return this.codeInput;
            case "sitemap" : return this.siteMap;
            case "addresses" : return this.addresses;
            case "newAddress" : return this.newAddress;
        }

        return null;
    }


    public void deleteItem(String searchText){
        mySendKeys(searchInput, searchText);
        myClick(searchButton); // fuse bar ı çocukları ortaya çıkıyor

        //beklet
        //1. StaleElemetn hatası verdi : erken buldum tez kaybettim
        //dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        //wait.until(ExpectedConditions.stalenessOf(dc.deleteImageBtn)); //olabilir ama herzaman çözmez

        //2.yöntem sayfanın kendi waitini , loding ini yakalayalım. (en sağlam yöntem)
        //fuse-progress-bar/*    -> fuse-progress-bar ın çocukları
        // bu çocukların 0 olana bekle
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);

        // silme ıslemı dıalogların ortak noktası olması sebebıyle buraya aldık. Silme islemi yapacagımız her seferınde tekrar tekrar kod yazmayalım dırekt cagıralım dıye aldık.
    }
}
