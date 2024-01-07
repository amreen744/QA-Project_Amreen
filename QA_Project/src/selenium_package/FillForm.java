package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	       browserObject.findElement(By.name("name")).sendKeys("Amreen");
	       
	       browserObject.findElement(By.name("email")).sendKeys("amreen@gmail.com");
	       
	       browserObject.findElement(By.name("website")).sendKeys("http://training.qaonlinetraining.com/testPage.php");
	       
	       browserObject.findElement(By.name("comment")).sendKeys("QA training platform");
	       
	       // radio button 
	       browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	       
	       browserObject.findElement(By.name("submit")).click();
	       

	      
		
	}
	
	
}
