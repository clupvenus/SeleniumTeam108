package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        Jar dosyalarini yukleyere seleniumu kullanilir hale getirdik.
        Ancak her bir classin hangi browser ile calismasini istiyorsak
        o browser ile ilgili driveri class da tanimlamamiz lazim.

        Browser ile ilgili tercihimiz dogrultusunda ilgili ayarlari yapmak icin
        Java da ki System class indan setProperty kullanilir.


         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        /*
        Methoda iki parametre ekleyecegiz.
        1. parametre herkes icin ayni
        2. parametre bu driverin dosya yolu
        Herkesin bilgisayarinda farkli olabilir. Windows bilgisayarlarda sonunda .exe yazilmalidir.
        Mac bilgisayarlarda gerekmez.
         */

        WebDriver driver= new ChromeDriver();

        // IStenen sayfaya gitmek icin:
        driver.get("https://amazon.com");

        Thread.sleep(3000);

        driver.close();

    }
}
