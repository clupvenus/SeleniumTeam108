package day05_assertions_dropdownMenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
import utilities.TestBaseClass;

public class C07_JavaScriptAllert extends TestBase {



    // Gerekli ayarlamalari yapip
// https://the-internet.herokuapp.com/javascript_alerts  adresine gidin

    @Test
    public void test01(){
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // 1.alert'e tiklayalim
// Alert'deki yazinin "I am a JS Alert" oldugunu test edelim
// OK tusuna basip alert'i kapatalim
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        String exceptedAllertYazisi="I am a JS Alert";
        String actualAllertYazisi=driver.switchTo().alert().getText();
        Assert.assertEquals(exceptedAllertYazisi,actualAllertYazisi);

        driver.switchTo().alert().accept();

    }


// 2.alert'e tiklayalim
// cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
@Test
    public void test02(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        String actualSonucYazisi=driver.findElement(By.id("result")).getText();
        String expectedSonucYazisi="You clicked: Cancel";

        Assert.assertEquals(expectedSonucYazisi,actualSonucYazisi);
    }


// 3.alert'e tiklayalim
// Cikan prompt ekranina "Abdullah" yazdiralim ve OK tusuna basarak alert'i kapatalim
// Cikan sonuc yazisinin Abdullah icerdigini test edelim


@Test
     public void test03(){
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
    driver.switchTo().alert().sendKeys("Humeyra");
    driver.switchTo().alert().accept();
    String actualText=driver.findElement(By.id("result")).getText();
    String expectedText="Humeyra";
    Assert.assertTrue(actualText.contains(expectedText));





}





}