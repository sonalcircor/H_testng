import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;

public class H_Register {
    WebDriver driver;

    @Test(priority = 1)
        // @BeforeClass
    void OpenBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    void SelectComputer() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        // WebElement Computers = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        Thread.sleep(5000);

    }


    @Test(priority = 3)
    void SelectDesktop() throws InterruptedException {
        driver.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();

        Thread.sleep(5000);
    }

    @Test(priority = 4)
    void selectItem() throws InterruptedException {

        // driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
    }

    @Test(priority = 5)
    void addItem() throws InterruptedException {

        //driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.id("add-to-cart-button-3")).click();

        Thread.sleep(5000);
    }

    @Test(priority = 6)
    void ShoppingCart() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        Thread.sleep(5000);


    }

    @Test(priority = 7)
    void amendQty() throws InterruptedException {
        driver.findElement(By.className("qty-input")).clear();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.id("updatecart")).click();
        driver.findElement(By.xpath("itemquantity11216")).click();


        Thread.sleep(5000);

    }

    @Test(priority = 8)
    void updateItem() throws InterruptedException {

        driver.findElement(By.id("updatecart")).click();
        //driver.findElement(By.id("id=\"updatecart\"")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 9)
    void TermsAndCondition() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]/label")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 10)
    void checkingOut() throws InterruptedException {
        driver.findElement(By.name("checkout")).click();
        Thread.sleep(5000);
    }


    @Test(priority = 11)
    void GuestCheckout() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }

    @Test(priority = 12)
    void FirstName() {
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Sonal");
    }

    @Test(priority = 13)
    void LastName() {
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Patel");
    }

    @Test(priority = 14)
    void EmailAddress() {
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("tina_sonal@yahoo.co.in");
        driver.findElement(By.name("BillingNewAddress.Company")).sendKeys("Unify");
    }

    @Test(priority = 15)
    void SelectCountry() {
        WebElement Selectcountry = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select = new Select(Selectcountry);
        select.selectByVisibleText("United Kingdom");


        // @Test(priority = 16)
        //void State(){
        //WebElement Selectstate = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        // Select select = new Select(Selectstate);
        //  select.selectByVisibleText("other");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("London");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("40 Jubilee Close");
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Northwood");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("Ha2 2DY");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("07594944740");
        driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("07777555555");

       driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
      // driver.findElement(By.xpath("//*[@id=\"shipping-methods-form\"]/ul/li[2]/div[1]/label")).click();
     driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
      //  driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();



    }


    //   @Test(priority = 16)
    // void enterPostcode() {
    //   driver.findElement(By.xpath()).sendKeys("HA0 2EL");
    // }

    // @Test(priority = 17)
    // void EnterMobileNumber() {
    // driver.findElement(By.xpath("BillingNewAddress_PhoneNumber")).sendKeys("07597974740");
    // }


    //   @Test(priority = 18)
    // void clickContinue() {
    //   driver.findElement(By.xpath()).click();
    //}
    //  @AfterClass
    void close() {

        driver.close();
    }

}





