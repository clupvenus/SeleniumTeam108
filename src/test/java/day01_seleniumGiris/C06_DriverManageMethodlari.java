package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("maximize size"+driver.manage().window().getSize());
        System.out.println("maximize position"+ driver.manage().window().getPosition());
       //maximize size(1552, 832)
        //maximize position(-8, -8)


        driver.manage().window().fullscreen();
        System.out.println("fullscreen size"+driver.manage().window().getSize());
        System.out.println("fullscreen position"+ driver.manage().window().getPosition());
        //fullscreen size(1536, 864)
        //fullscreen position(0, 0)
    }
}
