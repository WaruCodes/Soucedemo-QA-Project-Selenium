import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SanityTest {
    @Test
    public void googleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        //driver.findElement(By.name("q")).sendKeys("Colombo" + Keys.ENTER);
        //driver.quit();
    }
}
