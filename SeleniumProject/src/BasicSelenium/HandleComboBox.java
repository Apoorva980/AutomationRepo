package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleComboBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("file:///C:/Users/SONY/Downloads/Practice.html");
		
		WebElement ele=dr.findElement(By.id("anand"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		
		Thread.sleep(2000);
		sel.deselectByIndex(3);
		
	
	}

}
