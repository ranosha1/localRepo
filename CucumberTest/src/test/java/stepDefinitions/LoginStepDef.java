package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDef {
	
	static WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void User_is_already_on_Login_Page()throws Throwable{
		System.setProperty("webdriver.chrome.driver", "/Users/Rano/Documents/Libraries/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		
		// Hayrli TONG!!!
		//ISHLADI!!!!!!!!! faqat hozir 41st line ishlamayapti click_on_login_Button :)
		
		
	}
		
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	   driver.findElement(By.name("username")).sendKeys("naveenk");
	   driver.findElement(By.name("password")).sendKeys("test@123");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	  //  driver.findElement(By.className("btn btn-small")).click();
	    WebElement loginBtn=driver.findElement(By.xpath("//input[@class='btn btn-small']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", loginBtn);
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    String title=driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("CRMPRO", title);
	}

	
}
