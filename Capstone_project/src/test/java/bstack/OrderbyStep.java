package bstack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderbyStep {
	WebDriver driver;

@Given("open website bstack")
public void open_websiteeeee() {
	 driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("orderBy")
public void order_by() {
	 bstackpageclass pg = new bstackpageclass(driver);
	 pg.orderBy();
}

@Then("sorted by prices")
public void soretd_by_prces() {
    System.out.println("soretd by prces");
    driver.close();
}




}
