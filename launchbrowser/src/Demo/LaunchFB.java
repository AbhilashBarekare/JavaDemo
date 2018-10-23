package Demo;

import org.openqa.selenium.By;

public class LaunchFB extends TestBase {
	
	public static void main(String[] args) {
		TestBase tb = new TestBase();
		tb.initializeDriver("chrome");
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.className("inputtext")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='Log In']"));
		//driver.findElement(By.id("u_0_8")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.partialLinkText("Forgot"))
		//driver.quit();
		
		
	}

}
