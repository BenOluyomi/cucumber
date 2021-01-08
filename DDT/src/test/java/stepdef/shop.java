package stepdef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class shop {
	
	private static WebDriver driver;
	
	private static String URL = "http://automationpractice.com/index.php";
	
	@Before
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe"); // set driver path
		driver = new ChromeDriver();
	}
	
	@After
	public void cleanUp() {
		driver.quit();
	} 
	
	@Given("^Open the page$")
	public void open_the_page() throws Throwable {
		driver.get(URL);
	    
	}

	@When("^Search for Dress$")
	public void search_for_Dress() throws Throwable {
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		WebElement search = driver.findElement(By.name("submit_search"));							
	    search.click();
	    
	}

	@Then("^Printed summer dress will be shown$")
	public void printed_summer_dress_will_be_shown() throws Throwable {
		driver.getPageSource().contains("Printed Summer Dress");
	    
	}



}