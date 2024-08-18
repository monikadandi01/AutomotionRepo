package TestNG.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod2 {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @Test
    public void TestA(){
        System.out.println("Test A");
    }
    @Test
    public void TestB(){
        System.out.println("Test B");
    }
    @Test
    public void TestC(){
        System.out.println("Test C");
    }
}

