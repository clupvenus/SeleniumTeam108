package Practice.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    /*..........Exercise1............
    BeforeClass ile driver'i olusturun ve class icinde static yapin
    Maximize edin ve 10 sn bekletin
    http://www.google.com adresine gidin
    arama kutusuna "The Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna "Brave Heart" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna "Harry Potter" yazip, cikan sonuc sayisini yazdirin
    AfterClass ile kapatin.
     */
    static WebDriver driver;
 WebElement aramaKutusu;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }





    @Test
    public void test01(){
        driver.get("http://www.google.com");
//cookiesi kaldir
        driver.findElement(By.xpath("//div[text()='Tümünü kabul et']")).click();


        aramaKutusu=driver.findElement(By.xpath("//input[@class='gLFyf']"));
   aramaKutusu.sendKeys("The Lord of the Rings"+ Keys.ENTER);
   WebElement sonuc= driver.findElement(By.xpath("//*[@*='srp EIlDfe']"));
   System.out.println(sonuc.getText());


    }

    @Test
    public void test02(){
        driver.get("http://www.google.com");


        aramaKutusu=driver.findElement(By.xpath("//input[@class='gLFyf']"));
        // arama kutusuna "Brave Heart" yazip, cikan sonuc sayisini yazdirin
        aramaKutusu.sendKeys("Brave Heart"+Keys.ENTER);
        WebElement sonuc2=driver.findElement(By.xpath("//*[@*='srp EIlDfe']"));
        System.out.println(sonuc2.getText());
    }
    @Test
    public void test03(){
        driver.get("http://www.google.com");
        aramaKutusu=driver.findElement(By.xpath("//input[@class='gLFyf']"));
      //  arama kutusuna "Harry Potter" yazip, cikan sonuc sayisini yazdirin.
        aramaKutusu.sendKeys("Harry Potter"+Keys.ENTER);
        WebElement sonuc3=driver.findElement(By.xpath("//*[@*='srp EIlDfe']"));
        System.out.println(sonuc3.getText());
    }




    @AfterClass
    public  void tearDown(){
        driver.close();
}


}
