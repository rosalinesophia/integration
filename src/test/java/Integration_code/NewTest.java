package Integration_code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
  
	  driver.findElement(By.name("userName")).sendKeys("sophia");
	  driver.findElement(By.name("password")).sendKeys("sophia");
	  driver.findElement(By.name("login")).click();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  Assert.assertTrue(driver.getTitle().contains("Sign-on"));
	  driver.close();
	  
  }

}
