package bstack;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bstackpageclass {
	WebDriver driver;
	
	public bstackpageclass(WebDriver driver) {
		this.driver=driver;
	}
	
	public void demologin() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
	}
	public void imagenotloadinguser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='image_not_loading_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	public void existingordersuser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='existing_orders_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	public void favuser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='fav_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	public void lockeduser() {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='locked_user']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		
	}
	
	public void logout() {
		driver.findElement(By.id("signin")).click();
	}
	
	public void addtocart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class=\"float-cart__close-btn\"]")).click();
		
	}
	
	public void deleteitemfromcart() {
		driver.findElement(By.cssSelector("span[class=\"bag bag--float-cart-closed\"]")).click();
		driver.findElement(By.cssSelector("div[class=\"shelf-item__del\"]")).click();
		
	}
	
	public void shippingaddress() {
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
		driver.findElement(By.cssSelector("div[class=\"buy-btn\"]")).click();
		WebElement firstname = driver.findElement(By.id("firstNameInput"));
		firstname.sendKeys("ROHITH");
		firstname.sendKeys(Keys.ENTER);
		
		WebElement lastname = driver.findElement(By.id("lastNameInput"));
		lastname.sendKeys("RASOTI");
		lastname.sendKeys(Keys.ENTER);
		
		WebElement address = driver.findElement(By.id("addressLine1Input"));
		address.sendKeys("HYDERABAD");
		address.sendKeys(Keys.ENTER);
		
		WebElement state = driver.findElement(By.id("provinceInput"));
		state.sendKeys("TELANGANA");
		state.sendKeys(Keys.ENTER);
		
		WebElement pin = driver.findElement(By.id("postCodeInput"));
		pin.sendKeys("500043");
		pin.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("checkout-shipping-continue")).click();
		
		driver.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	}
	
	public void search() {
		driver.findElement(By.cssSelector("img[class=\"Navbar_logo__image__3Blki\"]")).click();
		WebElement search = driver.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		search.sendKeys("Oneplus");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("button[class=\"px-4 py-1 bg-gray-100 border border-l-0 border-gray-300\"]")).click();
		
	}
	
	public void apple() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[1]/label/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[1]/label/span")).click();

		 

	}
	
	public void samsung() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[2]/label/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[2]/label/span")).click();


	}
	
	public void google() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[3]/label/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[3]/label/span")).click();


	}
	
	public void oneplus() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[4]/label/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[4]/label/span")).click();


	}
	
	public void favourites() {
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[1]/button/span[1]")).click();
		driver.findElement(By.id("favourites")).click();
		
	}
	
	public void offers() {
		driver.findElement(By.id("offers")).click();
	}
	
	public void orderBy() {
		driver.findElement(By.cssSelector("img[class=\"Navbar_logo__image__3Blki\"]")).click();
		driver.findElement(By.cssSelector("select>option[value=\"lowestprice\"]")).click();
		
	}

	
	
}
