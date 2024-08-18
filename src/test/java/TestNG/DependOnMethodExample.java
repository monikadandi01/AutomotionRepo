package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethodExample {
    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test
    public void verifyCreateNewUser(){
        System.out.println("Verify Create New User");
    }
    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyFundTransfer(){
        System.out.println("Verify Fund Transfer");
    }
}
