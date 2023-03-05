package day03_xpath_cssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_IlkAssertion {
    //1) Bir class oluşturun: BestBuyAssertions
    //2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak
    //asagidaki testleri yapin
    //○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    //○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //○ logoTest => BestBuy logosunun görüntülendigini test edin
    //○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com/");

    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }
    @Test
    public void test1(){
      // //○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin.

      String actualURL=driver.getCurrentUrl();
      String exceptedUrl="https://www.bestbuy.com/";

        Assert.assertEquals(exceptedUrl,actualURL);

    }
    @Test
    public void test2(){
        //○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        String actualTitle=driver.getTitle();
        String excepted="Rest";
        Assert.assertFalse(actualTitle.contains(excepted));


    }
    @Test
    public void test3(){
        //○ logoTest => BestBuy logosunun görüntülendigini test edin

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/img")).isDisplayed());

    }
    @Test
    public void test4(){
        //○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Français']")).isDisplayed());
    }









}
