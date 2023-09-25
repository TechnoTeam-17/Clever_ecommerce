package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.GWD;
import java.util.List;

public class DialogContent extends Parent {


    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "span[class='category-name']")
    public WebElement dressesText;

    @FindBy(css = "span[class='heading-counter']")
    public WebElement headingCounter;

    @FindBy(xpath = "(//div[@class='product-count'])[1]")
    public WebElement productCount;

    @FindBy(css = "[id='product_list'] > li")
    public List<WebElement> allProducts;

    @FindBy(id = "firstname")
    public WebElement nameInput;

    @FindBy(id = "lastname")
    public WebElement lastnameInput;

    @FindBy(id = "address1")
    public WebElement addressInput;

    @FindBy(id = "city")
    public WebElement cityInput;

    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement zipCode;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "alias")
    public WebElement addressAlias;

    @FindBy(id = "SubmitCreate")
    public WebElement CreateAcc;

    @FindBy(id = "id_gender1")
    public WebElement MrSelect;

    @FindBy(id = "customer_firstname")
    public WebElement Firstname;

    @FindBy(id = "customer_lastname")
    public WebElement LastName;

    @FindBy(xpath="//input[@id='email']")
    public WebElement EmailAdress;

    @FindBy(xpath="//input[@id='passwd']")
    public WebElement password;

    @FindBy(id="SubmitLogin")
    public WebElement SigninButton;

    @FindBy(css="[class='info-account']")
    public WebElement txtCleverLogin;



    public WebElement ElementGet(String element) {
        switch (element) {
            case "nameInput": return this.nameInput;
            case "lastnameInput": return this.lastnameInput;
            case "addressInput": return this.addressInput;
            case "cityInput": return this.cityInput;
            case "zipCode": return this.zipCode;
            case "phone": return this.phone;
            case "addressAlias": return this.addressAlias;
            case "SubmitLogin": return SigninButton;
            case "Email":return EmailAdress;
            case "CreateAcc":return CreateAcc;
            case "Firstname":return Firstname;
            case "LastName":return LastName;
            case "Password":return password;
            case "MrSelect":return MrSelect;
        }

        return null;
    }


}