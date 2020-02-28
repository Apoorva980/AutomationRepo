package BasicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartScenario {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();// launching ka logic h woh constructor ke andar.

		dr.manage().window().maximize();// multiple lines me
		dr.get("https://www.flipkart.com/");
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		Actions act = new Actions(dr);

		WebElement ele = dr.findElement(By.xpath("//span[text()='Men']"));
		act.moveToElement(ele).build().perform();

		ele = dr.findElement(By.xpath("//a[text()='Shirts']"));
		ele.click();
		Thread.sleep(2000);
		ele = dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']"));
		act.dragAndDropBy(ele, 50, 0).build().perform();

		/*
		 * ele =
		 * dr.findElement(By.xpath("//div[@class=_3G9WVX _2N3EuE]/div[@class='_3aQU3C']"
		 * )); act.dragAndDropBy(ele, -100, 0);
		 */

		Thread.sleep(2000);

		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();

		String parent = dr.getWindowHandle();

		Set<String> wins = dr.getWindowHandles();

		for (String w : wins) {
			if (!w.equals(parent))
				dr.switchTo().window(w);
		}

		System.out.println(dr.findElements(By.xpath("//div[text()='Available offers']")).size());

		dr.close();

		Thread.sleep(2000);
		dr.switchTo().window(parent);

		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
	}
}