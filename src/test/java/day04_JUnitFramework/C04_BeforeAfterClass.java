package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SeleniumServerStandaloneManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeAfterClass {
    // 3 test method'u olusturun



    //Eger her bir test methodu icin drive olusturup, sonunda kapatmamaiz gerekmiyorsa
    // classin basinda bir kez driver olusturup, classin sonunda driveri kapatabiliriz.
    //@BeforeClass ve@AfterClass notasyonunu kullanan methodlar STATIC olmalidir.

    static WebDriver  driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }
    @Test
    public void test01(){
        // 1.amazon anasayfaya gidip, amazona gittiginizi test edin
        driver.get("https://www.amazon.com");
        String expectedIcerik="amazon";
        String actualURL=driver.getCurrentUrl();

        if(actualURL.contains(expectedIcerik)){
            System.out.println("Test Amazon Passed");
        }else System.out.println("Test Amazon Failed");
    }
    @Test
    public void test2(){
       // 2.Nutella aratip arama sonuclarinin nutella icerdigini test edin
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella"+ Keys.ENTER);
        WebElement aramaSonucElementi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedIcerik="Nutella";
        String actualSonucYazisi=aramaSonucElementi.getText();
        if (actualSonucYazisi.contains(expectedIcerik)) System.out.println("Nutella Passed");
        else System.out.println("Nutella Failled");
    }
    @Test
    public void test3(){
        // 3.Ilk urune tiklayip, urun isminde Nutella gectigini test edin
        WebElement ilkUrun= driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
        ilkUrun.click();
        WebElement urunIsimElementi= driver.findElement(By.xpath("//span[@id='productTitle']"));
        String expectedIcerik= "Nutella";
        String actualUrunIsmi= urunIsimElementi.getText();
        if (actualUrunIsmi.contains(expectedIcerik)){
            System.out.println("ilk urun testi PASSED");
        }else{
            System.out.println("Ilk urun testi FAILED");
        }

    }


}
