package StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;




public class Validatewebpage {

	
	@Given("Enter wesite url")
	public void Enter_wesite_url() {
		
		System.out.println("Inside Step - user Enters wesite url");
	
	//String projectPath = System.getProperty("user.dir");
		//System.out.println("Project path is : "+projectPath);
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
				System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.get("https://cms.demo.katalon.com/");
		//driver.manage().window().maximize();
		
	}

	@And("user is on katalon page")
	public void user_is_on_katalon_page() {
		
		System.out.println("Inside Step - user is on demo page page");
		
	
		
	}

	@When("read title page")
	public static void read_title_page() throws  IOException {
	
		System.out.println("Inside Step - read_title_page()");
		
		
	}

//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		
//		System.out.println("Inside Step - hits enter");
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//	}

	@Then("user is on expected Title page")
	public void user_is_on_expected_Title_page() {
		
		System.out.println("Inside Step - user is expected page");
		
		//driver.getPageSource().contains("Online Courses");
	
		WebDriver driver = new FirefoxDriver();
		driver.close();
	}
}
