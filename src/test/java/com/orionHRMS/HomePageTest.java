package com.orionHRMS;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTest extends SeleniumTest{
    @Test
    public void nabBar() {

        LoginPageTest.loginTest();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button")).click();
    }
}
