package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getWindowHandle());
        //getWindowHandle selenium tarafindan her driver sayfasi icin uretir.
        //unique handle degerleri dondurur
        //getWindowHandels() ise test edilen butun driver sayfasi icin uretilen sayfalari
        //Set olarak dondurur.




        System.out.println(driver.getPageSource());
        //Sayfa kodlarini dondurur
        //Sayfa kodlari
        String exceptedIcerik="2 hours";
        String actualSayfaKodlar=driver.getCurrentUrl();
           if(actualSayfaKodlar.contains(exceptedIcerik)){
               System.out.println("Tested Passed");
           }   else {
               System.out.println("Tested Failed");
           }

             //Tested Failed


        driver.quit();
        //close(); sadece o sayfayi kapatir
        //quit(); Butun dosyalari kapatir.
    }
}
