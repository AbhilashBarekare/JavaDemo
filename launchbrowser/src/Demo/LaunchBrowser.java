package Demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser extends TestBase{
	
	
	
	public static void main(String[] args) throws InterruptedException {
		TestBase tb = new TestBase();
		tb.initializeDriver("chrome");
				//Thread.sleep(2000);
		//driver.manage().window().setPosition(new Point(-2000, 0));
		driver.get("https://www.guru99.com/java-inheritance-polymorphism.html");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
