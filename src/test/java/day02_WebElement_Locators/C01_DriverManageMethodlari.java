package day02_WebElement_Locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        System.out.println("Ilk size"+driver.manage().window().getSize());
        System.out.println("Ilk position: "+driver.manage().window().getPosition());


        //Ilk size(1051, 798)
        //Ilk position: (9, 9)

        Thread.sleep(2000);

        driver.manage().window().setSize(new Dimension(800,800));
        driver.manage().window().setPosition(new Point(40,100));
        System.out.println("Size: "+driver.manage().window().getSize());
        System.out.println("Position :"+driver.manage().window().getPosition());
        //Size: (803, 803)
        //Position :(40, 100)
        Thread.sleep(2000);













             driver.close();






    }
}
