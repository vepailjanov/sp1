package basedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testNGelements1 {
    public testNGelements1(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[text()='My addresses']")
    public WebElement myaddress;

    @FindBy(xpath = "//span[text()='Add a new address']")
    public WebElement addNewAddresses;

    @FindBy(css = "input[id=address1]")
    public WebElement newAddress;

    @FindBy(css = "input[id=city]")
    public WebElement newCity;

    @FindBy(css = "select[id=id_state]")
    public WebElement selectState;

    @FindBy(css = "input[id=postcode]")
    public WebElement postcode;

    @FindBy(css = "select[id=id_country]")
    public WebElement selectCountry;

    @FindBy(css = "input[id=phone]")
    public WebElement phone;

    @FindBy(xpath = "//button[@id='submitAddress']/span")
    public WebElement continueButton;

    @FindBy(css = "input[id=alias]")
    public WebElement alies;

    @FindBy(css = "h3[class=page-subheading]")
    public WebElement chekingAddress;

    @FindBy(xpath = "(//a[@class='btn btn-default button button-small']/span)[2]")
    public WebElement updateAddress;

    @FindBy(css = "input[id=firstname]")
    public WebElement firstnmae;

    @FindBy(css = "input[id=lastname]")
    public WebElement lastname;

    @FindBy(xpath = "(//li/span[@class='address_name'])[1]")
    public WebElement updatedfirstnmae;

    @FindBy(xpath = "(//li/span[@class='address_name'])[2]")
    public WebElement updatedlastname;

    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteButton;

    @FindBy(css = "p[class='alert alert-warning']")
    public WebElement deleteMessage;




}
