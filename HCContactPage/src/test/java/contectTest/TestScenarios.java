package contectTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import contactInfo.ContactHC;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScenarios {

	WebDriver driver;
	
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.healthcourse.com/contact/");
	}
	
	@Test
	public void verifySubmit() {
		ContactHC hc = new ContactHC(driver);
		hc.clickcookies();
		hc.namebox();
		hc.companybox();
		hc.emailbox();
		hc.numberbox();
		hc.messagebox();
		hc.verifysubmit();
	}
	
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
