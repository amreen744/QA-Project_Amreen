package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	      ChromeDriver  browserObject = new ChromeDriver();
		
	        browserObject.get("https://www.google.com/");
	        browserObject.findElement(By.name("q")).sendKeys("Selenium python");
	        browserObject.findElement(By.name("btnK")).click();

	}

}
