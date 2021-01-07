package stepdef;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
		driver.quit();
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
		 driver.getPageSource().contains("david1010");
	    
	}

	@Given("^The login page opens$")
	public void the_login_page_opens() throws Throwable {
		driver.get(URL+"/login.php");
		   //WebElement login = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
	       // login.click();
	}

	@Then("^A user will be logged in$")
	public void a_user_will_be_logged_in() throws Throwable {
		WebElement log = driver.findElement(By.name("FormsButton2"));					
        driver.findElement(By.name("username")).sendKeys("david1010");							
        driver.findElement(By.name("password")).sendKeys("test");							
        log.click();					
        System.out.println("Login Done with Submit");					
        driver.getPageSource().contains("**Successful Login**");
	}
	public static ChromeOptions chromeCfg() {
		Map<String, Object> prefs = new HashMap<String, Object>();
		ChromeOptions cOptions = new ChromeOptions();

		// Settings
		prefs.put("profile.default_content_setting_values.cookies", 2);
		prefs.put("network.cookie.cookieBehavior", 2);
		prefs.put("profile.block_third_party_cookies", true);

		// Create ChromeOptions to disable Cookies pop-up
		cOptions.setExperimentalOption("prefs", prefs);

		return cOptions;
	}


}