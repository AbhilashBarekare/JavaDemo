package Demo;

import org.openqa.selenium.By;

public class spiceJet extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBase tb=new TestBase();
		tb.initializeDriver("chrome");
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();

	}

}
