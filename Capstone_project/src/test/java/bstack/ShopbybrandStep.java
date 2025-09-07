package bstack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopbybrandStep {
	WebDriver driver;


@Given("website is openeddd")
public void website_is_openeddd() {
	driver = new ChromeDriver();
    driver.get("https://bstackdemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("shopbybrand")
public void shopbybrand() {
	 bstackpageclass pg = new bstackpageclass(driver);
	 pg.samsung();
	 pg.apple();
	 pg.oneplus();
	 pg.google();

}

@Then("sorted by brands")
public void sorted_by_brands() {
    System.out.println("sorted by brands");
    driver.close();
    
}




}
