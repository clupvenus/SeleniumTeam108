package day02_WebElement_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverMEthodlar_Huiswerk {
    public static void main(String[] args) {
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");

        String expectedTitle="facebook";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("facebook title testi passed");
        }
        else System.out.println("facebook title testi failed."
        +"\n Actual title :"+driver.getTitle());
        //facebook title testi failed.
        // Actual title :Facebook - Giriş Yap veya Kaydol


        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String expectedIcerik="facebook";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Facebook url testi passed");
        }else {
            System.out.println("Facebook url testi failed"+"\n Gerceklesen url : "+actualUrl);
        }

        //4.https://www.walmart.com/ sayfasina gidin.

        driver.get("https://www.walmart.com/");
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String walMartexpectedIcerik="Walmart.com";
        String walmartActualTitil=driver.getTitle();
        if(walmartActualTitil.contains(walMartexpectedIcerik)){
            System.out.println("Walmart Title Testi passed");
        }else {
            System.out.println("Walmart Title testi failed.");
        }

        //6. Tekrar “facebook” sayfasina donun

        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.Browser’i kapatin
        driver.close();

    }
}
