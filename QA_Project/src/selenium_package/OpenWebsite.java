package selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
			// 2. Initialize Webdriver object through ChromeDriver class.
		        ChromeDriver browserObject = new ChromeDriver();
			// 3. Open the http://www.google.com/ link using get method.
		        browserObject.get("http://www.amazon.com/");
	}

	}

