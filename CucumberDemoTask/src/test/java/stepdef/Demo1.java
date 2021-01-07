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

public class Demo1 {
	
	private static WebDriver driver;
	
	private static String URL = "http://thedemosite.co.uk/savedata.php";
	
	@Before
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe"); // set driver path
	    driver = new ChromeDriver(); 
	}
	
	@After
	public void cleanUp() {
		//driver.quit();
	}
	
	@Given("^Open the create page$")
	public void open_the_create_page() throws Throwable {
		driver.get(URL);
	    
	}

	@When("^Input information$")
	public void input_information() throws Throwable {
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		
		username.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");
        
        WebElement save = driver.findElement(By.name("FormsButton2"));
        
        username.sendKeys("david1010");					
        password.sendKeys("test");					
        save.click();	
	    
	}

	@Then("^A user will be created$")
	public void a_user_will_be_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^The login page opens$")
	public void the_login_page_opens() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^A user will be logged in$")
	public void a_user_will_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}