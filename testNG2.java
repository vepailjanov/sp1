package basedriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testNG2 extends SatProjBasedriver{
    @Test
    public void secondPart() {
        testNGelements2 testNGelements2 = new testNGelements2(driver);
        testNGelements2.dressesButton.click();
        testNGelements2.clickingItem.click();
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(testNGelements2.addingToWishlist)).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(testNGelements2.xbutton)).click();
        testNGelements2.myaccount.click();
        testNGelements2.myWishlist.click();
        String mywishlistItem =testNGelements2.myWishlistItem.getText();
        String items = "1";
        Assert.assertEquals(mywishlistItem,items);
        testNGelements2.removingItem.click();
        webDriverWait.until(ExpectedConditions.alertIsPresent()).accept();


    }
}
