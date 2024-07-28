package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class googlesearchsteps {

	WebDriver driver = null;

	@Given("browser open")
	public void browser_open() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/sri/eclipse-workspace/Cucumberjavaa/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}

	@When("user enters text")
	public void user_enters_text() throws InterruptedException {
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Datinfi solutions");
		Thread.sleep(4000);

	}

	@When("hits enter")
	public void hits_enter() {
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys(Keys.ENTER);

	}

	@Then("user is with results")
	public void user_is_with_results() {
		driver.getPageSource().contains(
				"Address: Indiqube Echo, Avinashi Rd, TNHB Colony, Indira Nagar, Civil Aerodrome Post, Coimbatore, Tamil Nadu 641014");
		driver.close();
		driver.quit();
	}

}
