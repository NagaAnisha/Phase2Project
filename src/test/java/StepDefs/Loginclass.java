package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

import org.junit.Assert;


public class Loginclass {
	
	WebDriver driver=BaseClass.driver;
	
	@Given("user have opened the Swag Labs application in browser")
	public void user_have_opened_the_swag_labs_application_in_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com/");
	}
	
	@When("user enter username {string}")
	public void user_enter_username(String usr_name) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement usrname=driver.findElement(By.name("user-name"));
		usrname.sendKeys(usr_name);
	}

	@When("user enter password {string}")
	public void user_enter_password(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement usrname=driver.findElement(By.name("password"));
		usrname.sendKeys(pwd);
	}

	@When("user click on the login button")
	public void user_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
		
	}

	@Then("user should be landed on home page")
	public void user_should_be_landed_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement homepage=driver.findElement(By.xpath("//span[@class='title']"));
		Assert.assertEquals("PRODUCTS", homepage.getText());
		
	}
	
	@Then("user should get an error message {string}")
	public void user_should_get_an_error_message(String err_msg) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement msg=driver.findElement(By.xpath("//h3[@data-test='error']"));
		Assert.assertEquals(err_msg, msg.getText());
		
	}



}
