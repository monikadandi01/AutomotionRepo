package TestNG;

import org.testng.annotations.Test;

public class InvocationCountExample {
 /*   @Test(invocationCount = 8)
    public void methodForRepetition(){
        System.out.println("Hello Everyone...Good Evening...");

    }*/



 @Test(invocationCount = 100000, invocationTimeOut = 1)
 public void methodForRepetition(){
     System.out.println("Hello Everyone...Good Evening...");

 }
}
