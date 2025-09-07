package bstack;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class buyStep {
	WebDriver driver;

@Given("open webbsite and login")
public void open_webbsite_and_login() {
	 driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
}

@When("buy")
public void buy() {
	bstackpageclass pg = new bstackpageclass(driver);
    pg.demologin();
    pg.shippingaddress();
}

@Then("ordered sucessfully")
public void orderd_sucessfully() {
    System.out.println("orderd sucessfully");
    driver.close();
}




}
