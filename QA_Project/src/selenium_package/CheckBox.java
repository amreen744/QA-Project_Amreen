package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	   
	        browserObject.findElement(By.name("bike")).click();
	        browserObject.findElement(By.name("car")).click();
	        browserObject.findElement(By.name("boat")).click();
	        browserObject.findElement(By.name("horse")).click();
	        
	        browserObject.findElement(By.name("submit")).click();

	}

}