package basics_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	private WebDriver driver ;
	
	
	 @BeforeSuite
	  public void initDriverBeforeSuite() throws Exception {
		  System.out.println("BeforeSuite");
		  
		  driver = new FirefoxDriver();
	  }
	 
	 
	 @Test
	  public void myTestMethod() {
		  System.out.println("TEST 2");
		  final String searchKey = "TestNG";
	        System.out.println("Search " + searchKey + " in google");
	       
	        driver.navigate().to("http://www.google.com");
	        WebElement element = driver.findElement(By.name("q"));
	        System.out.println("Enter " + searchKey);
	        element.sendKeys(searchKey);
	        System.out.println("submit");
	        element.submit();
	        
	        System.out.println("Got " + searchKey + " results");
	        
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("BeforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("AfterMethod");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("BeforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("AfterClass");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("BeforeTest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("AfterTest");
	  }

	 

	  @AfterSuite
	  public void QuitDriverAfterSuite() throws Exception {
		  System.out.println("AfterSuite - Used to Quit drivers");
		  driver.quit();
	  }

}
