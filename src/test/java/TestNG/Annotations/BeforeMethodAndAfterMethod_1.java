package TestNG.Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAndAfterMethod_1 {
    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lavanya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void testForRediffMail_1() {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
    }
    @Test
    public void testForAmozon() {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }
    @Test
    public void testForFilpkart() {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }

}

