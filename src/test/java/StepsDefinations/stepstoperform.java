package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepstoperform {
	WebDriver driver;

	@Given("Launching the browser firefox browser")
	public void Launching_the_browser_firefox_browser() {
		// Driver path
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		// driver.navigate().to("https://www.saucedemo.com/");
		driver.get("https://www.saucedemo.com/");

		System.out.println("Given: statement is executed correctly");
	}

	@When("validating the current url and pagetitle of the application")
	public void validating_the_current_url_and_pagetitle_of_the_application() {
		String restitle = driver.getTitle();
		System.out.println("Title of the page is : " + restitle);
	}

	@Then("Enter username and password field to perform login")
	public void Enter_username_and_password_field_to_perform_login() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("testdata");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testdata123");

	}

	@And("Click on login")
	public void Click_on_login() {
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		if (driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3/button"))
				.isDisplayed()) {
			System.out.println("Please provide the valid credentials");
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3/button")).click();
		}

	}

}
