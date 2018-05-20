package pl.edu.agh.guitests.bdd.steps;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserManagmentSteps {

    private WebDriver driver;

    @Before
    public void setUp() {
    	System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8000/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    
    @Given("^user goes to login page$")
    public void user_goes_to_login_page() throws Throwable {
    	driver.findElement(By.linkText("Login")).click();
    }
    
    @When("^user types \"([^\"]*)\" login$")
    public void user_types_login(String login) throws Throwable {
    	driver.findElement(By.id("id_login")).clear();
		driver.findElement(By.id("id_login")).sendKeys(login);
    }
    
    @When("^user types \"([^\"]*)\" password$")
    public void user_types_password(String password) throws Throwable {
    	driver.findElement(By.id("id_password")).clear();
		driver.findElement(By.id("id_password")).sendKeys(password);
    }

    @When("^user clicks \"([^\"]*)\" button$")
    public void user_clicks_button(String buttonText) throws Throwable {
    	driver.findElement(By.xpath("//input[@value=\""+buttonText+"\"]")).click();
    }

    @Then("^it should be logged as \"([^\"]*)\"$")  
    public void user_should_be_logged_as(String expectedLoggedUserText) throws Throwable {
    	assertTrue(driver.getPageSource().contains(
				"Logged as " + expectedLoggedUserText));
    }
    
    @Then("^it should show error message stating that \"([^\"]*)\"$")  
    public void logging_error_message_is_displayed(String loggingErrorMessage) throws Throwable {
    	assertTrue(driver.getPageSource().contains(loggingErrorMessage));
    }
   
    
}
