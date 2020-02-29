package Automobilesite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class triggerwebsite {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
//open the website
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
//go to Automobile		
		 dr.findElement(By.id("nav_automobile")).click();
//go to make	
		Select sel = new Select( dr.findElement(By.id("make")));
		sel.selectByIndex(1);
//go to engineperformance		
	dr.findElement(By.id("engineperformance")).sendKeys("1000");
	
	//

	}
}