package com.orionHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPageTest extends SeleniumTest {

    @Test()
    public static void loginTest() throws Exception {

        //WebDriverWait wait = new WebDriverWait(driver,10); // Wait for up to 10 seconds

        WebElement Username = driver.findElement(By.name("username"));
        WebElement Password = driver.findElement(By.name("password"));
        WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
        Username.sendKeys("Admin");
        Password.sendKeys("admin123");
        Login.click();
    }

}
