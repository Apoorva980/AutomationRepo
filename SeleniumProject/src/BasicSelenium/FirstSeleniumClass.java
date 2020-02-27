package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();// launching ka logic h woh constructor ke andar.
		
		dr.manage().window().maximize();// multiple lines me
		dr.get("https://www.flipkart.com/");
		
		WebElement ele = dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		
		ele.click();
		//dr.close();
		
		dr.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("mobiles");
	
		dr.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		WebElement firstResult = dr.findElement(By.xpath("//div[text()='Realme 5i (Forest Green, 64 GB)']"));

		String text = firstResult.getText();
		
		System.out.println(text);
}
}
