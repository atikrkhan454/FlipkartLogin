package flipkart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class LoginAndAddToCart {

    WebDriver driver;
    @Test
    void shoppingPage() {

        //Flipkart
        driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input")).sendKeys("7855958892");
        driver.findElement(By.xpath("//div[@class='IiD88i _351hSN'][2]/input")).sendKeys("RaGib@1234");
        driver.findElement(By.xpath("//div[@class='_1D1L_j']/button")).click();

        driver.findElement(By.xpath("//div[@class='_3OO5Xc']/input")).sendKeys("iPhone 12" + Keys.ENTER);
        /*driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 12 (Blue, 128 GB)')]")).click();

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);

        driver.findElement(By.xpath("//*[@class='col col-6-12']/button")).click();*/


    }
    @BeforeTest
    void openurl(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

    }
    @AfterTest
    void closeBrowser()  {
        System.out.println("Successfully Adding");
        //driver.quit();
    }
}
