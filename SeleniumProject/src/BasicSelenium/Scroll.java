package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("file:///C:/Users/SONY/Downloads/Practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		
		WebElement ele = dr.findElement(By.tagName("button"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);//you have to remember this code
		
		ele.click();
		
		Alert alt = dr.switchTo().alert();
		
		System.out.println(alt.getText());
		
		//alt.accept();
		Thread.sleep(5000);
		alt.dismiss();
		
		dr.close();
	}
}
