import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class E2EPurchaseFlow {

    WebDriver driver;

    @BeforeMethod
    public void OpenLinkTestPage(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void CompletePurchaseFlow() {

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Add first product
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        // Add second product
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        // Verify cart badge count
        String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals(cartCount, "2");

        System.out.println("Cart badge count verified.");

        // Open Cart
        driver.findElement(By.className("shopping_cart_link")).click();

        // Verify products in cart
        Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));
        Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Bike Light"));

        System.out.println("Products verified in cart.");

        // Checkout
        driver.findElement(By.id("checkout")).click();

        // Fill checkout information
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("12345");

        driver.findElement(By.id("continue")).click();

        // Verify order summary
        Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));
        Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Bike Light"));

        String total = driver.findElement(By.className("summary_total_label")).getText();
        Assert.assertTrue(total.contains("Total"));

        System.out.println("Order summary verified.");

        // Finish order
        driver.findElement(By.id("finish")).click();

        // Verify confirmation message
        String confirmation = driver.findElement(By.className("complete-header")).getText();

        Assert.assertEquals(confirmation, "Thank you for your order!");

        System.out.println("Purchase completed successfully.");

        }
    }
