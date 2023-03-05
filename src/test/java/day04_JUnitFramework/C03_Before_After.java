package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Before_After {

    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("Before calisti");
    }
    @After
    public void teardown(){
        driver.close();
        System.out.println("Teardown calisti");
    }


    @Test
    public void test01(){

    driver.get("https://www.wisequarter.com");
        System.out.println("test1 calisti");

}
    @Test
    public void test02(){

        driver.get("https://www.youtube.com");
        System.out.println("test 2 calisti");

    }
}
