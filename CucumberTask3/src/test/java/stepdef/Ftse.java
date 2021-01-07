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

public class Ftse {
	
	private static WebDriver driver;
	
	private static String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";
	
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
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/risers"); 
	}
	@When("^Search for first value$")
	public void search_for_first_value() throws Throwable {
		 // declare webdriver instance
		
		driver.get(URL); //
		String innerText = driver.findElement(By.xpath("//*[@id=\"ls-row-NXT-L\"]/td[1]")).getText();
		System.out.println(innerText);
	    
	}

	@Then("^first value is found$")
	public void first_value_is_found() throws Throwable {
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/fallers"); //
		String innerText1 = driver.findElement(By.xpath("//*[@id=\"ls-row-ABF-L\"]/td[1]")).getText();
		System.out.println(innerText1);
	}



}