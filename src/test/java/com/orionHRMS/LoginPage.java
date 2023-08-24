package com.orionHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPage extends SeleniumTest {
//    @Test(priority = 1)
//    public void title() {
//        System.out.println("Test 1");
//    }

    @Test(priority = 2)
    public void loginTest() throws Exception {

        //WebDriverWait wait = new WebDriverWait(driver,10); // Wait for up to 10 seconds

        WebElement Username = driver.findElement(By.name("username"));
        WebElement Password = driver.findElement(By.name("password"));
        WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
        Username.sendKeys("Admin");
        Password.sendKeys("admin123");
        Login.click();
    }

}
