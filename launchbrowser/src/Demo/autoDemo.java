package Demo;

import java.io.IOException;

import org.openqa.selenium.By;

public class autoDemo extends TestBase {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		TestBase tb = new TestBase();
		tb.initializeDriver("chrome");
		driver.get("http://the-internet.herokuapp.com/upload");
		
		/*driver.findElement(By.id("postjob")).click();
		driver.findElement(By.id("input_3")).sendKeys("Test");
		driver.findElement(By.id("input_4")).sendKeys("abc@abc.com");
		driver.findElement(By.id("input_5")).click();*/
		driver.findElement(By.name("file")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\Abhilash\\Documents\\FileUpload.exe");
		Thread.sleep(2000);
		/*driver.findElement(By.id("input_6")).sendKeys("Testing");
		driver.findElement(By.id("input_2")).click();*/
		
		driver.findElement(By.xpath("//input[@value='Upload']")).click();
		/*tb.waitUntil(driver.findElement(By.xpath("//strong[contains(text(),'Thank You!')]")));
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Thank You!')]")).getText());*/

	}

}
