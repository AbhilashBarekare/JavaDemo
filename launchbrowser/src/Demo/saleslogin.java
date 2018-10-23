package Demo;

import org.openqa.selenium.By;

public class saleslogin extends TestBase{
	
		
		public static void main(String[] args) throws InterruptedException {
			TestBase tb = new TestBase();
			tb.initializeDriver("chrome");
			driver.get("https://login.salesforce.com/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			/*driver.findElement(By.name("username")).sendKeys("abcd");
			//Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("1234");
			//Thread.sleep(2000);
			driver.findElement(By.id("Login")).click();
			//driver.findElement(By.className("button r4 wide primary")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("error")).getText());
			driver.findElement(By.linkText("Forgot Your Password?")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("un")).sendKeys("612345");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Need Help Logging In?")).click();
			Thread.sleep(2000);
			//driver.quit();
			driver.findElement(By.id("rememberUn")).click();*/
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("cgajcgjag");
			driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("6665654556");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-lg btn-light salesforce-sans-regular    ']")).click();
			
		}

	}


