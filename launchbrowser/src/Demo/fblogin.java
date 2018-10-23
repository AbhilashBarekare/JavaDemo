package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class fblogin extends TestBase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestBase tb = new TestBase();
		tb.initializeDriver("chrome");
		driver.get("https://www.facebook.com/");
		
		/*//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.className("inputtext")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("12345");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("ball");
		//driver.findElement(By.id("day")).s
		
		Select s=new Select(driver.findElement(By.id("day")));
		
		Thread.sleep(2000);
		s.selectByValue("3");
		Thread.sleep(2000);
		
		Select s1=new Select(driver.findElement(By.id("month")));
		s1.selectByIndex(4);
		Thread.sleep(2000);
		Select s2=new Select(driver.findElement(By.id("year")));
		s2.selectByVisibleText("2015");*/
		tb.setText(driver.findElement(By.name("firstname")),"sigsgvgi");
		tb.setText(driver.findElement(By.name("lastname")), "wgfuwiefgi");
		tb.setText(driver.findElement(By.name("reg_email__")), "5775357375");
		tb.setText(driver.findElement(By.name("reg_passwd__")), "79255hsfh");
		
		tb.selectDropdown(driver.findElement(By.id("day")), "12","value");
		tb.selectDropdown(driver.findElement(By.id("month")), "5", "value");
		tb.selectDropdown(driver.findElement(By.id("year")), "6", "index");
		
		driver.findElement(By.name("websubmit")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Please choose a gender')]")).getText());
		//driver.findElement(By.id("u_0_8")).click();
	
	}

}
