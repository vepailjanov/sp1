package basedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class testNG1 extends SatProjBasedriver{
    @Test
            public void addressChangeCode() throws InterruptedException {
        Random random = new Random();
        testNGelements1 testNGelements1 = new testNGelements1(driver);
        testNGelements1.myaddress.click();
        testNGelements1.addNewAddresses.click();
        testNGelements1.newAddress.sendKeys("123 Water St");
        testNGelements1.newCity.sendKeys("Brooklyn");

        WebElement selectState = driver.findElement(By.cssSelector("select[id=id_state]"));

        Select selectstates = new Select(selectState);
        List<WebElement> stateList = selectstates.getOptions();
        int randomstate = random.nextInt(stateList.size());
        selectstates.selectByIndex(randomstate);

        testNGelements1.postcode.sendKeys("11223");

        WebElement selectCountry = driver.findElement(By.cssSelector("select[id=id_country]"));

        Select selectcountry = new Select(selectCountry);
        List<WebElement> countryList = selectcountry.getOptions();
        int randomcountry = random.nextInt(countryList.size());
        selectcountry.selectByIndex(randomcountry);

        testNGelements1.phone.sendKeys("5513334214");
        testNGelements1.alies.clear();
        testNGelements1.alies.sendKeys("my new address");
        testNGelements1.continueButton.click();
        String newAddressname = "my new address";
        Assert.assertEquals(testNGelements1.chekingAddress.getText().toLowerCase(), newAddressname.toLowerCase());
        testNGelements1.updateAddress.click();
        testNGelements1.firstnmae.clear();
        testNGelements1.firstnmae.sendKeys("Jack");
        testNGelements1.lastname.clear();
        testNGelements1.lastname.sendKeys("Jonas");
        testNGelements1.continueButton.click();
        String firstname = "Jack";
        String lastname = "Jonas";
        Assert.assertEquals(firstname.toLowerCase(), testNGelements1.updatedfirstnmae.getText().toLowerCase());
        Assert.assertEquals(lastname.toLowerCase(), testNGelements1.updatedlastname.getText().toLowerCase());
        testNGelements1.deleteButton.click();
//        Thread.sleep(5000);
//        driver.switchTo().alert().accept();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.alertIsPresent()).accept();
        String expected ="No addresses are available. Add a new address";
        String actual = testNGelements1.deleteMessage.getText();
        Assert.assertEquals(expected.toLowerCase(),actual.toLowerCase() );
    }
}
