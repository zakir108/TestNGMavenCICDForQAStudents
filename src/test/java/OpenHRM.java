import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.beans.Transient;
import org.testng.annotations.Test;


public class OpenHRM {
	
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver;

	@Test(priority = 2)
	public void launchApp1() throws InterruptedException {
			
			
			driver.get(baseUrl);
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
					
			
			String actualTitle = driver.getTitle();
			String expectedTitle = ("OrangeHRM");
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(actualTitle, expectedTitle);

			
	}
	
	@Test(priority = 3)
	public void AddAfrined()
	{
		int friend = 186;
		///
		//
		//
	}
	@Test(groups = "TestFriendRequest")
	public void CountTotalFriend()
	{
		int countFromSelenium = 187-1;
		Assert.assertEquals(187,countFromSelenium);
	}
	@Test(groups = "TestFriendRequest")
	public void UnfriendAfrined()
	{
		int friend = 186;
		//
		//
		//
	}
	@Test(groups = "TestFriendRequest")
	public void CountTotalFriend1()
	{
		int countFromSelenium = 187-1;
		Assert.assertEquals(187,countFromSelenium);
	}

	@AfterTest
	public void LogOut() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
    }
	
	
	@BeforeTest
	public void Initialization(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void launchApp() throws InterruptedException {
			
			
			driver.get(baseUrl);
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
					
			
			String actualTitle = driver.getTitle();
			String expectedTitle = ("OrangeHRM");
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(actualTitle, expectedTitle);

			
	} 
	
	
}