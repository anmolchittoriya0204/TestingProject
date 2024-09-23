package core.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {
	
	WebDriver driver;
	
	public WebDriver  setupChrome() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
	    return driver= new ChromeDriver();
	    
	    
	
	    
	}

}
