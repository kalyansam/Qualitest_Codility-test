package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Viewmycard {
	public static WebDriver driver;
	@When("user views on wishlist table")
public void viewwishlist(){
		WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[3]/div[1]/div/div/a/i"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
	
			}

	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement((By) By.xpath("/html/body/div[3]/div[3]/div/div/div/div/section[4]/div/div/div/div/div/div/div/ul/li[3]/a[2]")).click();
		System.out.println("clicks on login button");
	}

}
