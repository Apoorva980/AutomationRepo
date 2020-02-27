package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClassSelenium {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
		
		WebElement ele = dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		
		ele.click();
		
		dr.findElement(By.xpath("//Input[@placeholder='Search for products, brands and more']")).sendKeys("mobile");
		
		
		
		
}
}