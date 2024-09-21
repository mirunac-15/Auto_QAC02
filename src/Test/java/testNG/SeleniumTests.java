package testNG;

import org.testng.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowsersUtils;

import java.time.Duration;

public class SeleniumTests {
    WebDriver driver;

    @Test
    public void test01() {
        driver = BrowsersUtils.getDriver("chrome");


        driver.navigate().to("https://bibi-shoes.ro/");

        WebElement cont = driver.findElement(By.cssSelector("#menu-item-29874 > a > span"));

        WebElement accountButon = driver.findElement(By.cssSelector("#menu-item-29874 > a > span"));
        accountButon.click();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.clear();
        username.sendKeys("test@test.com");
        password.sendKeys("test");
        WebElement login = driver.findElement(By.name("login"));

        login.click();

    }

    @Test
    public void test02() {


        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.facebook.com/");
        WebElement email = driver.findElement(By.id("email"));
        driver.close();
    }

    @Test
    public void test03() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://57.151.123.81:3000/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement dismissPopup = driver.findElement(By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted"));
        dismissPopup.click();
        // #mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted

        WebElement accountButon = driver.findElement(By.id("navbarAccount"));
        accountButon.click();


        WebElement loginButton = driver.findElement(By.id("navbarLoginButton"));
        loginButton.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement loginText = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-login > div > mat-card > h1")));

        WebElement logintext = driver.findElement(By.cssSelector("body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-login > div > mat-card > h1"));
        Assert.assertEquals(logintext.getText(), "Login", "The site is not on the Log in page");


        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));

        email.clear();
        email.sendKeys("test@test.com");
        password.sendKeys("test");

        driver.quit();

    }
}


