package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	   
	      WebElement con=  browserObject.findElement(By.name("country"));
	      
      Select cn = new Select(con);
      cn.selectByVisibleText("India");
      Thread.sleep(4000);
      
      Select skill= new Select(browserObject.findElement(By.name("skill")));
      skill.selectByVisibleText("Quality Assurance");
      skill.selectByVisibleText("Programming");
      Thread.sleep(4000);
      browserObject.findElement(By.name("submit")).click();
      
      

	}

}
