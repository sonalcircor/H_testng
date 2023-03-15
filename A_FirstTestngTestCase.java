import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_FirstTestngTestCase {

    WebDriver driver;


     @Test()
    void openBrowser()throws InterruptedException{
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
         //System.out.println("open browser");

    }
    @Test()
    void login(){

    }
    @Test()
    void closeBrowser(){


    }
}
