package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOfTestng {
    @Test
    public void TestCase_1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lavanya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        driver.close();
}
    @Test
    public void Testcase_2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lavanya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.close();

    }
}
