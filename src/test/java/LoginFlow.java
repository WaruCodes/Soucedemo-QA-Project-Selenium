import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginFlow {
    WebDriver driver;

    @BeforeMethod
    public void OpenLinkTestPage(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void HappyPath(){
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));

            System.out.println("Happy Path Test Passed");
    }

    @Test(priority = 2)
    public void InvalidCredentials(){
        driver.findElement(By.id("user-name")).sendKeys("wrong_user");
        driver.findElement(By.id("password")).sendKeys("wrong_password");
        driver.findElement(By.id("login-button")).click();

        String actualError = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        String expectedError = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualError, expectedError);

        System.out.println("Invalid Credentials Test Passed");
    }

    @Test(priority = 3)
    public void EmptyFields() {

        driver.findElement(By.id("login-button")).click();

        String actualError = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        String expectedError = "Epic sadface: Username is required";

        Assert.assertEquals(actualError, expectedError);

        System.out.println("Empty Fields Test Passed");
    }

    @Test(priority = 4)
    public void Logout() {

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Open menu
        driver.findElement(By.id("react-burger-menu-btn")).click();

        // Wait for Logout button and click it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();

        // Verify login page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));

        Assert.assertTrue(driver.findElement(By.id("login-button")).isDisplayed());

        System.out.println("Logout Test Passed");
    }

    @AfterMethod
    public void CloseBrowser() {

        driver.quit();

    }

}
