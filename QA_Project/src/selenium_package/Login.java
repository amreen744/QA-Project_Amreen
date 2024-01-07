package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	        
	      WebElement email=  browserObject.findElement(By.xpath("//*[@id=\"Email\"]"));
	      email.clear();
	      email.sendKeys("admin@yourstore.com");
	        
	      WebElement pass = browserObject.findElement(By.id("Password"));
	      pass.clear();
	      pass.sendKeys("admin");
	        Thread.sleep(4000);
	        browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();

	}

}
