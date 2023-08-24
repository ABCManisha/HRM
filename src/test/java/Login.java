//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

//import com.github.dockerjava.api.model.Driver;
public class Login {
      //  WebDriver driver;
      WebDriver driver=  new ChromeDriver();
        @BeforeClass
        public void setup() {
          //   WebDriverManager.chromedriver().setup();
             driver =new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         String   Mytitle = driver.getTitle();
            System.out.println(Mytitle);
        }

  @Test(priority = 1)


  public void title() {

      System.out.println("Test 1");

  }@Test(priority = 2)
          public void loginTest()throws Exception
  {
      System.out.println("Test 2");
     WebElement Username =driver.findElement(By.name("username"));
      //WebDriverWait wait = new WebDriverWait(driver,10); // Wait for up to 10 seconds

      WebElement Password = driver.findElement(By.name("password"));
      WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
      Username.sendKeys("Admin");
        Password.sendKeys("admin123");
       Login.click();
  }

    @AfterClass
    public void teardown() {

        //    driver.quit();
    
}

}
