package TestNG.Annotations;

import org.testng.annotations.*;

public class BeforeAfterClassMethod3 {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
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
