package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("https://paytm.com");
		dr.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS );
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		Thread.sleep(5000);
		//dr.switchTo().frame(0);
	
		
		dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();

}
}