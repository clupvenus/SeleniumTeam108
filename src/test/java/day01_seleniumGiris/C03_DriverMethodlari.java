package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {

        public static void main(String[] args) throws InterruptedException {

                System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

                WebDriver driver= new ChromeDriver();

                driver.manage().window().maximize();

                //Amazon ana sayfaya gidin ve
                driver.get("https://www.amazon.com");
                //Gittiginiz sayfadaki title ve url yi yazdirin.
                System.out.println("URL :"+driver.getCurrentUrl());
                System.out.println("Baslik :"+driver.getTitle());
                 Thread.sleep(3000);


                //Amazon Anasayfaya gittiginiz test edin.
                //TEST EXPected ILE ACTUAL result in karsilastirilmasidir.
                String expectedIcerik= "amazon" ;
                String actualUrl = driver.getCurrentUrl();


                if (actualUrl.contains(expectedIcerik)){
                        //Amazon anasayfaya gittiysek
                        System.out.println("Test PASSED");
                }else {
                        System.out.println("Test FAILED");

                }
                driver.close();
        }
}
