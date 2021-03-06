package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public static WebDriver driver;
	
	public WebDriver initializeDriver(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilash\\Desktop\\jjjjjjjjjjjjjjjjj''\\chromedriver.exe");
			// TODO Auto-generated method stub
			driver =new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhilash\\Desktop\\jjjjjjjjjjjjjjjjj''\\MicrosoftWebDriver");
			// TODO Auto-generated method stub
			WebDriver driver =new FirefoxDriver();
		
		}
		else if(browser.equalsIgnoreCase("internetexplorer"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhilash\\Desktop\\jjjjjjjjjjjjjjjjj''\\MicrosoftWebDriver");
			// TODO Auto-generated method stub
			WebDriver driver =new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
		
		
		
	}
	public void setText(WebElement obj, String value){
		obj.sendKeys(value);
	}
	public void performClick(WebElement obj){
		obj.click();
	}
	public void selectDropdown(WebElement obj,String value,String ValueType){
	   Select s=new Select(obj);
	   if(ValueType.equals("text"))
	   {
		   s.selectByVisibleText(value);
	   }
	   else  if(ValueType.equals("value"))
	   {
		   s.selectByValue(value);
	   }
	   else if(ValueType.equals("index"))
	   {
		   s.selectByIndex(Integer.parseInt(value));
	   }
	}
	
	public void waitUntil(WebElement obj){
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(obj));
	}

}
