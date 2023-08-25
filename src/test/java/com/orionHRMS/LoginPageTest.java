package com.orionHRMS;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends SeleniumTest {

    @Test()
    public static void loginTest() {

        element = driver.findElement(By.name("username"));
        element.sendKeys("Admin");
        element = driver.findElement(By.name("password"));
        element.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
