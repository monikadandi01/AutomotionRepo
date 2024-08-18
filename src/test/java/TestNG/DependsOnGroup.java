package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test(enabled = false)
    public void verifyCreateNewUser(){
        System.out.println("Verify Create New User");
    }
    @Test(dependsOnGroups = {"smoke"}, alwaysRun = true)
    public void verifyFundTransfer(){
        System.out.println("Verify Fund Transfer");
    }
}
