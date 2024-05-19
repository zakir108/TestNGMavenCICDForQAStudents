
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.beans.Transient;
import org.testng.annotations.Test;


public class TestNGBAsics {

    String url = "https://demo.guru99.com/telecom/addcustomer.php";
    //WebDriver driver;
    private static RemoteWebDriver driver;

    @BeforeSuite
    public void Initialization(){
        driver = new ChromeDriver();
        driver.get(url);    
    }

    @BeforeTest
    public void SetURL()
    {
           
    }
    //Test without Password// Test case-1
    @Test(priority = 1)
    public void TestDone()
    {   
        WebElement element2 = driver.findElement(By.xpath("//*[@id='main']/div/form/div/div[1]/label"));        
        element2.click();
       

        WebElement fname = driver.findElement(By.id("fname"));
        fname.sendKeys("Abu");       
        WebElement lname = driver.findElement(By.id("lname"));        
        lname.sendKeys("Clinton");

        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        
       
        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("abu@gmail.com");
        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
       
        WebElement phone = driver.findElement(By.id("telephoneno"));
        phone.sendKeys("12345");

        WebElement address = driver.findElement(By.name("addr"));
        address.sendKeys("California");
        
        WebElement submitButton = driver.findElement(By.name("submit"));
        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        submitButton.click();        
    }
    @Test(priority = 0)
    public void TestNotDone()
    {   
        WebElement Ndone = driver.findElement(By.xpath("//*[@id='main']/div/form/div/div[2]/label"));        
        Ndone.click();
    }
    @AfterTest
    public void CloseBrowser()
    {   
        driver.close();        
    }
    @AfterSuite
    public void QuitBrowser()
    {   
        driver.quit();
    }
}
