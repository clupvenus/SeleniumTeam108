package day02_WebElement_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ImplicietyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        Driver`i bir web uygulamasina gonderdidgimizde o sayfanin acilmasi, orada istedigimiz
        islemleri yapmak icin elementleri bulmasi gibi islemler zaman gerektirebilir.
        ImlicitliWait bu tur zaman gerektiren islerde ne kadar  sure bekleyeceginizi anlatir.
         */






    }
}
