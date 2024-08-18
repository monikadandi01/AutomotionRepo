package TestNG;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
    public void TestDemoA(){
        System.out.println("Test Demo A");
    }

    @Test(priority = -2)
    public void TestDemoX(){
        System.out.println("Test Demo X");
    }
    @Test(priority = 0)
    public void TestDemoY(){
        System.out.println("Test Demo Y");
    }
    @Test(priority = 'A')
    public void TestDemoB(){
        System.out.println("Test Demo B");
    }
    @Test(priority = 5)
    public void TestDemoC(){
        System.out.println("Test Demo C");
    }
}
