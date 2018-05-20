package pl.edu.agh.guitests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsersManagementTest {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	
	@Test
	  public void testLoginLogout() throws Exception {
	    driver.get("http://127.0.0.1:8000/");
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("id_login")).click();
	    driver.findElement(By.id("id_login")).clear();
	    driver.findElement(By.id("id_login")).sendKeys("jnowak");
	    driver.findElement(By.id("id_password")).clear();
	    driver.findElement(By.id("id_password")).sendKeys("jnowak1234");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    driver.findElement(By.linkText("Logout")).click();
	  }
	
	
	
	 @Test
	  public void testAddingNewUser() throws Exception {
	    driver.get("http://127.0.0.1:8000/");
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("id_login")).click();
	    driver.findElement(By.id("id_login")).clear();
	    driver.findElement(By.id("id_login")).sendKeys("jnowak");
	    driver.findElement(By.id("id_password")).clear();
	    driver.findElement(By.id("id_password")).sendKeys("jnowak1234");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    driver.findElement(By.id("id_create_button")).click();
	    driver.findElement(By.id("id_first_name")).click();
	    driver.findElement(By.id("id_first_name")).clear();
	    driver.findElement(By.id("id_first_name")).sendKeys("Stefan");
	    driver.findElement(By.id("id_last_name")).clear();
	    driver.findElement(By.id("id_last_name")).sendKeys("Batory");
	    driver.findElement(By.id("id_login")).clear();
	    driver.findElement(By.id("id_login")).sendKeys("sbatory");
	    driver.findElement(By.id("id_password")).clear();
	    driver.findElement(By.id("id_password")).sendKeys("sbatory@wp.pl");
	    driver.findElement(By.id("id_password")).click();
	    driver.findElement(By.id("id_password")).clear();
	    driver.findElement(By.id("id_password")).sendKeys("sbatory1234");
	    driver.findElement(By.id("id_email")).clear();
	    driver.findElement(By.id("id_email")).sendKeys("sbatory@wp.pl");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    assertEquals("Batory", driver.findElement(By.xpath("//td[3]")).getText());
	    driver.findElement(By.linkText("Logout")).click();
	  }
	 
	 
	  @Test
	  public void testEditingUser() throws Exception {
	    driver.get("http://127.0.0.1:8000/");
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("id_login")).click();
	    driver.findElement(By.id("id_login")).clear();
	    driver.findElement(By.id("id_login")).sendKeys("jnowak");
	    driver.findElement(By.id("id_password")).clear();
	    driver.findElement(By.id("id_password")).sendKeys("jnowak1234");
	    driver.findElement(By.id("login-form")).submit();
	    driver.findElement(By.id("id_edit_button_4")).click();
	    driver.findElement(By.id("id_first_name")).click();
	    driver.findElement(By.id("id_first_name")).clear();
	    driver.findElement(By.id("id_first_name")).sendKeys("Stefania");
	    driver.findElement(By.id("id_login")).click();
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.findElement(By.linkText("Logout")).click();
	  }
	  
	  
	  @Test
	  public void testRemovingAUser() throws Exception {
	    driver.get("http://127.0.0.1:8000/");
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("id_login")).click();
	    driver.findElement(By.id("id_login")).clear();
	    driver.findElement(By.id("id_login")).sendKeys("jnowak");
	    driver.findElement(By.id("id_password")).clear();
	    driver.findElement(By.id("id_password")).sendKeys("jnowak1234");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    driver.findElement(By.id("id_delete_button_4")).click();
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.findElement(By.linkText("Logout")).click();
	  }

	

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
