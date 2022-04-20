package StepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;
import org.junit.Assert;

public class Productprice {
	
	WebDriver driver=BaseClass.driver;
	
	String[][] pp; 
	
	@When("user have the following product list for price validation")
	public void user_have_the_following_product_list_for_price_validation(io.cucumber.datatable.DataTable dataTable) {
		
		pp= new String[dataTable.height()][2];
		for(int i=0;i<dataTable.height();i++)
		{
			pp[i][0]=dataTable.cell(i, 0);
			pp[i][1]=dataTable.cell(i,1);
			
		}
	    
	}

	@Then("user validate the all the products price")
	public void user_validate_the_all_the_products_price() {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> productname=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		List<WebElement> productprice=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		for(int count=0;count<productprice.size();count++)
		{	
			for(int i=0;i<pp.length;i++)
			{
				
				if(pp[i][0].equals(productname.get(count).getText()))
				{
					Assert.assertEquals(productprice.get(count).getText(), pp[i][1]);
					
				}
			}
		
		
		}
	}

}
