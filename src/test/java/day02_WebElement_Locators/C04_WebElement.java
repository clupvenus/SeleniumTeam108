package day02_WebElement_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //amazon sayfasina gidin
        driver.get("https://www.amazon.com");
        //arama kutusunu locate edip bir web element olarak kaydedin.


        //id si twotabsearchtextbox olan webelement seklinde locate edecegiz.Aciklamayi oku.
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //arama kutusuna "Nutella" yazip aratin.

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();
        Thread.sleep(3000);
        driver.close();


        /*Driver a web lementini tarif etme islemine Locate,

        Bu tarifi yapabilmak icin kullanbilecegim degiskenlere de locator denir.

        8 tane Locator var.dir
        Locator lerin 6 tanesi Web lementinin ozelliklerine baglidir.
        -id
        -class name
        -name
        -tag name
        -link text
         -partiallinkText
         Geriye kalan 2 locator ise her turlu web elementi locate etmek icin kullanilabilir.
         -xpath
         -cssSelector
         */





    }
}
