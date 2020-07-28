package basedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testNGelements2 {
    public testNGelements2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//a[text()='Dresses'])[2]")
    public WebElement dressesButton;

    @FindBy(xpath = "(//h5[@itemprop='name']/a)[1]")
    public WebElement clickingItem;

    @FindBy(css = "a[id=wishlist_button]")
    public WebElement addingToWishlist;

    @FindBy(css = "a[title=Close]")
    public WebElement xbutton;

    @FindBy(css = "a[class=account]")
    public WebElement myaccount;

    @FindBy(xpath = "//span[text()='My wishlists']")
    public WebElement myWishlist;

    @FindBy(css = "td[class='bold align_center']")
    public WebElement myWishlistItem;

    @FindBy(css = "i[class=icon-remove]")
    public WebElement removingItem;

}
