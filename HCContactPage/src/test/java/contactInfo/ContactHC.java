package contactInfo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHC {

	WebDriver driver;
	
	public ContactHC(WebDriver driver) {
		this.driver = driver;
	}
	
	By allcookies = By.id("onetrust-accept-btn-handler");
	By entername = By.id("et_pb_contact_name_0");
	By entercompany = By.xpath("//input[@id='et_pb_contact_company_0']");
	By enteremail = By.xpath("//input[@id='et_pb_contact_email_0']");
	By phonenumber = By.xpath("//input[@id='et_pb_contact_phone_number_0']");
	By entermessage = By.name("et_pb_contact_message_0");
	By submitbutton = By.name("et_builder_submit_button");
	
	public void clickcookies() {
		driver.findElement(allcookies).click();
		
	}
	public void namebox() {
		driver.findElement(entername).sendKeys("qainterview");
	}
	public void companybox() {
		driver.findElement(entercompany).sendKeys("realcme");
	}
	public void emailbox() {
		driver.findElement(enteremail).sendKeys("winie@tryninja.io");
	}
	public void numberbox() {
		driver.findElement(phonenumber).sendKeys("9999999999");
	}
	public void messagebox() {
		driver.findElement(entermessage).sendKeys("This is an assignment for the QA position. Please ignore.");
	}
	
	public void verifysubmit() {
		driver.findElement(submitbutton).click();
		String title = driver.getTitle();
		assertEquals(title, "success");
	}
}
