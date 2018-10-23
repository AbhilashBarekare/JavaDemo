package Demo;

import org.openqa.selenium.By;

public class frame extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBase tb=new TestBase();
		tb.initializeDriver("chrome");
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("RemoteCommand")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("DefaultRemoteCommand")).click();
		

	}

}
