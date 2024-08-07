package Steps;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class SecondopinionSTEPS {

	WebDriver driver;
	
	@Given("open the browser, enter the sparsh hospital url")
	public void open_the_browser_enter_the_sparsh_hospital_url() {
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sparshhospital.com/");
		
	}

	@Given("select Yashwanthpur hospital from the hospital dropdown")
	public void select_yashwanthpur_hospital_from_the_hospital_dropdown() {
	    
		driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[3]")).click();
		driver.findElement(By.xpath("(//a[@href='https://www.sparshhospital.com/hospitals/sparsh-hospital-yeswanthpur/'])[1]")).click();		
		
	}

	@When("user clicks the second opinion link")
	public void user_clicks_the_second_opinion_link() throws InterruptedException {
	    
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		jsExecutor.executeScript("arguments[0].click()", driver.findElement(By.xpath("(//a[@href='https://www.sparshhospital.com/second-opinion/'])[1]")));
		
		
		
	}

	@When("user enters the Firstname Lastname Phonenumber Email")
	public void user_enters_the_firstname_lastname_phonenumber_email() {
	    
		driver.findElement(By.id("secondopinion_first_name")).sendKeys("Raja");
		driver.findElement(By.id("secondopinion_last_name")).sendKeys("Mondal");
		driver.findElement(By.id("secondopinion_phone")).sendKeys("8062486702");
		driver.findElement(By.id("secondopinion_email")).sendKeys("rajamondal123@gmail.com");
		
	}

	@When("Uploads the report and Enters a message and clicks the send button")
	public void uploads_the_report_and_enters_a_message_and_clicks_the_send_button() {
	    
		driver.findElement(By.id("secondopinion_reports")).sendKeys("C:\\Users\\User\\Desktop\\TestUPLOAD.docx");
		driver.findElement(By.id("secondopinion_message")).sendKeys("I like living in the UK. People are always polite and friendly, which makes me feel welcome.");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click()", driver.findElement(By.id("secondopinion_submit")));
		
		
	}

	@Then("Thankyou message should be displayed")
	public void thankyou_message_should_be_displayed() {
	    
		String Text = driver.findElement(By.xpath("//h1[@class='font-700 mb-4']")).getText();
		String textExpectedString = "Thank you";
		org.testng.Assert.assertEquals(Text, textExpectedString);
		
	}

	@Then("bank info should be available in the page")
	public void bank_info_should_be_available_in_the_page() {
	    
		String Bankname = driver.findElement(By.xpath("(//div[@class='col-md-12 p-4'])[2]/p[3]")).getText();
		String BanknameExpected = "Bank Name: Bank of Baroda";
		org.testng.Assert.assertEquals(Bankname, BanknameExpected);
		driver.close();
		
	}
}
