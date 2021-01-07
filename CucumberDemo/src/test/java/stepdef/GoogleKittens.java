package stepdef;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleKittens {
	
	private static WebDriver driver;
	
	private static String URL = "https://www.google.com/";
	
	@Before
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe"); // set driver path
	    driver = new ChromeDriver(); 
	}
	
	@After
	public void cleanUp() {
		driver.quit();
	}
	
	@Given("^I can open Google$")
	public void i_can_open_Google() throws Throwable {
	   driver.get(URL);
	   assertEquals("Google", driver.getTitle());
	   System.out.println("Google is open");
	    
	}

	@When("^I search for kittens$")
	public void i_search_for_kittens() throws Throwable {
	    WebElement input = driver.findElement(By.name("q"));
	    input.sendKeys("kittens");
	    input.submit();
	    System.out.println("Searched for kittens");
	    
	}

	@Then("^Google will give me Kittens$")
	public void google_will_give_me_Kittens() throws Throwable {
	   driver.findElement(By.name("q")).clear();
	   driver.getPageSource().contains("kittens");
	   System.out.println("Found Kittens");
	    
	}

}