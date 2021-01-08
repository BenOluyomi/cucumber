package stepdef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		//driver.quit();
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
	
	@Given("^Can enter email and rest of info$")
	public void can_enter_email_and_rest_of_info() throws Throwable {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email_create")).sendKeys("fakemail123@yahoo.com");
		WebElement create = driver.findElement(By.name("SubmitCreate"));							
	    create.click();
	    
	    
	    
	    //driver.findElement(By.id("customer_firstname")).sendKeys("Adam");
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")));
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")).sendKeys("Jenkins");
	    driver.findElement(By.name("customer_lastname")).sendKeys("Ladrek");
	    driver.findElement(By.name("passwd")).sendKeys("PassWord123");
	    driver.findElement(By.name("days")).sendKeys("1");
	    driver.findElement(By.name("months")).sendKeys("January");
	    driver.findElement(By.name("years")).sendKeys("2002");
	    driver.findElement(By.name("years")).sendKeys("2002");
	    driver.findElement(By.name("company")).sendKeys("QA Consulting");
	    driver.findElement(By.name("address1")).sendKeys("23 kings avenue");
	    driver.findElement(By.name("city")).sendKeys("london");
	    driver.findElement(By.name("id_state")).sendKeys("alabama");
	    driver.findElement(By.name("postcode")).sendKeys("12345");
	    
	    driver.findElement(By.name("phone_mobile")).sendKeys("1234567890");
	    driver.findElement(By.name("alias")).sendKeys("cheese");
	    WebElement sub = driver.findElement(By.name("submitAccount"));							
	    sub.click();
	}

	@When("^login details entered$")
	public void login_details_entered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user can login$")
	public void user_can_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}