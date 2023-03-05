package day02_WebElement_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_FindElements {
    public static void main(String[] args) throws InterruptedException {
        //Amazon anasayfaya gidin.

        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

 driver.get("https://www.amazon.com");


        //Arama kutusuna Java yazip aratin.
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java");
        aramaKutusu.submit();

        //Arama sonuclarinda cikan resimlerdeki yazilari yazdirin.
        List<WebElement> aramaSonuclariElementList=driver.findElements(By.className("sg-col-inner"));
        System.out.println("Size "+aramaSonuclariElementList.size());
//Bu 86 elementi yazdiralim

        int elementNo=1;
        for (WebElement eachElement:aramaSonuclariElementList
             ) {
            System.out.println(elementNo+" "+eachElement.getText());
            elementNo++;

        }
        Thread.sleep(3000);
        driver.close();
    }
}
