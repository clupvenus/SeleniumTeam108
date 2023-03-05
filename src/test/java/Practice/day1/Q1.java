package Practice.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
    public static void main(String[] args) {

/*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */


//Set Path
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //Bu satirda biz sisteme driverimizi tanitiyoruz.
        //Driverimizin yolunu da gosteriyoruz.

//Create chrome driver
        WebDriver driver=new ChromeDriver();

//Maximize the window

        driver.manage().window().maximize();

//Open google home page https://www.google.com/.

        driver.get("https://www.google.com");



 //On the same class, Navigate to amazon home page https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com/");
        //ilk etapta navigate mi get mi nasil karar veririz?
        // Get methodu daha hizli calisir navigate() ise daha cok bagimli senaryolarda kullaniriz.


 // Navigate back to google
        driver.navigate().back();

//Refresh the page
        driver.navigate().refresh();

//Close/Quit the browser
        //Close sadece oldugunuz sayfayi kapatir Quit tum driveri kapatir.

        driver.quit();
//And last step : print "All Ok" on console
        System.out.println("All ok");

    }
}
