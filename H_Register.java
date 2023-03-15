import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;

import javax.swing.*;
//import org.testng.annotations.AfterClass;

public class H_Register {
    WebDriver driver;
         @BeforeClass
    void OpenBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    void SelectComputer()  {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
         }
           @Test(priority = 2)
    void SelectDesktop()  {
        driver.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();
         }
         @Test(priority = 3)
    void selectItem()  {
             driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
    }
    @Test(priority = 4)
    void addItem()  {
             driver.findElement(By.id("add-to-cart-button-3")).click();
         }
         @Test(priority = 5)
    void ShoppingCart()  {
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();

         }
         @Test(priority = 6)
    void amendQty() throws InterruptedException{
        driver.findElement(By.className("qty-input")).clear();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.id("updatecart")).click();
             Thread.sleep(5000);
             driver.findElement(By.xpath("itemquantity11216")).click();
         }
        @Test(priority = 7)
    void TermsAndCondition()  {
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]/label")).click();
         }
         @Test(priority = 8)
    void checkingOut()  {
        driver.findElement(By.name("checkout")).click();
    }
    @Test(priority = 9)
    void GuestCheckout() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }
    @Test(priority = 10)
    void FirstName() {
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Sonal");
    }
    @Test(priority = 11)
    void LastName() {
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Patel");
    }
    @Test(priority = 12)
    void EmailAddress() {
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("tina_sonal@yahoo.co.in");
        driver.findElement(By.name("BillingNewAddress.Company")).sendKeys("Unify");
    }
    @Test(priority = 13)
    void SelectCountry() throws InterruptedException {
        WebElement Selectcountry = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select = new Select(Selectcountry);
        select.selectByVisibleText("United Kingdom");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("London");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("40 Jubilee Close");
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Northwood");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("Ha2 2DY");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("07594944740");
        driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("07777555555");
        driver.findElement(By.cssSelector("button[class=\"button-1 new-address-next-step-button\"]")).click();
     //  driver.findElement(By.xpath("//*[@id=\"shippingoption_2\"]")).click();
      //WebElement button =  driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]"));
    //   Actions actions = new Actions(driver);
     //  actions.moveToElement(button).click().perform();
     //   button.click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[1]")).click();
        driver.findElement(By.id("paymentmethod_1")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")).click();
      //  driver.findElement(By.xpath("//*[@id=\"opc-payment_info\"]/div[1]")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 14)
    void PaymentInfo() throws InterruptedException {
             WebElement card = driver.findElement(By.id("CreditCardType"));
        Select select2 = new Select(card);
        select2.selectByValue("MasterCard");
        Thread.sleep(2000);
        driver.findElement(By.id("CardholderName")).sendKeys("Mrs. Sonal Patel");
        Thread.sleep(2000);
        driver.findElement(By.id("CardNumber")).sendKeys("4659430307796628");
        Thread.sleep(4000);

        WebElement selectmonth = driver.findElement(By.id("ExpireMonth"));
        Select select3 = new Select(selectmonth);
        select3.selectByValue("10");
        Thread.sleep(4000);
        WebElement selectyear = driver.findElement(By.id("ExpireYear"));
        Select select4 = new Select(selectyear);
        select4.selectByValue("2024");
        Thread.sleep(4000);
        driver.findElement(By.id("CardCode")).sendKeys("690");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")).click();
        Thread.sleep(4000);
         }
    @AfterClass
      void close() {
            driver.close();
    }

}





