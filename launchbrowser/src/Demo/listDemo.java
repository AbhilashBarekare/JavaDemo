package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class listDemo extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBase tb=new TestBase();
		tb.initializeDriver("chrome");
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame("packageListFrame");
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		for (WebElement mylink : alllinks) {
			String xyz=mylink.getText();
			System.out.println(xyz);
			/*if(xyz.equals("com.thoughtworks.selenium.condition")){
				mylink.click();
			}*/
			
		}
		
		
	}

}
