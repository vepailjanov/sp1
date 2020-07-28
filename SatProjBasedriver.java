package basedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SatProjBasedriver {
        protected WebDriver driver;
        @BeforeMethod
        @Parameters({"browser"})
        public void beforemethod (String browserStr) {

            if (browserStr.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "/Users/vepailjanov/Desktop/selenium/drivers/chromedriver");
                driver = new ChromeDriver();
            }else  if (browserStr.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "/Users/vepailjanov/Desktop/selenium/drivers/geckodriver");
                driver = new FirefoxDriver();
            }
            driver.manage().window().maximize();
            driver.get("http://automationpractice.com/index.php");
            driver.findElement(By.linkText("Sign in")).click();
            WebDriverWait webDriverWait = new WebDriverWait(driver,10);
            webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[id=email]"))).sendKeys("vepa.iljanov@gmail.com");
            driver.findElement(By.cssSelector("input[id=passwd]")).sendKeys("vepashka2019");
            driver.findElement(By.cssSelector("button[id=SubmitLogin]")).click();
        }

        @AfterMethod
        public void aftermethod(){
//        driver.quit();
        }
    }

