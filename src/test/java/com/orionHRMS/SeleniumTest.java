package com.orionHRMS;

import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String myTitle = driver.getTitle();
        System.out.println(myTitle);
        System.out.println("Test 2");
    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }

}