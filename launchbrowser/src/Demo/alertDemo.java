package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class alertDemo extends TestBase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestBase tb=new TestBase();
		tb.initializeDriver("chrome");
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("10");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		/*System.out.println(driver.switchTo().alert().getText());
		//System.out.println(driver.getTitle());
//		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();*/
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		
		
		

	}

}
