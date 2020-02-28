package BasicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDown1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https:/www.naukri.com/");

		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		dr.findElement(By.xpath("//div[text()='Jobs']")).click();
		
	dr.findElement(By.xpath("//a[@title='All Jobs']")).click();
	
	
	
	}

}
