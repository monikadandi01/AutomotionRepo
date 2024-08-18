package TestNG.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void VerifyHomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lavanya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement forgotPasswordElement = driver.findElement(By.xpath("//u[text()='Forgot Password?']"));
        Assert.assertTrue(forgotPasswordElement.isDisplayed(), "This element should be displayed");

        WebElement CreateANewElement = driver.findElement(By.xpath("//u[text='Create a new account']"));
        Assert.assertEquals(CreateANewElement.getText(),"Create A New account", "This text should match");
        driver.close();
    }
}
