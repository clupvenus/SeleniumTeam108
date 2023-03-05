package day02_WebElement_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_AutomationExercises {
    public static void main(String[] args) throws InterruptedException {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkElementleriList=driver.findElements(By.tagName("a"));
        int exceptedLinkSayisi=147;
        int actualLinkSayisi=linkElementleriList.size();
        if (exceptedLinkSayisi==actualLinkSayisi) {System.out.println("Link sayisi PAssed");}
        else {System.out.println("Link Sayisi Failled");}
        //4- Products linkine tiklayin
        driver.findElement(By.linkText(" Product")).click();

        //5- special offer yazisinin gorundugunu test edin

        WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));
        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer testi PASSED");
        }else{
            System.out.println("Special offer testi FAILED");
        }

        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();



    }
}
