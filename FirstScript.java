package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// **** SET PATH OF EXECUTABLE BROWSER DRIVERS ****
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Asukabi\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		//	TEMPLATE -----> OBJECT ----> PROPERTIES AND METHOD
		
		//	CREATING OBJECT
		WebDriver driver = new ChromeDriver();		// Parent p = new Child (parent --- WebDriver; child --- ChromerDriver)
		
//		driver.get("https://demoqa.com/automation-practice-form");			// OPENING URL	
//		
//		System.out.println(driver.getTitle());								// PRINT TITLE
//		
//		if (driver.getTitle().contains("ToolsQA")) {
//			System.out.println("TEST CASE PASS");
//		}
//		else {
//			System.out.println("TEST CASE FAIL");
//		}
//		
//		//	********* LOCATORS **********
//		
//		//	LOCATE BY ID ATTRIBUTE
//		driver.findElement(By.id("firstName")).sendKeys("kabindra");
//		driver.findElement(By.id("lastName")).sendKeys("adhikari");
//		
//		//	LOCATE BY name ATTRIBUTE
//		driver.findElement(By.name("gender"));
//		
//		//	LOCATE BY class ATTRIBUTE
//		driver.findElement(By.className("practice-form-wrapper"));
//		
//		//		LOCATE BY className ATTRIBUTE
//		driver.findElement(By.className("practice-form-wrapper"));
//		
		//		LOCATE BY linkText 
		driver.get("https://www.google.com/");			// OPENING NEW URL
		driver.findElement(By.linkText("About")).click();
		//driver.findElement(By.linkText("Sign in")).click();
		
		/*
		 * 	<a> Contact Us </a>
		 * partialLinkText ----- Contact
		 * linkText ------------ Contact Us
		 */
		
		
		
		
		//	CLOSING BROWSER
		driver.quit();								// CLOSING BROWSER
	
		
		
	}
	

}
