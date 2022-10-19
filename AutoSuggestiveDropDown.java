package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Asukabi\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();		
		
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		driver.findElement(By.id("myInput")).sendKeys("Av");				//	SEARCH USING AV
		driver.findElement(By.id("myInput")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("myInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit-button")).click();   				//	TO CLICK SUBMIT BUTTON.
		
		
	

		
		
	}
	

}

